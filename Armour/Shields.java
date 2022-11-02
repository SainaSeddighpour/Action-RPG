package Armour;
import Rarity.Rarity;

public class Shields extends BaseArmour{
    protected String placement = "Shields";

    public String getDescription() {
        return rarity.getRarity() + " armour " + placement + ":\n";
    }

    public Rarity getRarity(){
        return rarity;
    }

    public int howRare(){
        return 0;
    }

    public Shields(Rarity rarity) {
        super(rarity);
    }
}
