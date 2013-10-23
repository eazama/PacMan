/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucsc.gameAI.hfsm;

import edu.ucsc.gameAI.IAction;
import pacman.game.Game;

/**
 *
 * @author Eric
 */
public class HFSMBase implements IHFSMBase{

    @Override
    public IAction getAction() {
        return null;
    }

    @Override
    public IResult update(Game game) {
                IResult ret = new Result();
        ret.addAction(getAction());
        ret.setTransition(null);
        ret.setLevel(0);
        return ret;
    }
    
}
