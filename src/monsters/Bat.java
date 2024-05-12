package monsters;

public class Bat implements Monster{
    protected String name = "Bat";
    protected int minLevel = 1;
    protected int maxLevel = 5;
    protected int mp = 0;
    protected int hp = 10;
    protected int str = 6;
    protected int mag = 7;
    protected int def = 5;
    protected int magDef = 5;

    //001 pictures for bat
    Bat() {

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
