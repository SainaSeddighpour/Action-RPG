package Decorator;
import Armour.Armour;

public class Dexterity extends ArmourDecorator{
    protected String attribute = "Dexterity + 10";

    public Dexterity(Armour armour) {
        super(armour);
    }

    @Override
    public String getDescription() {
        return armour.getDescription() + attribute + "\n";
    }
}
