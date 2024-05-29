package monsters;
import java.util.Random;

//005
public class Green_Worm {

    protected String name = "Green Worm";

    protected final int minLevel = 1;
    protected final int maxLevel = 6;
    protected final int mp = 20;
    protected final int hp = 10;
    protected final int str = 5;
    protected final int mag = 5;
    protected final int def = 5;
    protected final int magDef = 5;

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
}
