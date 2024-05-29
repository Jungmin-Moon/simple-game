package monsters;

import java.util.Random;
public class Bat implements Monster{
    protected String name = "Bat";
    protected final int minLevel = 1;
    protected final  int maxLevel = 6;
    protected final  int mp = 0;
    protected final  int hp = 10;
    protected final  int str = 6;
    protected final  int mag = 7;
    protected final  int def = 5;
    protected final  int magDef = 5;

    //001 pictures for bat

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

    //each tier of enemy will favor certain levels of attacks
    //first tier will favor basic over any other
    //second tier will favor intermediate and their spell more
    //final tier will favor advanced and spells
    @Override
    public void chooseAttack() {
        int choice = generateRandomInt();

        switch (choice) {
            case 1, 2, 3, 4, 5, 6, 7, 8:
                basicAtk();
            case 9:
                intermediateAtk();
            case 10:
                advancedAtk();
        };
    }

    public int generateRandomInt() {
        Random rand = new Random();
        int answer = rand.nextInt(10 - 1 + 1) + 1;

        return answer;
    }

}
