/*
 * logicPuzzle
 * Created by Denise Perry
 * denisebperry@gmail.com
 * Jun 9, 2016
 */
package logicpuzzle;

import javax.swing.undo.AbstractUndoableEdit;
import javax.swing.undo.CannotRedoException;
import javax.swing.undo.CannotUndoException;

/**
 *
 * @author Denise
 */
class UndoableToggleEdit extends AbstractUndoableEdit
{
    public UndoableToggleEdit(UndoableJButton button){};
    
    /**
     * redo - Redo by setting the button state as it was initially.
     * 
     * @throws CannotRedoException 
     */
    @Override
    public void redo() throws CannotRedoException{};

    /**
     * undo - Undo by setting the button state to the opposite value.
     * 
     * @throws CannotUndoException 
     */
    @Override
    public void undo() throws CannotUndoException{};
};
