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
public class MazeIndex implements ICondition{

    int index;
    public MazeIndex(int index){
        this.index = index;
    }
    
    @Override
    public boolean test(Game game) {
       return index == game.getMazeIndex();
    }
    
}
