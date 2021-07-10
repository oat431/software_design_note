package Model.RPGClass;

import Model.AbstractModel.CloseCombat;

public class Cleric extends CloseCombat {
    private final double attack = 40;
    private final double HP = 100;
    private final double MP = 60;

    @Override
    public void BersertMode() {
        System.out.println("Beware my hammer");
        System.out.println("this is my status");
        System.out.println("Attack : " + (this.attack + super.bonusAttack));
        System.out.println("HP : " + (this.HP + super.bonusHP));
        System.out.println("MP : " + this.MP);
        System.out.println();
    }

}
