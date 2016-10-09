/*
 * logicPuzzle
 * Created by Denise Perry
 * denisebperry@gmail.com
 * Jun 9, 2016
 */
package logicpuzzle;

import java.awt.Color;
import javax.swing.JButton;

/**
 * Creates a JButton that changes color from light grey to red to yellow to green, and then loops back around.
 * 
 * @author Denise
 */

class ColoredJButton extends JButton
{
    private final Color[] myColors;
    private int buttonStatus;

    /**
     * ColoredJButton - Created an instance of a ColoredJButton with no text.
     */
    public ColoredJButton()
    {
	this("");
    }

    /**
     * ColoredJButton - Created an instance of a ColoredJButton with the contents of String txt.
     * 
     * @param txt - A string containing text displayed on the button
     */
    public ColoredJButton(String txt)
    {
	super(txt);
	myColors = new Color[] {Color.LIGHT_GRAY, Color.RED, Color.YELLOW, Color.GREEN};
	buttonStatus = -1; //
	setNextColor();
    }
    
    /**
     * getStatus - Returns the status (in reference to the color) of the button.
     * 
     * @return buttonStatus - An int indicating the color in reference to the current position of in Color[] myColors
     * 0 = light grey
     * 1 = red
     * 2 = yellow
     * 3 = green
     */
    public int getStatus()
    {
	return buttonStatus;
    }

    /**
     * setNextColor - Changes the color of the button to the next color in line.
     */
    public void setNextColor()
    {
	buttonStatus++;
	buttonStatus %= 4;
	this.setBackground(myColors[buttonStatus]);
    }

    /**
     * setPrevColor - Changes the color of the button to the previous color in line
     * 
     * NOTE: Meant to be used with an undo feature that has yet to be written.
     */
    public void setPrevColor()
    {
	buttonStatus--;
	buttonStatus %= 4;
	this.setBackground(myColors[buttonStatus]);
    }
    
    /**
     * setColor - Changes the button's color to specified value,
     *		  regardless of its current color.
     * 
     * @param color - The value of the wanted color
     * 0 = light grey
     * 1 = red
     * 2 = yellow
     * 3 = green
     */
    public void setColor(int color)
    {
	switch(color)
	{
	    case 0:
		setDefault();
		break;
	    case 1:
		setRed();
		break;
	    case 2:
		setYellow();
		break;
	    case 3:
		setGreen();
		break;
	}
    }

    /**
     * setRed - Changes the button's color to red, regardless of its current color.
     */
    private void setRed()
    {
	buttonStatus = 0;
	setNextColor();
    }
    
    /**
     * setGreen - Changes the button's color to green, regardless of its current color.
     */
    private void setGreen()
    {
	buttonStatus = 2;
	setNextColor();
    }
    
    /**
     * setYellow - Changes the button's color to yellow, regardless of its current color.
     */
    private void setYellow()
    {
	buttonStatus = 1;
	setNextColor();
    }
    
    /**
     * setDefault - Changes the button's color to light grey, regardless of its current color.
     */
    private void setDefault()
    {
	buttonStatus = -1;
	setNextColor();
    }
}