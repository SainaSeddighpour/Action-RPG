package Armour;
import Rarity.Rarity;

public class Boots extends BaseArmour{
    protected String placement = "Boots";

    public String getDescription() {
        return rarity.getRarity() + " armour " + placement + ":\n";
    }

    public Rarity getRarity(){
        return rarity;
    }

    public int howRare(){
        return 0;
    }

    public Boots(Rarity rarity) {
        super(rarity);
    }
}
