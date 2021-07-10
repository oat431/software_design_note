package Model.RPGClass;

import Model.AbstractModel.CloseCombat;

public class Warrior extends CloseCombat {
    private final double attack = 50;
    private final double HP = 100;
    private final double MP = 20;

    @Override
    public void BersertMode() {
        System.out.println("Warrior goes berserk");
        System.out.println("this is my status");
        System.out.println("Attack : " + (this.attack + super.bonusAttack));
        System.out.println("HP : " + (this.HP + super.bonusHP) );
        System.out.println("MP : " + this.MP);
        System.out.println();
    }



}
