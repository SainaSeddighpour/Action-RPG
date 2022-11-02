package Decorator;
import Armour.Armour;
import Rarity.Rarity;

public abstract class ArmourDecorator implements Armour{
    protected Armour armour;
    protected int howRare;
    protected String attribute;

    @Override
    public Rarity getRarity() {
        return armour.getRarity();
    }

    public int getHowRare(){
        return howRare;
    }

    public ArmourDecorator(Armour armour){
        if (armour.getRarity().getHowRare() == armour.getHowRare()){
            this.armour = armour;
        }
        else if (armour.getRarity().getHowRare() > armour.getHowRare()){
            this.armour = armour;
            howRare++;
        }
        else {
            this.armour = armour;
            howRare--;
        }
    }
}
