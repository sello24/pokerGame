import com.game.api.PokerHandEvaluatorAPI;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

/***
 * Test for PokerGameApi.java
 */
public class PokerGameApiTest {

    private PokerHandEvaluatorAPI pokerHandEvaluatorAPI = new PokerHandEvaluatorAPI();

    @Test
    public void testFindHandCategory(){
        ArrayList<String> input1 = new ArrayList<String>(Arrays.asList("9C", "8C", "7C", "6C", "5C"));
        String answer1 = pokerHandEvaluatorAPI.findHandCategory(input1);
        Assert.assertEquals(answer1, "Straight Flush");

        ArrayList<String> input2 = new ArrayList<String>(Arrays.asList("5C", "4C", "3C", "2C", "AC"));
        String answer2 = pokerHandEvaluatorAPI.findHandCategory(input2);
        Assert.assertEquals(answer2, "Straight Flush");
    }


  
}
