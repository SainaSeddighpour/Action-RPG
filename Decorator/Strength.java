package Decorator;
import Armour.Armour;

public class Strength extends ArmourDecorator{
    protected String attribute = "Strength + 10";

    public Strength(Armour armour) {
        super(armour);
    }

    @Override
    public String getDescription() {
        return armour.getDescription() + attribute + "\n";
    }
}
