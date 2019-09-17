package com.game.poker;

import java.util.ArrayList;


public class GameService {


    public String findHandCategory(ArrayList<String> inputCards){
        ArrayList<Card> cardsList = convertArrayToCards(inputCards);
        Hand handObj = new Hand(inputCards, cardsList);
        handObj.findCategory();


        return getHandCategoryString(handObj.getHandCategory(), handObj.getTieBreakers());
    }



    private ArrayList<Card> convertArrayToCards(ArrayList<String> inputCards){
        ArrayList<Card> cardsList = new ArrayList<Card>();
        for(String cardStr : inputCards){
            String face = cardStr.substring(0, cardStr.length()-1);
            String suit = cardStr.substring(cardStr.length()-1);
            cardsList.add(new Card(Card.faces.indexOf(face), Card.suits.indexOf(suit)));
        }

        return cardsList;
    }

    private String getHandCategoryString(int handCategory, int[] tieBreakers){
        StringBuilder sb = new StringBuilder();
        switch (handCategory){
            case 9: sb.append("Royal Flush");
                break;

            case 8: sb.append("Straight Flush");

                break;

            case 7: sb.append("Four of a Kind");

                break;

            case 6: sb.append("Full House");

                break;

            case 5: sb.append("Flush");
  
                break;

            case 4: sb.append("Straight");

                break;

            case 3: sb.append("Three of a Kind");
              
                break;

            case 2: sb.append("Two Pair");
        
                break;

            case 1: sb.append("One Pair");
             
                break;

            case 0: sb.append("High Cards");
          
                break;
        }

        return sb.toString();
    }
}
