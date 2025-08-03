import  java. util.Scanner;
import java.util.Random;

class numberGame{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int score = 0;
        System.out.print("enter number of rounds  ");
        int rounds = sc.nextInt();
        for(int round =1; round<=rounds; round++ ){
            int numberGuess = random.nextInt(100)+1;
            int maxAttempts =  10;
            
            System.out.println("\n round  " + round);
            System.out.println("guess the number between  1 and 100  you have  "  +  maxAttempts + " attempts.");
            for(int attempt =1; attempt <=maxAttempts; attempt++)
            {
            System.out.print("enter your guess: ");
                int userGuess = sc.nextInt();
            if(userGuess == numberGuess){
                System.out.println(" correct your guess number" +  " " + attempt    +   "  " + "attempts");
                score ++;
                break;
            }   else if(userGuess > numberGuess){
                    System.out.println("too high");
            }else{
                System.out.println("too low");

            }
            if(attempt == maxAttempts){
                System.out.println("out of attempts the number was " + numberGuess);

            }
            }

            }
            System.out.println("\n game over  your final score is  " + score  + "/" + rounds);

        }

    }
