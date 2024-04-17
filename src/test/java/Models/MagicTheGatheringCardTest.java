package Models;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class MagicTheGatheringCardTest extends TestCase {
    @Test
    public void setNameTest() {
        // given (1)
        String expected = "mtgCard";

        // when (2)
        MagicTheGatheringCard card = new MagicTheGatheringCard();
        card.setName(expected);

        // then (3)
        Assert.assertEquals(expected, card.getName());
    }

}