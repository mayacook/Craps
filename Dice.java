
/**
 * Rolls two Dice objects 
 *
 * @author Maya Cook
 * @version 01-18-19
 */
public class Dice
{
    // instance variables - replace the example below with your own
    private Die d1;
    private Die d2; 

    /**
     * Constructor for objects of class Dice
     */
    public Dice()
    {
        // initialise instance variables
        d1 = new Die(); 
        d2 = new Die(); 
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int[] rollTwo()
    {
        int [] result = {d1.roll(), d2.roll()};  
        return result; 
    }
    /*
    public int showRoll(int[] result)
    {
        int showRoll = 0; 
        for(int roll = 0; roll < result.length; roll++)
        {
            showRoll += result[roll]; 
        }
        return showRoll;
    }
    */
}
