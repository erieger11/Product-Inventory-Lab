package Services;

import Models.MagicTheGatheringCard;
import Models.PokemonCard;

import java.util.ArrayList;

public class MagicTheGatheringService {
    private static int mtgCardId = 1;
    ArrayList<MagicTheGatheringCard> magicTheGatheringCardDeck = new ArrayList<>();
    public MagicTheGatheringCard create(String name, String rarity, String condition, String series, Double price) {
        MagicTheGatheringCard createdCard = new MagicTheGatheringCard(mtgCardId++, name, rarity, condition, series, price);
        magicTheGatheringCardDeck.add(createdCard);
        return createdCard;
    }

}
