import com.game.poker.GameService;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

/***
 * Test for GameService.java
 */
public class GameServiceTest {

    private GameService gameService = new GameService();

    @Test
    public void testFindHandCategory(){
        ArrayList<String> input1 = new ArrayList<String>(Arrays.asList("AH", "AC", "KD", "KS", "KH"));
        String answer1 = gameService.findHandCategory(input1);
        Assert.assertEquals(answer1, "Full House");

        ArrayList<String> input2 = new ArrayList<String>(Arrays.asList("JH", "4C", "4S", "JC", "9H"));
        String answer2 = gameService.findHandCategory(input2);
        Assert.assertEquals(answer2, "Two Pair");

        ArrayList<String> input3 = new ArrayList<String>(Arrays.asList("5C", "4D", "AS", "2H", "6H"));
        String answer3 = gameService.findHandCategory(input3);
        Assert.assertEquals(answer3, "High Cards");
    }

   
}
