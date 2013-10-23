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
public class TotalTime implements ICondition {

    int min;
    int max;
    public TotalTime(int min, int max){
        this.min = min;
        this.max = max;
    }

    @Override
    public boolean test(Game game) {
        return Helper.withinRangeInclusive(min, max, game.getTotalTime());
    }
}
