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
public class PacmanLastMove implements ICondition{

    Constants.MOVE move;
    public PacmanLastMove(Constants.MOVE move){
        this.move = move;
    }
    @Override
    public boolean test(Game game) {
        return move == game.getPacmanLastMoveMade();
    }
    
}
