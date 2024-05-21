package monsters;

import java.util.Random;
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

    public String getName() {
        return name;
    }

    public int getMinLevel() {
        return minLevel;
    }

    public int getMaxLevel() {
        return maxLevel;
    }

    public int getOriginalMP() {
        return mp;
    }

    public int getOriginalHP() {
        return hp;
    }

    public int getOriginalStr() {
        return str;
    }

    public int getOriginalMag() {
        return mag;
    }

    public int getOriginalDef() {
        return def;
    }

    public int getOriginalMagDef() {
        return magDef;
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

    public int castFire() {
        System.out.println("The " + name + " casts fire on you.");
        return 6;
    }

    public int castWind() {
        System.out.println("The " + name + " casts aero on you.");
        return 9;
    }

    @Override
    public void chooseAttack() {
        int choice = generateRandomInt();

        switch(choice) {
            case 1, 2:
                basicAtk();
            case 3, 4:
                intermediateAtk();
            case 5, 6, 7, 8, 9, 10:
                advancedAttackChoice();
        }

    }

    public void advancedAttackChoice() {
        int option = generateOneToThree();

        switch(option) {
            case 1:
                advancedAtk();
            case 2:
                castFire();
            case 3:
                castWind();
        }
    }

    public int generateOneToThree() {
        Random rand = new Random();
        int ans = rand.nextInt(3 - 1 + 1) + 1;

        return ans;
    }

    public int generateRandomInt() {
        Random rand = new Random();
        int answer = rand.nextInt(10 - 1 + 1) + 1;

        return answer;
    }


}
