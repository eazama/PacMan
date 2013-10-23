/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucsc.gameAI;

import pacman.game.Constants;

import edu.ucsc.gameAI.decisionTrees.binary.IBinaryNode;
import pacman.game.Constants;
import pacman.game.Game;

/**
 *
 * @author Eric
 */
public class NeutralAction implements IAction, IBinaryNode{

    @Override
    public void doAction() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Constants.MOVE getMove() {
        return Constants.MOVE.NEUTRAL;
    }

    @Override
    public IAction makeDecision(Game game) {
       return this;
    }
    
}
