package monsters;

import java.util.Random;
public class Red_Bat implements Monster{

    protected String name = "Red Bat";
    protected final  int minLevel = 7;
    protected final  int maxLevel = 13;
    protected final  int mp = 10;
    protected final  int hp = 20;
    protected final  int str = 8;
    protected final  int mag = 6;
    protected final  int def = 7;
    protected final  int magDef = 6;

    public int getMinLevel() {
        return minLevel;
    }

    public int getMaxLevel() {
        return maxLevel;
    }

    public int getOriginalMP() {
        return mp;
    }

    public int getOriginalHP() {
        return hp;
    }

    public int getOriginalStr() {
        return str;
    }

    public int getOriginalMag() {
        return mag;
    }

    public int getOriginalDef() {
        return def;
    }

    public int getOriginalMagDef() {
        return magDef;
    }

    @Override
    public int basicAtk() {
        System.out.println("The " + name + " claws at you.");
        return 2;
    }

    @Override
    public int intermediateAtk() {
        System.out.println("The " + name + " slaps you with its wings.");
        return 4;
    }

    @Override
    public int advancedAtk() {
        System.out.println("The " + name + " headbutts you.");
        return 6;
    }

    public int castFire() {
        System.out.println("The " + name + " casts fire on you.");
        return 6;
    }

    @Override
    public void chooseAttack() {
        int choice = generateRandomInt();

        switch(choice) {
            case 1, 2:
                basicAtk();
            case 3, 4, 5, 6, 7, 8:
                intermediateAttackChoice();
            case 9, 10:
                advancedAtk();
        }

    }

    public void intermediateAttackChoice() {
        int option = generateOneToTwo();

        switch(option) {
            case 1:
                intermediateAtk();
            case 2:
                castFire();
        }
    }

    //1-10
    public int generateRandomInt() {
        Random rand = new Random();
        int answer = rand.nextInt(10 - 1 + 1) + 1;

        return answer;
    }

    public int generateOneToTwo() {
        Random rand = new Random();
        int ans = rand.nextInt(2 - 1 + 1) + 1;

        return ans;
    }
}
