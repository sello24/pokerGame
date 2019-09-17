package com.game.main;

import com.game.api.PokerHandEvaluatorAPI;

import java.util.ArrayList;
import java.util.Arrays;


public class GameController {

    public static void main(String[] args){
        PokerHandEvaluatorAPI pokerHandEvaluatorAPI = new PokerHandEvaluatorAPI();
        GameController contrObj = new GameController();

        Deck deckObj1 = new Deck();
        ArrayList<String> input1 = deckObj1.getKCards(5);
        String handCategory = pokerHandEvaluatorAPI.findHandCategory(input1);
        System.out.println("Shuffling ... Shuffling ... Shuffling ...");
        System.out.print("Your Hand: ");
        contrObj.displayList(input1);
        System.out.println();
        System.out.println("You Have: " + handCategory);
        System.out.println();
    }

    private void displayList(ArrayList<String> cardsList){
        for(String card : cardsList){
            System.out.print(card + " ");
        }
    }
}
