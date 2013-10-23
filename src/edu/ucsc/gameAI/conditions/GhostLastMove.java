/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucsc.gameAI.conditions;
import edu.ucsc.gameAI.ICondition;
import pacman.game.Game;
import pacman.game.Constants;
/**
 *
 * @author Eric
 */
public class GhostLastMove implements ICondition{

    Constants.GHOST ghost;
    Constants.MOVE move;
    public GhostLastMove(Constants.GHOST ghost, Constants.MOVE move){
        this.ghost = ghost;
        this.move = move;
    }
    
    @Override
    public boolean test(Game game) {
        return move == game.getGhostLastMoveMade(ghost);
    }
    
}
