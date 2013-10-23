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
public class GhostEaten implements ICondition{

    Constants.GHOST ghost;
    public GhostEaten(Constants.GHOST ghost){
        this.ghost = ghost;
    }
    
    @Override
    public boolean test(Game game) {
        return game.wasGhostEaten(ghost);
    }
    
}
