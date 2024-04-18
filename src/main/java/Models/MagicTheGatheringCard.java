package Models;

public class MagicTheGatheringCard {
    private int id;
    private String name;
    private String rarity;
    private String condition;
    private String series;
    private Double price;



    public MagicTheGatheringCard(){}
    public MagicTheGatheringCard(int id, String name, String rarity, String condition, String series, Double price) {
        this.name = name;
        this.rarity = rarity;
        this.condition = condition;
        this.series = series;
        this.price = price;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setRarity(String rarity) {
        this.rarity = rarity;
    }
    public String getRarity() {
        return rarity;
    }
    public void setCondition(String condition) {
        this.condition = condition;
    }
    public String getCondition() {
        return condition;
    }
    public void setSeries(String series) {
        this.series = series;
    }
    public String getSeries() {
        return series;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public Double getPrice() {
        return price;
    }
}
