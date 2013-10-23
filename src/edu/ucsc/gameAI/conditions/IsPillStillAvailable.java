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
public class IsPillStillAvailable implements ICondition{

    int index;
    public IsPillStillAvailable(int pillindex){
        index = pillindex;
    }
    @Override
    public boolean test(Game game) {
        return game.isPillStillAvailable(index);
    }
    
}
