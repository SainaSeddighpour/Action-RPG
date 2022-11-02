package Armour;
import Rarity.Rarity;

public abstract class BaseArmour implements Armour{
    protected Rarity rarity;
    protected String placement;

    public String getDescription() {
        return getDescription();
    }

    public Rarity getRarity(){
        return rarity;
    }

    public int getHowRare(){
        return 0;
    }

    public BaseArmour(Rarity rarity){
        this.rarity = rarity;
    }
}
