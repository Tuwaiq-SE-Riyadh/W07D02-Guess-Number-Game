package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Random random =new Random();
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("Enter:\n1-Play\n2-Reset\n3-End");
            int x = in.nextInt();
            if (x != 1 && x != 2) {break;}


            int score = 0;

            System.out.println("Enter number of tries :");
            int tries = in.nextInt();
            while (true){
                int randomNum = random.nextInt(3);

                System.out.println("Guss a number:");
                int guss = in.nextInt();

                if(randomNum == guss){
                    score++;
                    System.out.println("Correct! The number is ("+randomNum+")\nThe number of tries left : "+tries+"\nScore="+score);
                    if(score == 3){
                        System.out.println("----- You wins -----");
                        break;
                    }
                }else {
                    tries--;
                    System.out.println("Incorrect! The number is ("+randomNum+")\nThe number of tries left : "+tries+"\nScore="+score);
                    if(tries == 0){
                        System.out.println("==== You lose the game ====");
                        break;
                    }
                }

            }
        }




    }
}
