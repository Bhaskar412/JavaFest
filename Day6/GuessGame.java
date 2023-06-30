import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {
        guessNumberGame();
        System.out.println("Game Over :)");
    }

   public static void guessNumberGame() {

       Scanner scn = new Scanner(System.in);
       int num = (int) (10 * Math.random());
       int i, guess;

       int playagain;

       do {
           boolean check = true;

           System.out.println("Welcome to Number Guess Game!");
           System.out.println("Please enter a number between 0 to 10");
           while (check) {
               guess = scn.nextInt();
               if (num == guess) {
                   System.out.println("Congratulations.. you guessed the number");
                   check = false;
                   break;
               } else if (num > guess) {
                   System.out.println("Number is greater than guess : " + guess);
                   System.out.println("Please guess number greater than : " + guess);
               } else if (num < guess) {
                   System.out.println("Number is less than guess : " + guess);
                   System.out.println("Please guess number less than : " + guess);
               }

           }

           System.out.println("Do you wanna play again? " + "press 1");
           playagain = scn.nextInt();
           if (playagain == 1)
               check = true;

       }while (playagain==1);
   }

}
