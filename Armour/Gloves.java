package Armour;
import Rarity.Rarity;

public class Gloves extends BaseArmour{
    protected String placement = "Gloves";

    public String getDescription() {
        return rarity.getRarity() + " armour " + placement + ":\n";
    }

    public Rarity getRarity(){
        return rarity;
    }

    public int howRare(){
        return 0;
    }

    public Gloves(Rarity rarity) {
        super(rarity);
    }
}
