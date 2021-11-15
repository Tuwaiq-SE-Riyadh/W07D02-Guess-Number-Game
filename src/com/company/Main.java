package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tries;
        int choose;
        int guess;

        System.out.println("Enter \n 1: to play. \n 2: to reset \n 0: to end");
        choose = input.nextInt();
        while (choose != 0) {
            System.out.println("How many tries you demand");
            tries = input.nextInt();
            while (tries > 0) {
                System.out.println("--------------------------------------------");
                int random = (int) ((Math.random() * (21 - 1)) + 1);
                System.out.println("guess a number");
                guess = input.nextInt();
                if (guess == random) {
                    System.out.println("Your guessing True, YOU WON!!");
                } else {
                    System.out.println("Your guessing False, The number is " + random + " YOU LOST:(");
                    --tries;
                }
            }
            System.out.println("Enter \n 1: to play. \n 2: to reset \n 0: to end");
            choose = input.nextInt();
        }
        System.out.println("thank you.");

    }
}
