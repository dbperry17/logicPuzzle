/*
 * logicPuzzle
 * Created by Denise Perry
 * denisebperry@gmail.com
 * Jun 9, 2016
 */
package logicpuzzle;

import java.awt.Color;
import java.io.Serializable;
import javax.swing.JButton;

/**
 * Creates a JButton that changes color from light grey to red to yellow to green, and then loops back around.
 * 
 * @author Denise
 */

class ColoredJButton extends JButton implements Serializable
{
    private final Color[] myColors = new Color[] {Color.LIGHT_GRAY, Color.RED, Color.YELLOW, Color.GREEN};
    private int status;
    private String nameVar;

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
	setColor(0);
	nameVar = txt;
    }
    
    /**
     * getNameVar - Returns the text of the button
     * 
     * Used for testing purposes
     * 
     * @return nameVar
     */
    public String getNameVar()
    {
	return nameVar;
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
	return status;
    }

    /**
     * setNextColor - Changes the color of the button to the next color in line.
     */
    public void setNextColor()
    {
	status++;
	status %= 4;
	this.setBackground(myColors[status]);
    }

    /**
     * setPrevColor - Changes the color of the button to the previous color in line
     */
    public void setPrevColor()
    {
	status--;
	status %= 4;
	this.setBackground(myColors[status]);
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
		status = -1;
		break;
	    case 1:
		status = 0;
		break;
	    case 2:
		status = 1;
		break;
	    case 3:
		status = 2;
		break;
	}
	
	setNextColor();
    }
    
    /**
    * getColors - Returns array myColors
    * 
    * Used for bean purposes only.
    * 
    * @return myColors;
    */
    public Color[] getColors()
    {
	return myColors;
    }
}