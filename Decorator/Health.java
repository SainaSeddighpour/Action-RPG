package Decorator;
import Armour.Armour;

public class Health extends ArmourDecorator{
    protected String attribute = "Health + 10";

    public Health(Armour armour) {
        super(armour);
    }

    @Override
    public String getDescription() {
        return armour.getDescription() + attribute + "\n";
    }
}
