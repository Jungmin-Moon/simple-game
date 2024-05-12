package monsters;

public class Red_Bat implements Monster{

    protected String name = "Red Bat";
    protected int minLevel = 4;
    protected int maxLevel = 12;
    protected int mp = 10;
    protected int hp = 20;
    protected int str = 8;
    protected int mag = 6;
    protected int def = 7;
    protected int magDef = 6;
    @Override
    public int basicAtk() {
        System.out.println("The " + name + " claws at you.");
        return 5;
    }

    @Override
    public int intermediateAtk() {
        System.out.println("The " + name + " slaps you with its wings.");
        return 8;
    }

    @Override
    public int advancedAtk() {
        System.out.println("The " + name + " headbutts you.");
        return 11;
    }

    public int castFire() {
        System.out.println("The " + name + " casts fire on you.");
        return 6;
    }
}
