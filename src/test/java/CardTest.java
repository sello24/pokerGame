import com.game.poker.Card;
import org.junit.Assert;
import org.junit.Test;

/***
 * Tests for Card.java
 */
public class CardTest {

    @Test
    public void testCard1(){
        Card cardObj = new Card(0,2);
        Assert.assertEquals(cardObj.getFaceValue(), 0);
        Assert.assertEquals(cardObj.getSuit(), 2);

        cardObj.setFaceValue(4);
        Assert.assertEquals(cardObj.getFaceValue(), 4);

        cardObj.setSuit(0);
        Assert.assertEquals(cardObj.getSuit(), 0);

        Assert.assertEquals(cardObj.toString(), "Card: 5 of H");
    }

    @Test
    public void testCard2(){
        Card cardObj = new Card(12,3);
        Assert.assertEquals(cardObj.getFaceValue(), 12);
        Assert.assertEquals(cardObj.getSuit(), 3);

        cardObj.setFaceValue(0);
        Assert.assertEquals(cardObj.getFaceValue(), 0);
        Assert.assertEquals(cardObj.getSuit(), 3);

        cardObj.setSuit(1);
        Assert.assertEquals(cardObj.getSuit(), 1);
        Assert.assertEquals(cardObj.getFaceValue(), 0);

        Assert.assertEquals(cardObj.toString(), "Card: A of C");
    }
}
