package Decorator;
import Armour.Armour;

public class Intelligence extends ArmourDecorator{
    protected String attribute = "Intelligence + 10";

    public Intelligence(Armour armour) {
        super(armour);
    }

    @Override
    public String getDescription() {
        return armour.getDescription() + attribute + "\n";
    }
}
