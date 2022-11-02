package Decorator;
import Armour.Armour;

public class ExperienceGain extends ArmourDecorator{
    protected String attribute = "Experience Gain + 10";

    public ExperienceGain(Armour armour) {
        super(armour);
    }

    @Override
    public String getDescription() {
        return armour.getDescription() + attribute + "\n";
    }
}
