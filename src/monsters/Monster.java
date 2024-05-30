package monsters;

public interface Monster {


    /*
From Weakest to Strongest
tier 2: 20 to 35 level
snake - green, brown, purple 003
wolf - brown, silver, red 002
slime - blue, pink, grey 009
spider - blue, red, white 027

tier 3: 36 to 56
ghost - white, blue, black 010
jack o lantern - normal, green, black, 038
skeleton - normal, yellow, red 039
jellyfish - purple, blue, red 046
angler fish - blue, red, black 042
scorpion - red, blue, black 028

tier 4: 57 to 72
treant - green, pink, black 006
ogre - green, brown, black 015
stone golem - brown, white, red 033
knight - normal, red, black 018
flying devil - purple, red, gray 024

tier 5: 73 to 88
oni - red, blue, black 019
dragon - green, red, black -21
griffin - brown, red, purple 022
evil wizard - gray, yellow, red 025
undead knight - white, red, black 026

tier 6: 88 to 100
mimic - red, gray, blue 032
elder dragons - purple, blue, green, red, white, gold 044
elder treants - normal, brown, white 045



 */


    public int basicAtk();

    public int intermediateAtk();

    public int advancedAtk();

    public void chooseAttack();

}
