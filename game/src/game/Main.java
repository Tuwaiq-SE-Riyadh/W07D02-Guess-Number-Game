package game;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        The task is to write a Java program in which a user will get number of trials to guess
//          a randomly generated number between 0 to 20.
//        Below are the rules of the game:
//        Player will be asked to enter number of tries based on the number of tries the player can geuss.
//                The user will have three options (play, reset, end).
//                when enter play:
//        player will geuss a number if it is same as actual number score will increase
//        if the number is not the same player will can enter another number
//        if the player have score 3 or more he wins else lose
//        The game is over when the number of tries is 0
//        when enter reset:
//        it will start new game
//        when enter end it will exit the game.
        int num = (int) (0 + (Math.random() * (20 - 0)));
        System.out.println(num);
        Scanner input = new Scanner(System.in);
        int tries = 5;
        System.out.println("The number of tries is:" +tries);
        System.out.println("Enter 0 to play, 1 to reset and 2 to end");
        int choice = input.nextInt();
        boolean flag = true;
        int score =0;

        while (flag){
            for (int i = 0; i < tries; i++) {
                if (choice==0){
                    System.out.println("Ques the number!\uD83E\uDD14");
                    int inputNum = input.nextInt();
                    flag = play(num,inputNum,score);
                    if (!flag){
                        score++;
                        break;
                    }
                }else if (choice==1){
                    num = (int) (0 + (Math.random() * (20 - 0)));
                    i=0;
                    System.out.println("Enter 0 to play, 1 to reset and 2 to end");
                    choice = input.nextInt();
                }else if (choice==2){
                    flag = false;
                    break;
                }
            }
            flag = false;
        }
        System.out.println("score "+score);

    }
    public static boolean play(int num1, int num2, int score){
        if (num1 == num2){
            System.out.println("Correct!\uD83D\uDE0E");

            if (score ==3)
                System.out.println("Winner! \uD83E\uDD73 \uD83E\uDD73");

            return false;
        }else {
            System.out.println("unCorrect \uD83D\uDE1B");
        }
        return true;
    }
}
