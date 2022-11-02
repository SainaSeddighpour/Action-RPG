package Decorator;
import Armour.Armour;

public class Mana extends ArmourDecorator{
    protected String attribute = "Mana + 10";

    public Mana(Armour armour) {
        super(armour);
    }

    @Override
    public String getDescription() {
        return armour.getDescription() + attribute + "\n";
    }
}
