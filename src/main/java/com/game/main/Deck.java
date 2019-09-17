package com.game.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;


public class Deck {
    //single deck face values and suit values
    static final ArrayList<String> suits = new ArrayList<String>(Arrays.asList("H", "C", "D", "S"));
    static final ArrayList<String> faces = new ArrayList<String>(Arrays.asList("A", "2", "3", "4", "5", "6", "7",
            "8", "9", "10", "J", "Q", "K"));

    private ArrayList<String> deck;

    public Deck(){
        this.deck = new ArrayList<String>();
        Random randomGen = new Random();
        int index1, index2;
        String temp;

        //create deck of cards
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 13; j++){
                deck.add(faces.get(j) + suits.get(i));
            }
        }

        //shuffle cards
        for(int i = 0; i < 52; i++){
            index1 = randomGen.nextInt(deck.size()-1);
            index2 = randomGen.nextInt(deck.size()-1);

            temp = deck.get(index1);
            deck.set(index1, deck.get(index2));
            deck.set(index2, temp);
        }
    }

    /***
     * Method returns the number of cards specified from deck
     * @param k number of cards to be returned
     * @return List of cards
     */
    public  ArrayList<String> getKCards(int k){
        ArrayList<String> cards = new ArrayList<String>();

        for(int i = 0; i < k; i++){
            cards.add(deck.remove(0));
        }

        return  cards;
    }
}
