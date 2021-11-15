package numberGame;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Guess the number game");
        System.out.print("Please enter [play], [reset] or [end] :");
        String userInput = sc.next();

        switch (userInput)
        {
            case "play":
                System.out.println("--- Start The Game ---");
                play();
                break;

            case "reset":
                System.out.println("--- Reset The Game ---");
                play();
                break;

            case "end":
                System.out.println("--- The Game is End ---");
                break;

            default:
                System.out.println("Error input!");
        }

    }

    private static void play()
    {
        Scanner sc = new Scanner(System.in);

        int tries = 3;
        int questionCount = 1;
        int randomNumber ;
        int userInput;
        int score = 0;
        boolean flag = true;

        while (flag)
        {
            randomNumber = (int) (Math.random() * 20);
            System.out.print("Q:"+questionCount + " Try to guess from 0 to 20 :");
//            System.out.println("Hint" + randomNumber);
            userInput = sc.nextInt();
            if(userInput == randomNumber)
            {
                System.out.println("Right Guess!");
                score ++;
            }
            else
            {
                tries --;
                System.out.print("Wrong! but try another one :");
                userInput = sc.nextInt();
                if(userInput == randomNumber)
                {
                    System.out.println("Right !!!");
                    score ++;
                }
                else
                {
                    System.out.println("Another Wrong !!! ");
                }
            }
            questionCount++;

            if(tries == 0)
            {
                if(score >= 3)
                {
                    System.out.println("Win !!");
                }
                else
                {
                    System.out.println("Game Over : Lose");
                }
                flag = false;
            }
        }
    }
}
