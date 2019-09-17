import com.game.poker.Card;
import com.game.poker.Hand;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

/***
 * Test for Hand.java
 */
public class HandTest {

    @Test
    public void testFindCategory1(){
        //three of a kind
        ArrayList<String> cardsArr = new ArrayList<String>(Arrays.asList("3H", "3S", "3D", "AH", "QD"));

        ArrayList<Card> cards = new ArrayList<Card>();
        cards.add(new Card(2, 0));
        cards.add(new Card(2, 3));
        cards.add(new Card(2, 2));
        cards.add(new Card(0, 0));
        cards.add(new Card(11, 2));

        Hand handObj =  new Hand(cardsArr, cards);
        handObj.findCategory();

        int[] expectedTieBreakers = {3, 14, 12};
        Assert.assertEquals(handObj.getHandCategory(), 3);
        Assert.assertEquals(handObj.getTieBreakers()[0], expectedTieBreakers[0]);
        Assert.assertEquals(handObj.getTieBreakers()[1], expectedTieBreakers[1]);
        Assert.assertEquals(handObj.getTieBreakers()[2], expectedTieBreakers[2]);
        Assert.assertEquals(handObj.getTieBreakers()[3], 0);
    }

    @Test
    public void testFindCategory2(){
        //straight
        ArrayList<String> cardsArr = new ArrayList<String>(Arrays.asList("5C", "4D", "3S", "2H", "AH"));

        ArrayList<Card> cards = new ArrayList<Card>();
        cards.add(new Card(4, 1));
        cards.add(new Card(3, 2));
        cards.add(new Card(2, 3));
        cards.add(new Card(1, 0));
        cards.add(new Card(0, 0));

        Hand handObj =  new Hand(cardsArr, cards);
        handObj.findCategory();

        int[] expectedTieBreakers = {14, 5, 4, 3, 2};
        Assert.assertEquals(handObj.getHandCategory(), 4);
        Assert.assertEquals(handObj.getTieBreakers()[0], expectedTieBreakers[0]);
        Assert.assertEquals(handObj.getTieBreakers()[1], expectedTieBreakers[1]);
        Assert.assertEquals(handObj.getTieBreakers()[2], expectedTieBreakers[2]);
        Assert.assertEquals(handObj.getTieBreakers()[3], expectedTieBreakers[3]);
        Assert.assertEquals(handObj.getTieBreakers()[4], expectedTieBreakers[4]);
    }
}
