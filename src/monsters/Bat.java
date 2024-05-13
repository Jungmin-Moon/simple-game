package monsters;

public class Bat implements Monster{
    protected String name = "Bat";
    protected final int minLevel = 1;
    protected final  int maxLevel = 5;
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
}
