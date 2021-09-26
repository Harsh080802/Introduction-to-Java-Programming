package Exercise03;
/*Authar@Harsh Patel (20CS050)
*(Game: scissor, rock, paper) Write a program that plays the popular scissor-rockpaper game. (A scissor can cut a paper, a rock can knock a scissor, and a paper can
*wrap a rock.) The program randomly generates a number 0, 1, or 2 representing
*scissor, rock, and paper. The program prompts the user to enter a number 0, 1, or
*2 and displays a message indicating whether the user or the computer wins, loses,
*or draws. Here are sample runs:
*/
import java.util.Random;
import java.util.Scanner;
public class Exercise03_17 {
        public static void main(String[] args) {
           //Creating object
            Scanner sc= new Scanner(System.in);
            Random r = new Random();
            System.out.println("Enter 0 for rock \n Enter 1 for paper \n Enter 2 for scissors ");
            int youp=0;
            int comp=0;
            int i;
            for(i=0;i<=5;i++) {
                System.out.println("It's your turn");
                int yt = sc.nextInt();
                // using enhance switch case
                switch (yt) {
                    case 0 -> System.out.println("You selected rock");
                    case 1 -> System.out.println("You selected paper");
                    case 2 -> System.out.println("You selected scissors");
                }
                System.out.println("It's computer's turn");
                int ct = r.nextInt(3);
                switch (ct) {
                    case 0 -> System.out.println("Computer has  selected rock");
                    case 1 -> System.out.println("Computer has selected paper");
                    case 2 -> System.out.println("Computer has selected scissors");
                }
                if (yt == ct) {
                    System.out.println("There is a tie.");
                } else if ((yt == 0 && ct == 2) || (yt == 1 && ct == 0) || (yt == 2 && ct == 1)) {
                    System.out.println("You have won");
                    youp = +1;
                } else {
                    System.out.println("You have lost");
                    comp = +1;
                }
            }
            if(youp==comp){
                System.out.println("The match is tied");
            }
            else if(youp>comp){
                System.out.println("Congratulations you have won the match");
            }
            else{
                System.out.println("Unfortunately you haven lost the match");
            }
        }
    }

