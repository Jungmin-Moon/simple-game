package monsters;

public class Gold_Bat implements Monster{
    protected String name = "Gold Bat";
    protected final  int minLevel = 5;
    protected final  int maxLevel = 15;
    protected final  int mp = 20;
    protected final  int hp = 30;
    protected final  int str = 12;
    protected final  int mag = 10;
    protected final  int def = 11;
    protected final  int magDef = 8;



    @Override
    public int basicAtk() {
        System.out.println("The " + name + " claws at you.");
        return 7;
    }

    @Override
    public int intermediateAtk() {
        System.out.println("The " + name + " slaps you with its wings.");
        return 11;
    }

    @Override
    public int advancedAtk() {
        System.out.println("The " + name + " headbutts you.");
        return 13;
    }

    public int castFire() {
        System.out.println("The " + name + " casts fire on you.");
        return 9;
    }

    public int castWind() {
        System.out.println("The " + name + " casts aero on you.");
        return 9;
    }
}
