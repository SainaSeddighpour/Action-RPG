package Rarity;

public class Common extends Rarity{
    protected String rarity = "Common";
    protected int howRare = 0;

    @Override
    public String getRarity() {
        return rarity;
    }

    @Override
    public int getHowRare() {
        return howRare;
    }
}
