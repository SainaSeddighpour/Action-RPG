package Armour;
import Rarity.Rarity;

public class Pants extends BaseArmour{
    protected String placement = "Pants";

    public String getDescription() {
        return rarity.getRarity() + " armour " + placement + ":\n";
    }

    public Rarity getRarity(){
        return rarity;
    }

    public int howRare(){
        return 0;
    }

    public Pants(Rarity rarity) {
        super(rarity);
    }
}
