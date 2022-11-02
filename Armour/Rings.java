package Armour;
import Rarity.Rarity;

public class Rings extends BaseArmour{
    protected String placement = "Rings";

    public String getDescription() {
        return rarity.getRarity() + " armour " + placement + ":\n";
    }

    public Rarity getRarity(){
        return rarity;
    }

    public int howRare(){
        return 0;
    }

    public Rings(Rarity rarity) {
        super(rarity);
    }
}
