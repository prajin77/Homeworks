
//Rock Paper Scissors Game – Program Question
//Question:
//Write a Java console application for the Rock Paper Scissors game where:
//User enters choice:
//1 → Rock
//2 → Paper
//3 → Scissors
//Computer randomly generates a choice.
//Display the winner based on the rules.
//Game Rules
//Rock beats Scissors
//Scissors beats Paper
//Paper beats Rock


package rockpaperscissors;

import java.util.Scanner;


public class MainRockPaperScissors 
{

  
    public static void main(String[] args) 
    {
        
        
        Scanner sc = new Scanner (System.in);
        Scanner sc1 = new Scanner (System.in);
        
        int choice ;
        
        do
        {
            System.out.println("WELCOME TO THE GAME");
            System.out.println("1 TO ENTER THE GAME");
            System.out.println("2 TO EXIT THE GAME");
            System.out.println("ENTER UR CHOICE");
            choice =sc.nextInt();
            
            switch(choice)
            {
                case 1 :
                {
                    System.out.println("U R IN THE GAME PORTAL");
                    GameClass gc = new GameClass();
                    gc.game();
                    
                    
                    
                    
                
                break;
                }
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            }
            
        }while(choice!=2);
        


    }

}
