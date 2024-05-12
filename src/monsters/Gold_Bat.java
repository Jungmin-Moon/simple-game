package monsters;

public class Gold_Bat implements Monster{
    protected String name = "Gold Bat";
    protected int minLevel = 5;
    protected int maxLevel = 15;
    protected int mp = 20;
    protected int hp = 30;
    protected int str = 12;
    protected int mag = 10;
    protected int def = 11;
    protected int magDef = 8;

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
}
