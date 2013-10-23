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
public class HFSM implements IHFSM {

    Collection<IHTransition> trans;
    IAction action;
    IAction exitAction;
    IAction entryAction;
    Collection<IHState> states;
    IHFSM parent;
    IHState initState;
    IHState currentState = null;

    @Override
    public IResult update(Game game) {
        IResult ret = new Result();
        if (currentState == null) {
            currentState = initState;
            ret.addAction(currentState.getEntryAction());
            return ret;
        }
        IHTransition trig = null;
        for (IHTransition trans : currentState.getTransitions()) {
            if (trans.isTriggered(game)) {
                trig = trans;
                break;
            }
        }
        if (trig != null) {
            //ret.update?
            ret.setActions(new java.util.Vector<IAction>());
            ret.setTransition(trig);
            ret.setLevel(trig.getLevel());
        } else {
            ret = currentState.update(game);
        }

        if (ret.getTransition() != null) {
            if (ret.getLevel() == 0) {
                IHState target = ret.getTransition().getTargetState();
                ret.addAction(currentState.getExitAction());
                ret.addAction(ret.getTransition().getAction());
                ret.addAction(target.getEntryAction());
                currentState = target;
                ret.addAction(action);
                ret.setTransition(null);
            } else if (ret.getLevel() > 0) {
                ret.addAction(currentState.getExitAction());
                currentState = null;
                ret.setLevel(ret.getLevel() - 1);
            } else {
                IHState target = ret.getTransition().getTargetState();
                IHFSM targetParent = target.getParent();
                ret.addAction(ret.getTransition().getAction());
                ret.addActions(targetParent.updateDown(target, ret.getLevel(), game));
                ret.setTransition(null);
            }
        } else {
            ret.addAction(action);
        }
        return ret;
    }

    @Override
    public Collection<IAction> updateDown(IHState state, int level, Game game) {
        if (level > 0) {
            return updateDown(this, level - 1, game);
        }
        Collection<IAction> actions = new java.util.Vector<>();
        if (currentState != null) {
            actions.add(currentState.getExitAction());
        }
        currentState = state;
        actions.add(state.getEntryAction());
        return actions;
    }

    @Override
    public void setInitialState(IHState initialState) {
        initState = initialState;
    }

    @Override
    public IHState getInitialState() {
        return initState;
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
}
