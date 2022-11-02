package Decorator;
import Armour.Armour;

public class FireResistance extends ArmourDecorator{
    protected String attribute = "Fire Resistance + 10";

    public FireResistance(Armour armour) {
        super(armour);
    }

    @Override
    public String getDescription() {
        return armour.getDescription() + attribute + "\n";
    }
}
