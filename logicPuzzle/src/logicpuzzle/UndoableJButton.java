/*
 * logicPuzzle
 * Created by Denise Perry
 * denisebperry@gmail.com
 * Jun 9, 2016
 */
package logicpuzzle;

import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.event.UndoableEditEvent;
import javax.swing.event.UndoableEditListener;

/**
 *
 * @author Denise
 */

class UndoableJButton extends JButton
{
    private UndoableEditListener listener;
    private final Color[] myColors;
    private int buttonStatus;
    private boolean forceChange;

    public UndoableJButton()
    {
	this("");
    }

    // For this example, we'll just provide one constructor . . .
    public UndoableJButton(String txt)
    {
	super(txt);
	myColors = new Color[] {Color.LIGHT_GRAY, Color.RED, Color.YELLOW, Color.GREEN};
	buttonStatus = -1;
	setNextColor();
	forceChange = false;
    }
    
    public int getStatus()
    {
	return buttonStatus;
    }

    public void setNextColor()
    {
	buttonStatus++;
	buttonStatus %= 4;
	this.setBackground(myColors[buttonStatus]);
	forceChange = false;
    }

    public void setPrevColor()
    {
	buttonStatus--;
	buttonStatus %= 4;
	this.setBackground(myColors[buttonStatus]);
	forceChange = false;
    }

    public void setRed()
    {
	buttonStatus = 0;
	setNextColor();
	forceChange = true;
    }
    
    public void setGreen()
    {
	buttonStatus = 2;
	setNextColor();
    }
    
    public void setYellow()
    {
	buttonStatus = 1;
	setNextColor();
    }
    
    public void setDefault()
    {
	buttonStatus = -1;
	setNextColor();
	forceChange = true;
    }
    
    public boolean wasForced()
    {
	return forceChange;
    }

    // Set the UndoableEditListener.
    public void addUndoableEditListener(UndoableEditListener l)
    {
      listener = l; // Should ideally throw an exception if listener != null
    }

    // Remove the UndoableEditListener.
    public void removeUndoableEditListener(UndoableEditListener l)
    {
      listener = null;
    }

    // We override this method to call the super implementation first (to fire
    // the
    // action event) and then fire a new UndoableEditEvent to our listener.
    @Override
    protected void fireActionPerformed(ActionEvent ev)
    {

	// Fire the ActionEvent as usual.
	super.fireActionPerformed(ev);

	if (listener != null)
	{
	    listener.undoableEditHappened(new UndoableEditEvent(this,
					  new UndoableToggleEdit(this)));
	}
    }
}