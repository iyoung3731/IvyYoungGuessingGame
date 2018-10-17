package IvyYoung;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("Hello! What's your name?");
        String name = input.nextLine();
        System.out.println("Hi " + name + "! Would you like to play <random guessing game> or <AI guessing game>?");
        String game = input.nextLine();
        if (game.equals("random guessing game")) {
            int num = (int)(50 * Math.random());
            System.out.println("Pick a number between 0-50, " + name);
            int guess = input.nextInt();
            if (guess == num) {
                System.out.println("Correct, " + name);
            }
            else
                System.out.println("Try again, " + name + ".");
            }
        else if (game.equals("AI guessing game")){
            System.out.println("Use <higher>, <lower>, or <correct>");
            int max = 100;
            int min = 0;

