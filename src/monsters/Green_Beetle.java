package monsters;

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
        return 0;
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
