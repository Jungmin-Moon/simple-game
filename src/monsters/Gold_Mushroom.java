package monsters;

import java.util.Random;

//008
public class Gold_Mushroom implements Monster {

    protected String name = "Gold Mushroom";
    protected final int minLevel = 7;
    protected final int maxLevel = 13;
    protected final int mp = 20;
    protected final int hp = 20;
    protected final int str = 8;
    protected final int mag = 6;
    protected final int def = 7;
    protected final int magDef = 3;
    protected final int speed = 14;

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

    public int getSpeed() { return speed; }

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
            case 2, 3, 4, 5, 6, 7, 8, 9:
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
