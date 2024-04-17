package Models;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class PokemonCardTest extends TestCase {
    @Test
    public void setNameTest() {
        // given (1)
        String expected = "PokemonCard";

        // when (2)
        PokemonCard card = new PokemonCard();
        card.setName(expected);

        // then (3)
        Assert.assertEquals(expected, card.getName());
    }

}