package Factory;
import java.util.Random;
import Decorator.*;
import Rarity.*;
import Armour.*;

public class Factory extends ArmourFactory {
    Random random = new Random();

    @Override
    protected Rarity rarity() {
        int rarity = random.nextInt(4);

        if (rarity == 0){
            return new Common();
        }
        else if (rarity == 1) {
            return new Uncommon();
        }
        else if (rarity == 2) {
            return new Rare();
        }
        else if (rarity == 3) {
            return new Unique();
        }
        else if (rarity == 4) {
            return new Mythical();
        }
        else {
            return new Legendary();
        }
    }

    @Override
    protected Armour addAttributes(Armour armour) {
        int attribute = random.nextInt(3);

        if (attribute == 0){
            return new Dexterity(armour);
        }
        else if (attribute == 1) {
            return new ExperienceGain(armour);
        }
        else if (attribute == 2) {
            return new FireResistance(armour);
        }
        else if (attribute == 3) {
            return new Health(armour);
        }
        else if (attribute == 4) {
            return new Intelligence(armour);
        }
        else if (attribute == 5) {
            return new Mana(armour);
        }
        else{
            return new Strength(armour);
        }
    }

    @Override
    protected BaseArmour placement(Rarity rarity) {
        int placement = random.nextInt(6);

        if (placement == 0){
            return new Amulets(rarity);
        }
        else if (placement == 1) {
            return new Boots(rarity);
        }
        else if (placement == 2) {
            return new ChestPiece(rarity);
        }
        else if (placement == 3) {
            return new Gloves(rarity);
        }
        else if (placement == 4) {
            return new Helmet(rarity);
        }
        else if (placement == 5) {
            return new Pants(rarity);
        }
        else{
            return new Shields(rarity);
        }
    }
}
