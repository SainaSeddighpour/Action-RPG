package Rarity;

public class Rare extends Rarity{
    protected String rarity = "Rare";
    protected int howRare = 2;

    @Override
    public String getRarity() {
        return rarity;
    }

    @Override
    public int getHowRare() {
        return howRare;
    }
}
