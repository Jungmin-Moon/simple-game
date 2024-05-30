package monsters;
import java.util.Random;

//005
public class Brown_Worm implements Monster{

    protected String name = "Brown Worm";

    protected final int minLevel = 7;
    protected final int maxLevel = 13;
    protected final int mp = 20;
    protected final int hp = 20;
    protected final int str = 9;
    protected final int mag = 9;
    protected final int def = 9;
    protected final int magDef = 9;
    protected final int speed = 9;

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
