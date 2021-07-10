package Factory;
import Model.AbstractModel.CloseCombat;
import Model.AbstractModel.MagicCombat;
import Model.RPGClass.Priest;
import Model.RPGClass.Warrior;

public class StrenghtFactory implements CharacterFactory {

    @Override
    public CloseCombat createCombatCharacter() {
        System.out.println("Training success warrior is ready");
        return new Warrior();
    }

    @Override
    public MagicCombat createMagicCharacter() {
        System.out.println("I ready to serve God");
        return new Priest();
    }

}
