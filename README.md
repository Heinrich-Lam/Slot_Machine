# Slot_Machine
I created a Slot machine program in Java. The user gets a set amount of Credtis and then they place a bet, the program then generates a set of three random numbers, if the numbers are the same then the player gets double the money back, if not then they loose and the lost credits will be deducted from the players total credits. There is also and option to cash out with your remaing credits.

Here is my code : 

public class Practical_Class {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Scanner to get user input.
        Scanner Player_Numb = new Scanner(System.in);
        Random random = new Random();//Random to generate the random numbers.

        //All the variables we will use.
        int Player_Bet, Credits, Numb1, Numb2, Numb3, Win, Lose;
        String playAgain;

        //String value that we will use for the loop in the program.
        playAgain = "y";
        Scanner askPlayAgainScanner = new Scanner(System.in);

        Credits = 100;//Setting the amount of credits the user has to 100.

        while (playAgain.equals("y")) {

            System.out.println(" =============================================================================================== ");
            System.out.println("WELCOME TO YOU WILL ALWAYS LOSE");
            System.out.println(" =============================================================================================== ");
            System.out.println("WIN BIG OR GO HOME WITH NOTHING....");
            System.out.println(" =============================================================================================== ");
            System.out.println("GET 3 OF THE SAME NUMBER TO WILL DOUBBLE WHAT YOU PLAYED");
            System.out.println(" =============================================================================================== ");
            System.out.print("YOU CURRENTLY HAVE " + Credits + " CREDITS, HOW MUCH WOULD YOU LIKE TO PLAY : ");
            Player_Bet = Player_Numb.nextInt();//Getting the players bet amount.

            System.out.println("YOU HAVE PLACED THE FOLLOWING AMOUT OF CREDTIS FOR THE GAME : \n" + Player_Bet + "\n");

            if (Player_Bet > Credits)//Condition if the player bets more credits than they have.
            {
                System.out.println("YOU SEEM TO BE TO BROKE TO DO THAT, GOOD BYE ");
                System.out.println("YOU HAVE CASHED OUT " + Credits);
                System.out.println("COME LOSE AGAIN SOON !!!!!!!! HAHAHAHAHAHAHAHA");
                break;//Force the program to end and then allowing the user to start over.
            } else if (Player_Bet < Credits) {
                System.out.println("YOU SEEM TO BE TO BROKE TO DO THAT, GOOD BYE ");
                System.out.println("YOU HAVE CASHED OUT " + Credits);
                System.out.println("COME LOSE AGAIN SOON !!!!!!!! HAHAHAHAHAHAHAHA");
                Credits = (Credits - Player_Bet);//Deducting the bet amount from the credits.
                //Generating the three number. We want them to be between 1 and 9.
                Numb1 = random.nextInt(8) + 1;
                Numb2 = random.nextInt(8) + 1;
                Numb3 = random.nextInt(8) + 1;
                //Printing the three generated numbers.
                System.out.println("YOUR NUMBERS ARE .......... \n" + Numb1 + " " + Numb2 + " " + Numb3);

                //Conditions to win the game.
                if (Numb1 == Numb2 && Numb1 == Numb3) {//If the player won, the bet they placed will be doubled and added to the players credit total.
                    Win = (Player_Bet * 2);
                    System.out.println("YOU HAVE WON " + Win + "credits");
                } else {//If the player lost, the bet will be deducted from the credit total.
                    Lose = (Credits - Player_Bet);
                    System.out.println("YOU LOST THAT ONE !!!!!!!! HAHAHAHAHA");
                }
            }
            //Then the user will be asked if they want to play again.    
            System.out.println("WOULD YOU LIKE TO PLAY AGAIN ????? Y/N : ");
            playAgain = askPlayAgainScanner.nextLine();
            //If the player types y, the program will restart with the players new credit total else, the program will stop and the user will cash out. 
            while (playAgain.equals("n")) {
                System.out.println("YOU HAVE CASHED OUT " + Credits + " CREDITS");
                System.out.println("COME LOSE AGAIN SOON !!!!!!! HAHAHAHAHA");
                break;
            }
        }
    }
}
