package Rarity;

public class Unique extends Rarity{
    protected String rarity = "Unique";
    protected int howRare = 3;

    @Override
    public String getRarity() {
        return rarity;
    }

    @Override
    public int getHowRare() {
        return howRare;
    }
}
