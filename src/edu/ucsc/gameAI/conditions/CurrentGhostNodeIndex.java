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
public class CurrentGhostNodeIndex implements ICondition{

    Constants.GHOST ghost;
    int index;
    public CurrentGhostNodeIndex(Constants.GHOST ghost, int index){
        this.ghost = ghost;
        this.index = index;
    }
    @Override
    public boolean test(Game game) {
        return index == game.getGhostCurrentNodeIndex(ghost);
    }
    
}
