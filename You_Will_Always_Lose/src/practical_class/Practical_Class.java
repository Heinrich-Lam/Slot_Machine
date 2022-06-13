/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practical_class;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author user-pc
 */
public class Practical_Class {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
         Scanner Player_Numb = new Scanner(System.in);
         Random random = new Random();
           
         int Player_Bet, Credits, Numb1, Numb2, Numb3, Win, Lose;
         String playAgain;
         
         playAgain = "y";
         Scanner askPlayAgainScanner = new Scanner (System.in);
          
         Credits = 100;
         
         while(playAgain.equals("y")){

         System.out.println(" =============================================================================================== ");
         System.out.println("WELCOME TO YOU WILL ALWAYS LOSE");
         System.out.println(" =============================================================================================== ");
         System.out.println("WIN BIG OR GO HOME WITH NOTHING....");
         System.out.println(" =============================================================================================== ");
         System.out.println("GET 3 OF THE SAME NUMBER TO WILL DOUBBLE WHAT YOU PLAYED");
         System.out.println(" =============================================================================================== ");
         System.out.print("YOU CURRENTLY HAVE " + Credits + " CREDITS, HOW MUCH WOULD YOU LIKE TO PLAY : ");
         Player_Bet = Player_Numb.nextInt();
           
         System.out.println("YOU HAVE PLACED THE FOLLOWING AMOUT OF CREDTIS FOR THE GAME : \n" + Player_Bet + "\n");
           
         if(Player_Bet > Credits)
         {
             System.out.println("YOU SEEM TO BE TO BROKE TO DO THAT, GOOD BYE ");
             System.out.println("YOU HAVE CASHED OUT " + Credits);
             System.out.println("COME LOSE AGAIN SOON !!!!!!!! HAHAHAHAHAHAHAHA");
             break;
         }
         else if(Player_Bet < Credits)
         {
             System.out.println("YOU SEEM TO BE TO BROKE TO DO THAT, GOOD BYE ");
             System.out.println("YOU HAVE CASHED OUT " + Credits);
             System.out.println("COME LOSE AGAIN SOON !!!!!!!! HAHAHAHAHAHAHAHA");
             Credits = (Credits - Player_Bet);
             Numb1 = random.nextInt(8) + 1;
             Numb2 = random.nextInt(8) + 1;
             Numb3 = random.nextInt(8) + 1;
             System.out.println("YOUR NUMBERS ARE .......... \n" + Numb1 + " " + Numb2 + " " + Numb3);
            
             if(Numb1 == Numb2 && Numb1 == Numb3)
             {
                 Win = (Player_Bet * 2);
                 System.out.println("YOU HAVE WON " + Win + "credits");
             }
             else
             {
                 Lose = (Credits - Player_Bet);
                 System.out.println("YOU LOST THAT ONE !!!!!!!! HAHAHAHAHA");
             }
         }
             System.out.println("WOULD YOU LIKE TO PLAY AGAIN ????? Y/N : ");
             playAgain = askPlayAgainScanner.nextLine();
             
            while(playAgain.equals("n"))
            {
                 System.out.println("YOU HAVE CASHED OUT " + Credits + " CREDITS");
                 System.out.println("COME LOSE AGAIN SOON !!!!!!! HAHAHAHAHA");
                 break;
            }
         }
         }
    }
