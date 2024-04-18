package Services;

import Models.MagicTheGatheringCard;
import org.junit.Assert;
import org.junit.Test;

public class MagicTheGatheringCardServiceTest {
    @Test
    public void createTest(){

        String expectedName = "Black Lotus";
        String expectedRarity = "Mythic Rare";
        String expectedCondition = "Lightly Played";
        String expectedSeries = "Alpha";
        Double expectedPrice = 10000.0;

        MagicTheGatheringService cardService = new MagicTheGatheringService();
        MagicTheGatheringCard card = cardService.create(expectedName,expectedRarity,expectedCondition,expectedSeries,expectedPrice);


        int actualId = card.getId();
        String actualName = card.getName();
        String actualRarity = card.getRarity();
        String actualCondition = card.getCondition();
        String actualSeries = card.getSeries();
        Double actualPrice = card.getPrice();

        // (4)
        Assert.assertEquals(Integer.class.getName(), new Integer(actualId).getClass().getName());
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedRarity, actualRarity);
        Assert.assertEquals(expectedCondition, actualCondition);
        Assert.assertEquals(expectedSeries, actualSeries);
        Assert.assertEquals(expectedPrice, actualPrice);
    }

}