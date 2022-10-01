package org.perscholas.Arena;

import org.perscholas.Arena.Arenas.Arena;
import org.perscholas.Arena.Gladiator.Gladiator;

public class Main {
    public static void main(String[] args) {

        Gladiator max = new Gladiator("Maximus", "Trident");
        Gladiator titus = new Gladiator("Titus", "Spear");
        Gladiator hannibal = new Gladiator("Hannibal", "Club");

        System.out.println(max.name);

        Arena colosseum = new Arena("colosseum");
        System.out.println(colosseum.name);
        colosseum.addGladiator(max);
        colosseum.addGladiator(titus);
        // System.out.println(colosseum.gladiators.length); Tester code used to make sure the add function is working.
        colosseum.fight();
        System.out.println(colosseum.gladiators[0].name);
    }
}
