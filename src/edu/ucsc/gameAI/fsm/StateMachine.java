/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucsc.gameAI.fsm;

import edu.ucsc.gameAI.IAction;
import java.util.Collection;
import java.util.LinkedList;
import pacman.game.Game;

/**
 *
 * @author Eric
 */
public class StateMachine implements IStateMachine {

    IState currentState;

    @Override
    public Collection<IAction> update(Game game) {
        ITransition triggered = null;
        Collection<IAction> ret = new java.util.Vector<IAction>();
        for (ITransition trans : currentState.getTransitions()) {
            if (trans.isTriggered(game)) {
                triggered = trans;
                break;
            }
        }
        if (triggered != null) {
            IState state = triggered.getTargetState();    
            ret.add(currentState.getExitAction());
            ret.add(triggered.getAction());
            ret.add(state.getEntryAction());
            currentState = state;
        }
        ret.removeAll(java.util.Collections.singleton(null));
        return ret;
    }

    @Override
    public IState getCurrentState() {
        return currentState;
    }

    @Override
    public void setCurrentState(IState state) {
        currentState = state;
    }
}
