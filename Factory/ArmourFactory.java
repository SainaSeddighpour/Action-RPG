package Factory;

import Rarity.Rarity;
import Armour.BaseArmour;
import Armour.Armour;

public abstract class ArmourFactory {
    protected abstract Rarity rarity();
    protected abstract BaseArmour placement(Rarity rarity);
    protected abstract Armour addAttributes(Armour armour);

    public Armour armourAttributes () {
        return attributes(placement(rarity()));
    }

    protected Armour attributes(BaseArmour armour) {
        int attributeNumber = armour.getRarity().getHowRare();

        Armour EquipmentAttributes = armour;
        for (int i = 0; i < attributeNumber; i++){
            EquipmentAttributes = addAttributes(EquipmentAttributes);
        }
        return EquipmentAttributes;
    }
}
