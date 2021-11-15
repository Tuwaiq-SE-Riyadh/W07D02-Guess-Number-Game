package JavaGame;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        System.out.print("PLease enter number tries: ");
        int numTries  = read.nextInt();
        int score=0;
        int tryNum;
        String str="";


        double randomNum;


        do{

            System.out.println("The user will have three options play, reset, end");
             str= read.next();
            switch (str){
                case "play":
                    for(int i=1;i<=numTries;i++){
                        randomNum=Math.random()*20;
                        System.out.print("geuss a number: ");
                        tryNum= read.nextInt();
                        if(tryNum==(int)randomNum){
                            score++;
                            System.out.println("Your score is: "+score);
                        }else
                        {
                            System.out.print("Geuss another number: ");
                            tryNum= read.nextInt();
                            numTries++;

                        }

                    }
                    System.out.println("Your Tries is finish");

                    if(score>=3){
                        System.out.println("yes You win :)");
                    }else
                        System.out.println("No You Lose :(");
                    if(numTries==0){
                        System.out.println("Game Over !");
                    }
                    break;
                case "reset":
                    System.out.print("PLease enter number tries: ");
                     numTries  = read.nextInt();
                    for(int i=1;i<=numTries;i++){
                        randomNum=Math.random()*20;
                        System.out.print("geuss a number: ");
                        tryNum= read.nextInt();
                        if(tryNum==(int)randomNum){
                            score++;
                            System.out.println("Your score is: "+score);
                        }else
                        {
                            System.out.print("Geuss another number: ");
                            tryNum= read.nextInt();
                            numTries++;
                        }

                    }
                    System.out.println("Your Tries is finish");

                    if(score>=3){
                        System.out.println("yes You win :)");
                    }else
                        System.out.println("No You Lose :(");
                    if(numTries==0){
                        System.out.println("Game Over !");
                    }

                    break;
                case "end":
                    str="exit";
                    break;

            }

        }while (str!="exit");

    }
}
