/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucsc.gameAI.hfsm;

import edu.ucsc.gameAI.IAction;
import java.util.Collection;

/**
 *
 * @author Eric
 */
public class Result implements IResult{

    int level;
    IHTransition trans = null;
    Collection<IAction> actions = null;
    @Override
    public Collection<IAction> getActions() {
        return actions;
    }

    @Override
    public void setActions(Collection<IAction> actions) {
        this.actions = actions;
    }

    @Override
    public void addAction(IAction action) {
        if(actions == null){
            actions = new java.util.Vector<IAction>();
        }
        if(action == null){
            return;
        }
        actions.add(action);
    }

    @Override
    public void addActions(Collection<IAction> actions) {
        this.actions.addAll(actions);
    }

    @Override
    public IHTransition getTransition() {
        return trans;
    }

    @Override
    public void setTransition(IHTransition transition) {
        trans = transition;
    }

    @Override
    public int getLevel() {
        return level;
    }

    @Override
    public void setLevel(int level) {
        this.level = level;
    }
    
}
