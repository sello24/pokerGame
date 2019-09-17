package com.game.api;

import java.util.ArrayList;

import com.game.poker.Game;
import com.game.poker.GameService;


public class PokerHandEvaluatorAPI implements Game {
    private GameService gameService;

    public PokerHandEvaluatorAPI(){
        this.gameService = new GameService();
    }


    public String findHandCategory(ArrayList<String> inputCards){
        return gameService.findHandCategory(inputCards);
    }


   

}
