package Armour;
import Rarity.Rarity;

public class ChestPiece extends BaseArmour{
    protected String placement = "ChestPiece";

    public String getDescription() {
        return rarity.getRarity() + " armour " + placement + ":\n";
    }

    public Rarity getRarity(){
        return rarity;
    }

    public int howRare(){
        return 0;
    }

    public ChestPiece(Rarity rarity) {
        super(rarity);
    }
}
