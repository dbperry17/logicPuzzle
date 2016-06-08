/*
 * logicPuzzle
 * Created by Denise Perry
 * denisebperry@gmail.com
 * Jun 7, 2016
 */
package logicpuzzle;

/**
 *
 * @author Denise
 */
public class counter
{
    private int clicks;

    public counter()
    {
	clicks = 0;
    }
    
    public int getCount()
    {
	return clicks;
    }
    
    public void resetCount()
    {
	clicks = 0;
    }
    
    public void incCount()
    {
	clicks++;
    }
    
    public void redCount()
    {
	clicks = 0;
    }
    
    public void greenCount()
    {
	clicks = 3;
    }
}
