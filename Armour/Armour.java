package Armour;
import Rarity.Rarity;

public interface Armour {
    public Rarity getRarity();
    public abstract String getDescription();
    public int getHowRare();
}
