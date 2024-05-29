package monsters;
import java.util.Random;

//005
public class Purple_Worm {

    protected String name = "Purple Worm";

    protected final int minLevel = 14;
    protected final int maxLevel = 20;
    protected final int mp = 20;
    protected final int hp = 30;
    protected final int str = 14;
    protected final int mag = 14;
    protected final int def = 14;
    protected final int magDef = 14;

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
