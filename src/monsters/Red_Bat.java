package monsters;

public class Red_Bat implements Monster{

    protected String name = "Red Bat";
    protected final  int minLevel = 4;
    protected final  int maxLevel = 12;
    protected final  int mp = 10;
    protected final  int hp = 20;
    protected final  int str = 8;
    protected final  int mag = 6;
    protected final  int def = 7;
    protected final  int magDef = 6;
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
