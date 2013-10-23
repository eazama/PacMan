/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucsc.gameAI.fsm;

import edu.ucsc.gameAI.IAction;
import java.util.Collection;

/**
 *
 * @author Eric
 */
public class State implements IState{

    IAction action;
    IAction entryAction;
    IAction exitAction;
    Collection<ITransition> transitions;
    
    @Override
    public IAction getAction() {
        return action;
    }

    @Override
    public void setAction(IAction action) {
        this.action = action;
    }

    @Override
    public IAction getEntryAction() {
        return entryAction;
    }

    @Override
    public void setEntryAction(IAction action) {
        entryAction = action;
    }

    @Override
    public IAction getExitAction() {
        return exitAction;
    }

    @Override
    public void setExitAction(IAction action) {
        exitAction = action;
    }

    @Override
    public Collection<ITransition> getTransitions() {
        return transitions;
    }

    @Override
    public void setTransitions(Collection<ITransition> trans) {
        transitions = trans;
    }
    
}
