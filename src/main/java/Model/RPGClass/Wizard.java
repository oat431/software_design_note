package Model.RPGClass;

import Model.AbstractModel.MagicCombat;

public class Wizard extends MagicCombat {
    private final double attack = 20;
    private final double HP = 100;
    private final double MP = 200;

    @Override
    public void holyLight() {
        System.out.println("May the evil goes away!!!");
        System.out.println("this is my status");
        System.out.println("Attack : " + (this.attack + super.bonusMagicAttack));
        System.out.println("HP : " + this.HP);
        System.out.println("MP : " + (this.MP + super.bonusMP));
        System.out.println();
    }

}
