package monsters;

import java.util.Random;

//008
public class Purple_Mushroom implements Monster {

    protected String name = "Purple Mushroom";
    protected final int minLevel = 14;
    protected final int maxLevel = 20;
    protected final int mp = 20;
    protected final int hp = 30;
    protected final int str = 12;
    protected final int mag = 8;
    protected final int def = 12;
    protected final int magDef = 3;

    public String getName() {
        return name;
    }

    public int getMinLevel() {
        return minLevel;
    }

    public int getMaxLevel() {
        return maxLevel;
    }

    public int getMp() {
        return mp;
    }

    public int getHP() { return hp; }

    public int getStr() { return str; }

    public int getMag() { return mag; }

    public int getDef() { return def; }

    public int getMagDef() { return magDef; }


    @Override
    public int basicAtk() {
        System.out.println("The " + name + " slaps you, somehow.");
        return 6;
    }

    @Override
    public int intermediateAtk() {
        System.out.println("The " + name + " slams into you.");
        return 8;
    }

    @Override
    public int advancedAtk() {
        System.out.println("The " + name + " spews out a gas attack.");
        return 12;
    }

    @Override
    public void chooseAttack() {
        int choice = generateRandomInt();

        switch(choice) {
            case 1:
                basicAtk();
            case 2:
                intermediateAtk();
            case 3, 4, 5, 6, 7, 8, 9, 10:
                advancedAtk();
        }
    }

    public int generateRandomInt() {
        Random rand = new Random();
        int answer = rand.nextInt(10 - 1 + 1) + 1;

        return answer;
    }
}
