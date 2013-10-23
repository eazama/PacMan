/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucsc.gameAI.hfsm;

import edu.ucsc.gameAI.IAction;
import edu.ucsc.gameAI.ICondition;
import pacman.game.Game;

/**
 *
 * @author Eric
 */
public class HTransition implements IHTransition{

    IHState state;
    ICondition condition;
    IAction action;
    int level;
    public HTransition(IHState state, ICondition condition){
        this.state = state;
        this.condition = condition;
    }
    @Override
    public IHState getTargetState() {
        return state;
    }

    @Override
    public void setTargetState(IHState targetState) {
        state = targetState;
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

    @Override
    public int getLevel() {
        return level;
    }

    @Override
    public void setLevel(int level) {
        this.level = level;
    }
    
}
