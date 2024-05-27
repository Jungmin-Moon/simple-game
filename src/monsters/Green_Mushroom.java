package monsters;

import java.util.Random;

//008
public class Green_Mushroom implements Monster{

    protected String name = "Green Mushroom";
    protected final int minLevel = 3;
    protected final int maxLevel = 6;
    protected final int mp = 20;
    protected final int hp = 10;
    protected final int str = 6;
    protected final int mag = 6;
    protected final int def = 6;
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
            case 1, 2, 3, 4, 5, 6, 7, 8:
                basicAtk();
            case 9:
                intermediateAtk();
            case 10:
                advancedAtk();
        }
    }

    public int generateRandomInt() {
        Random rand = new Random();
        int answer = rand.nextInt(10 - 1 + 1) + 1;

        return answer;
    }
}
