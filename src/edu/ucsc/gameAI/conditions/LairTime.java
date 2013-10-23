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
public class LairTime implements ICondition{

    Constants.GHOST ghost;
    int min;
    int max;
    public LairTime(Constants.GHOST ghost, int min, int max){
        this.ghost = ghost;
        this.min = min;
        this.max = max;
    }
    
    @Override
    public boolean test(Game game) {
        return Helper.withinRangeInclusive(min, max, game.getGhostLairTime(ghost));
    }
    
}
