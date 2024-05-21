package monsters;

//004
public class Blue_Beetle implements Monster{

    protected String name = "Blue Beetle";
    protected final int minLevel = 3;
    protected final int maxLevel = 6;
    protected final int mp = 0;
    protected final int hp = 10;
    protected final int str = 8;
    protected final int mag = 0;
    protected final int def = 8;
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
        return 0;
    }

    @Override
    public int advancedAtk() {
        return 0;
    }

    @Override
    public void chooseAttack() {

    }
}
