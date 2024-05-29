package monsters;
import java.util.Random;

//005
public class Brown_Worm {

    protected String name = "Brown Worm";

    protected final int minLevel = 7;
    protected final int maxLevel = 13;
    protected final int mp = 20;
    protected final int hp = 20;
    protected final int str = 9;
    protected final int mag = 9;
    protected final int def = 9;
    protected final int magDef = 9;

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
