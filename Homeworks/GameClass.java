
package rockpaperscissors;

import java.util.Random;
import java.util.Scanner;
import java.util.random.RandomGeneratorFactory;


public class GameClass 
{
    
        Scanner sc = new Scanner(System.in);
    
    void game()
    {
        Random r = new Random();
        
        System.out.println("1 FOR ROCK");
        System.out.println("2 FOR SCISSORS");
        System.out.println("3 FOR PAPER");
        System.out.println("ENTER UR CHOICE");
        int userChoice=sc.nextInt();
        
        int computerChoice = r.nextInt(3) + 1; 

        System.out.println("Computer Choice: " + computerChoice);

        if (userChoice == computerChoice) 
        {
            System.out.println("DRAW");
        }

        else if (userChoice == 1 && computerChoice == 3) 
        {
            System.out.println("YOU WIN (ROCK beats SCISSORS)");
        }

        else if (userChoice == 2 && computerChoice == 1) 
        {
            System.out.println("YOU WIN (PAPER beats ROCK)");
        }

        else if (userChoice == 3 && computerChoice == 2) 
        {
            System.out.println("YOU WIN (SCISSORS beats PAPER)");
        }

        else {
            System.out.println("COMPUTER WINS");
        }
    
        
        
    
    
    
    
    
    }

}
