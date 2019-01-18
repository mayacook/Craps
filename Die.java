
/**
 * Class that stimulates rolling a die
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Die
{
    // instance variables - replace the example below with your own
    private int roll;

    /**
     * Constructor for objects of class Die
     */
    public Die(int roll)
    {
       roll = roll();
    }

    /**
     * Randomly rolls a die 
     *
     */
    public int roll()
    {
        roll = (int) (Math.random() *6 + 1) ; 
        return roll; 
    }
}
