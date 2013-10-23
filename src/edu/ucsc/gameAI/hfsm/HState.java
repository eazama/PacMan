/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucsc.gameAI.hfsm;

import edu.ucsc.gameAI.IAction;
import java.util.Collection;
import pacman.game.Game;

/**
 *
 * @author Eric
 */
public class HState implements IHState{

    String name;
    IAction action;
    IAction entryAction;
    IAction exitAction;
    Collection<IHState> states;
    Collection<IHTransition> trans;
    IHFSM parent;
    public HState(String name){
        this.name = name;
    }
    @Override
    public Collection<IHState> getStates() {
        return states;
    }

    @Override
    public void setStates(Collection<IHState> states) {
        this.states = states;
    }

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
    public Collection<IHTransition> getTransitions() {
        return trans;
    }

    @Override
    public void setTransitions(Collection<IHTransition> transitions) {
        trans = transitions;
    }

    @Override
    public void addTransition(IHTransition transition) {
        if(trans == null){
            trans = new java.util.Vector<IHTransition>();
        }
        trans.add(transition);
    }

    @Override
    public IHFSM getParent() {
        return parent;
    }

    @Override
    public void setParent(IHFSM parent) {
        this.parent = parent;
    }

    @Override
    public IResult update(Game game) {
        IResult ret = new Result();
        ret.addAction(action);
        ret.setTransition(null);
        ret.setLevel(0);
        return ret;
    }
    
}
