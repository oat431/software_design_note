package Model.RPGClass;

import Model.AbstractModel.MagicCombat;

public class Priest extends MagicCombat {
    private final double attack = 30;
    private final double HP = 120;
    private final double MP = 60;

    @Override
    public void holyLight() {
        System.out.println("In the name of the god protect my friend");
        System.out.println("this is my status");
        System.out.println("Attack : " + (this.attack + super.bonusMagicAttack));
        System.out.println("HP : " + this.HP);
        System.out.println("MP : " + (this.MP + super.bonusMP));
        System.out.println();
    }

}
