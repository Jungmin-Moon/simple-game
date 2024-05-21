package monsters;
import java.util.Random;

//004
public class Green_Beetle implements Monster{

    protected String name = "Green Beetle";
    protected final int minLevel = 5;
    protected final int maxLevel = 8;
    protected final int mp = 0;
    protected final int hp = 20;
    protected final int str = 12;
    protected final int mag = 0;
    protected final int def = 12;
    protected final int magDef = 0;

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
        System.out.println("The " + name + " headbutts you.");
        return 8;
    }

    @Override
    public int intermediateAtk() {
        System.out.println(name + " uses its wings to blow a gust of wind at you.");
        return 10;
    }

    @Override
    public int advancedAtk() {
        System.out.println(name + " jumps up and slams into you.");
        return 14;
    }

    @Override
    public void chooseAttack() {
        int choice = generateRandomInt();
        switch (choice) {
            case 1, 2:
                basicAtk();
            case 3, 4, 5, 6, 7, 8, 9:
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
