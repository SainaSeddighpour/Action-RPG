package Armour;
import Rarity.Rarity;

public class Helmet extends BaseArmour{
    protected String placement = "Helmet";

    public String getDescription() {
        return rarity.getRarity() + " armour " + placement + ":\n";
    }

    public Rarity getRarity(){
        return rarity;
    }

    public int howRare(){
        return 0;
    }

    public Helmet(Rarity rarity) {
        super(rarity);
    }
}
