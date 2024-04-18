package Services;
import Models.PokemonCard;
import org.junit.Assert;
import org.junit.Test;

public class PokemonCardServiceTest {
    @Test
    public void createTest(){

        String expectedName = "Charizard";
        String expectedRarity = "Holo Rare";
        String expectedCondition = "Near mint";
        String expectedSeries = "Base set";
        Double expectedPrice = 100.0;

        PokemonCardService cardService = new PokemonCardService();
        PokemonCard card = cardService.create(expectedName,expectedRarity,expectedCondition,expectedSeries,expectedPrice);


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