package monsters;
import java.util.Random;

//005
public class Green_Worm implements Monster{

    protected String name = "Green Worm";

    protected final int minLevel = 1;
    protected final int maxLevel = 6;
    protected final int mp = 20;
    protected final int hp = 10;
    protected final int str = 5;
    protected final int mag = 5;
    protected final int def = 5;
    protected final int magDef = 5;
    protected final int speed = 5;

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
        System.out.println("The " + name + " hits you with their body.");
        return 7;
    }

    @Override
    public int intermediateAtk() {
        System.out.println("The " + name + " casts stone.");
        return 9;
    }

    @Override
    public int advancedAtk() {
        System.out.println("The " + name + " spurs a gust of sand around you.");
        return 11;
    }

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
        }
    }

    public int generateRandomInt() {
        Random rand = new Random();
        int answer = rand.nextInt(10 - 1 + 1) + 1;

        return answer;
    }
}
