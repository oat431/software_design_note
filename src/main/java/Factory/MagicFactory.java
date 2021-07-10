package Factory;
import Model.AbstractModel.CloseCombat;
import Model.AbstractModel.MagicCombat;
import Model.RPGClass.Cleric;
import Model.RPGClass.Wizard;

public class MagicFactory implements CharacterFactory {

    @Override
    public CloseCombat createCombatCharacter() {
        System.out.println("Cleric is created");
        return new Cleric();
    }

    @Override
    public MagicCombat createMagicCharacter() {
        System.out.println("Wizard is summoned");
        return new Wizard();
    }
}
