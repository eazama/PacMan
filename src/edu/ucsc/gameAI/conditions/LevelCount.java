/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucsc.gameAI.conditions;
import edu.ucsc.gameAI.ICondition;
import pacman.game.Game;

/**
 *
 * @author Eric
 */
public class LevelCount implements ICondition {

    int level;
    public LevelCount(int level){
        this.level = level;
    }
    @Override
    public boolean test(Game game) {
        return level == game.getCurrentLevel();
    }
    
}
