package monsters;
import java.util.Random;

//004
public class Gold_Beetle implements Monster{

    protected String name = "Gold Beetle";
    protected final int minLevel = 14;
    protected final int maxLevel = 20;
    protected final int mp = 0;
    protected final int hp = 30;
    protected final int str = 16;
    protected final int mag = 0;
    protected final int def = 16;
    protected final int magDef = 0;
    protected final int speed = 15;

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
        System.out.println("The " + name + " headbutts you.");
        return 6;
    }

    @Override
    public int intermediateAtk() {
        System.out.println(name + " uses its wings to blow a gust of wind at you.");
        return 8;
    }

    @Override
    public int advancedAtk() {
        System.out.println(name + " jumps up and slams into you.");
        return 12;
    }

    @Override
    public void chooseAttack() {
        int choice = generateRandomInt();

        switch (choice) {
            case 1:
                basicAtk();
            case 2, 3, 4:
                intermediateAtk();
            case 5, 6, 7, 8, 9, 10:
                advancedAtk();
        }
    }

    public int generateRandomInt() {
        Random rand = new Random();
        int answer = rand.nextInt(10 - 1 + 1) + 1;

        return answer;
    }
}
