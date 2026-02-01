
package dsa;

import java.util.Scanner;
import java.util.Random;

public class Dsa
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int num = rd.nextInt(101);

        System.out.println("*****Number Choosing Game *****");

        int loop = 3;
        int choice = 0;

        do
        {
            System.out.println("Enter 1 to Play the Game ! ");
            System.out.println("Enter 2 to exit the game ");
             choice = sc.nextInt();

            switch (choice)
            {
                case 1 ->
                {
                    for (int i = 1; i <= loop; i++)
                    {
                        System.out.println("Guess the number From 1 to 100 : ");
                        int nm = sc.nextInt();

                        if (num > nm)
                        {
                            System.out.println("The guess is too HIGH");
                            System.out.println("You have " + (loop - i) + " Chances");
                        }
                        else if (num < nm)
                        {
                            System.out.println("The guess is too LOW");
                            System.out.println("You have " + (loop - i) + " Chances");
                        }
                        else if (num == nm)
                        {
                            System.out.println("Correct ! You Won");
                            System.out.println("You Won in " + i + " Attempt !");
                        }

                      
                    }
                    System.out.println(num + " This is the number to been Guessed !");
                }

                case 2 ->
                {
                    System.out.println("Exited !!! ");
                }
            }

        } while (choice != 2);
          
    }
}
