package Rarity;

public class Legendary extends Rarity {
    protected String rarity = "Legendary";
    protected int howRare = 5;

    @Override
    public String getRarity() {
        return rarity;
    }

    @Override
    public int getHowRare() {
        return howRare;
    }
}
