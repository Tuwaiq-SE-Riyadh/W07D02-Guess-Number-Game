package com.company;
import java.util.*;

 class Guess {
     public static void main(String[] args) {
         guess();

     }

     public static void guess() {
         Scanner in = new Scanner(System.in);
         System.out.println("enter score limit");
//is scor <=3 in question
         int scorelimit = in.nextInt();
         System.out.println("enter limit");
         //is *random
         int limit = in.nextInt();


         int randomnumber = (int) (Math.random() * limit);

         int winscore = 0;
         int losingscore = 0;

         String choice;
         while (true) {
             System.out.println("enter play ,reset,exit ");
             String whattodo = in.next();

             if (whattodo.equals("play")) {
                 System.out.println("please guess number");
                 int guess = in.nextInt();

                 if (guess == randomnumber) {
                     System.out.println("you guess number");
                     winscore++;
                     if (winscore == scorelimit) {
                         System.out.println("win");
                         break;
                     }
                 } else {
                     losingscore++;
                     if (losingscore == scorelimit)
                         System.out.println("lose");
                 }

             } else if (whattodo.equals("reset")) {
                 winscore = 0;
                 losingscore = 0;
             } else if (whattodo.equals("end")) {
                 break;
             } else {
                 System.out.println("please enter vaild option");

             }
         }
     }
 }


