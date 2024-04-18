package Models;
import org.junit.Assert;
import org.junit.Test;

public class MagicTheGatheringCardTest{
    @Test
    public void setIdTest() {
        int expected = 5;

        MagicTheGatheringCard card = new MagicTheGatheringCard();
        card.setId(expected);

        Assert.assertEquals(expected, card.getId());
    }
    @Test
    public void setNameTest() {
        String expected = "Black Lotus";

        MagicTheGatheringCard card = new MagicTheGatheringCard();
        card.setName(expected);

        Assert.assertEquals(expected, card.getName());
    }
    @Test
    public void setRarityTest() {
        String expected = "Mythic Rare";

        MagicTheGatheringCard card = new MagicTheGatheringCard();
        card.setRarity(expected);

        Assert.assertEquals(expected, card.getRarity());
    }
    @Test
    public void setConditionTest() {
        String expected = "Lightly Played";

        MagicTheGatheringCard card = new MagicTheGatheringCard();
        card.setCondition(expected);

        Assert.assertEquals(expected, card.getCondition());
    }
    @Test
    public void setSeriesTest() {
        String expected = "Alpha";

        MagicTheGatheringCard card = new MagicTheGatheringCard();
        card.setSeries(expected);

        Assert.assertEquals(expected, card.getSeries());
    }
    @Test
    public void setPriceTest() {
        Double expected = 10000.0;

        MagicTheGatheringCard card = new MagicTheGatheringCard();
        card.setPrice(expected);

        Assert.assertEquals(expected, card.getPrice());
    }
    @Test
    public void constructorTest(){
        int id = 1;
        String name = "Black Lotus";
        String rarity = "Mythic Rare";
        String condition = "Lightly Played";
        String series = "Alpha";
        Double price = 10000.0;

        MagicTheGatheringCard card = new MagicTheGatheringCard(id,name,rarity,condition,series,price);

        Assert.assertEquals(name, card.getName());
        Assert.assertEquals(rarity, card.getRarity());
        Assert.assertEquals(condition, card.getCondition());
        Assert.assertEquals(series, card.getSeries());
        Assert.assertEquals(price, card.getPrice());
    }

}