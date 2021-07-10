package Factory;

import Model.AbstractModel.CloseCombat;
import Model.AbstractModel.MagicCombat;

public interface CharacterFactory {
    CloseCombat createCombatCharacter();
    MagicCombat createMagicCharacter();
}
