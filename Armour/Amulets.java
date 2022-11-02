package Armour;
import Rarity.Rarity;

public class Amulets extends BaseArmour{
    protected String placement = "Amulet";

    public String getDescription() {
        return rarity.getRarity() + " armour " + placement + ":\n";
    }

    public Rarity getRarity(){
        return rarity;
    }

    public int howRare(){
        return 0;
    }

    public Amulets(Rarity rarity) {
        super(rarity);
    }
}
