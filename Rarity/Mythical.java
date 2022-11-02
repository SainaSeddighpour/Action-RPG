package Rarity;

public class Mythical extends Rarity{
    protected String rarity = "Mythical";
    protected int howRare = 4;

    @Override
    public String getRarity() {
        return rarity;
    }

    @Override
    public int getHowRare() {
        return howRare;
    }
}
