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
public class PillInRegion implements ICondition{

    int x1;
    int y1;
    int x2;
    int y2;
    public PillInRegion(int x1, int y1, int x2, int y2){
        this.x1 = Math.min(x1, x2);
        this.y1 = Math.min(y1, y2);
        this.x2 = Math.max(x1, x2);
        this.y2 = Math.max(y1, y2);
    }
    
    @Override
    public boolean test(Game game) {
        for(int index : game.getActivePillsIndices()){
            if(x1 > game.getNodeXCood(index)){continue;}
            if(x2 < game.getNodeXCood(index)){continue;}
            if(y1 > game.getNodeYCood(index)){continue;}
            if(y2 < game.getNodeYCood(index)){continue;}
            return true;
        }
        return false;
    }
    
}
