
/**
 * Simulates a game of craps 
 *
 * @author Maya Cook
 * @version 01-18-19
 */

import java.util.Scanner; 
public class Craps
{
    /**
     * This method asks the user if they want to play craps 
     * @return answer to the question 
     */
    public static boolean wannaPlay()
    { 
        Scanner in = new Scanner(System.in); 
        System.out.println("Do you want to play craps?(y/n) ");
        String answer = in.nextLine(); 
        if(answer.equals("") ||answer.substring(0,1).equalsIgnoreCase("y")) 
        {
            return true;
        }
        return false;
    }

    /**
     * This method gives the user instructions 
     */
    public static void giveInstructions() 
    {
        System.out.println("+---------------------INSTRUCTIONS----------------------+");
        System.out.println("|1.Roll two six-sided die.                              |");
        System.out.println("|    a. If you roll a 7 or 11, you win!                 |"); 
        System.out.println("|    b. If you roll a 2,3, or 12, you lose :(           |");
        System.out.println("|    c. Ant other number you roll becomes your 'point'  |");
        System.out.println("|2. Keep rolling the dice until:                        |");
        System.out.println("|    a. You roll your initial 'point' and win the game  |"); 
        System.out.println("|    b. Or... you roll a 7 and lose the game! :(        |");
        System.out.println("+-------------------------------------------------------+");
    }

    public static void main(String[] args)
    {
        Dice dice = new Dice(); 
        int totalPlay = 0;
        while(wannaPlay()) //loop will break if answer is no 
        {
            if(totalPlay == 0)
            {
                System.out.println("");
                System.out.println("Let's get started!");
                System.out.println("");
                Scanner in = new Scanner(System.in); 
                System.out.println("Would you like instructions(y/n): "); 
                String ans = in.nextLine(); 
                if(ans.equals("") || ans.substring(0,1).equalsIgnoreCase("y"))
                {
                    giveInstructions(); 
                }
            }
            Scanner in = new Scanner(System.in);
            System.out.println("Ready to play?");
            System.out.println("");
            System.out.println("<Enter> for first roll..."); 
            in.nextLine(); 
            int myRoll1 = 0; 
            int [] diceRoll = dice.rollTwo(); 
            for(int i = 0; i < diceRoll.length; i++) //for loop totals roll values in 'myRoll1'
            {
                myRoll1 += diceRoll[i];
            }
            System.out.println("--------FIRST ROLL-------+");
            //following two if statements only for formatting purposes 
            if(myRoll1 < 10)
            {
                System.out.println("You rolled a " + myRoll1 + "           |");
            }
            if(myRoll1 >= 10)
            {
                System.out.println("You rolled a " + myRoll1 + "          |");
            }
            if(myRoll1 == 7 || myRoll1 == 11)
            {
                System.out.println("                         |");
                System.out.println("       +--------+        |");
                System.out.println("       |You win!|        |");
                System.out.println("       +--------+        |");
                System.out.println("                         |");
            }
            else if(myRoll1 == 2 || myRoll1 == 3 || myRoll1 == 12)
            {
                System.out.println("                         |");
                System.out.println("      +----------+       |");
                System.out.println("      |You loose!|       |");
                System.out.println("      +----------+       |");
                System.out.println("                         |");
            }
            else
            { 
                int myRoll2 = 0; 
                while(myRoll2 != myRoll1) //will break if roll 2 is equal to roll 1 
                {
                    System.out.println("                         |");
                    System.out.println("<Enter> to roll again    |"); 
                    in.nextLine(); 
                    int[] diceRoll2 = dice.rollTwo(); 
                    for(int i = 0; i < diceRoll2.length; i++)
                    {
                        myRoll2 += diceRoll2[i];
                    }
                    System.out.println("---------NEW ROLL--------+");
                    //following two if statements only for formatting purposes 
                    if(myRoll2 < 10)
                    {
                        System.out.println("You rolled a " + myRoll2 + "           |");
                    }
                    if(myRoll2 >= 10)
                    {
                        System.out.println("You rolled a " + myRoll2 + "          |");
                    }
                    if(myRoll2 == 7) 
                    {
                        System.out.println("                         |");
                        System.out.println("      +----------+       |");
                        System.out.println("      |You loose!|       |");
                        System.out.println("      +----------+       |");
                        System.out.println("                         |");
                        break;
                    }
                    else if(myRoll2 != myRoll1) //sets myRoll2 back to zero for next roll
                    {
                        myRoll2 = 0; 
                    }
                }
                if(myRoll2 == myRoll1)
                {
                    System.out.println("                         |");
                    System.out.println("       +--------+        |");
                    System.out.println("       |You win!|        |");
                    System.out.println("       +--------+        |");
                    System.out.println("                         |");
                }   
            }
            System.out.println("-------------------------+");
            totalPlay ++;
        } 

        System.out.println("");
        System.out.println("Have a nice day!"); 
        System.out.println(""); 
        System.out.println("Program terminating...");
    }
}

