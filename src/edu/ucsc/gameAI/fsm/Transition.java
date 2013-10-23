/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucsc.gameAI.fsm;

import edu.ucsc.gameAI.IAction;
import edu.ucsc.gameAI.ICondition;
import pacman.game.Game;

/**
 *
 * @author Eric
 */
public class Transition implements ITransition{
    
    IState target;
    IAction action;
    ICondition condition;

    @Override
    public IState getTargetState() {
        return target;
    }

    @Override
    public void setTargetState(IState targetState) {
        target = targetState;
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
    public void setCondition(ICondition condition) {
        this.condition = condition;
    }

    @Override
    public boolean isTriggered(Game game) {
        return condition.test(game);
    }
    
}
