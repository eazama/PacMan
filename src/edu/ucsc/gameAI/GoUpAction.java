package edu.ucsc.gameAI;

import edu.ucsc.gameAI.decisionTrees.binary.IBinaryNode;
import pacman.game.Constants;
import pacman.game.Game;

public class GoUpAction implements IAction, IBinaryNode {

    public void doAction() {
        // TODO Auto-generated method stub
    }

    @Override
    public Constants.MOVE getMove() {
        return Constants.MOVE.UP;
    }

    @Override
    public IAction makeDecision(Game game) {
        return this;
    }
}
