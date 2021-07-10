import Factory.CharacterFactory;
import Factory.MagicFactory;
import Factory.StrenghtFactory;
import Model.AbstractModel.CloseCombat;
import Model.AbstractModel.MagicCombat;
import Model.RPGClass.Warrior;

public class Character {
    public static void main(String[] args) {
        System.out.println("create strength character\n");
        characterGen(new StrenghtFactory());
        System.out.println("\n===============================================================\n");
        System.out.println("create magic character\n");
        characterGen(new MagicFactory());
    }

    public static void characterGen(CharacterFactory character){
        CloseCombat sahachan = character.createCombatCharacter();
        MagicCombat sahachan2 = character.createMagicCharacter();

        sahachan.BersertMode();
        sahachan2.holyLight();
    }
}
