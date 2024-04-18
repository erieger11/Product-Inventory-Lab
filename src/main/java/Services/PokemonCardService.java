package Services;

import Models.PokemonCard;

import java.util.ArrayList;

public class PokemonCardService {
    private static int pokemonCardId = 1;
    ArrayList<PokemonCard> pokemonCardDeck = new ArrayList<>();
    public PokemonCard create(String name, String rarity, String condition, String series, Double price) {
        PokemonCard createdCard = new PokemonCard(pokemonCardId++, name, rarity, condition, series, price);
        pokemonCardDeck.add(createdCard);
        return createdCard;
    }
}
