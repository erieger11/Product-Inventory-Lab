package Models;

import org.junit.Assert;
import org.junit.Test;

public class PokemonCardTest  {
    @Test
    public void setNameTest() {
        String expected = "PokemonCard";

        PokemonCard card = new PokemonCard();
        card.setName(expected);

        Assert.assertEquals(expected, card.getName());
    }
    @Test
    public void setRarityTest() {
        String expected = "Holo Rare";

        PokemonCard card = new PokemonCard();
        card.setRarity(expected);

        Assert.assertEquals(expected, card.getRarity());
    }
    @Test
    public void setConditionTest() {
        String expected = "Near mint";

        PokemonCard card = new PokemonCard();
        card.setCondition(expected);

        Assert.assertEquals(expected, card.getCondition());
    }
    @Test
    public void setSeriesTest() {
        String expected = "Base set";

        PokemonCard card = new PokemonCard();
        card.setSeries(expected);

        Assert.assertEquals(expected, card.getSeries());
    }
    @Test
    public void setPriceTest() {
        Double expected = 100.0;

        PokemonCard card = new PokemonCard();
        card.setPrice(expected);

        Assert.assertEquals(expected, card.getPrice());
    }
    @Test
    public void constructorTest(){

        String name = "Charizard";
        String rarity = "Holo Rare";
        String condition = "Near mint";
        String series = "Base set";
        Double price = 100.0;

        PokemonCard card = new PokemonCard(name,rarity,condition,series,price);

        Assert.assertEquals(name, card.getName());
        Assert.assertEquals(rarity, card.getRarity());
        Assert.assertEquals(condition, card.getCondition());
        Assert.assertEquals(series, card.getSeries());
        Assert.assertEquals(price, card.getPrice());
    }

}