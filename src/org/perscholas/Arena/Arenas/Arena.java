package org.perscholas.Arena.Arenas;

import org.perscholas.Arena.Gladiator.Gladiator;

import java.util.ArrayList;
import java.util.Arrays;

public class Arena {
    public String name;
    public Gladiator[] gladiators;

    public Arena(String name) {
        this.name = name.substring(0, 1).toUpperCase() + name.substring(1);
        this.gladiators = new Gladiator[0];

    }

    public void addGladiator(Gladiator gladiator) {
        if (this.gladiators.length < 2) {
            ArrayList<Gladiator> gladiatorList = new ArrayList<Gladiator>(Arrays.asList(this.gladiators));
            gladiatorList.add(gladiator);
            this.gladiators = gladiatorList.toArray(this.gladiators);
        }
    }

    public void fight() {
        ArrayList<Gladiator> gladiatorList = new ArrayList<Gladiator>(Arrays.asList(this.gladiators));
        if (gladiatorList.get(0).weapon == "Spear") {
            if (gladiatorList.get(1).weapon == "Spear") {
                gladiatorList.remove(1);
                gladiatorList.remove(0);
            } else if (gladiatorList.get(1).weapon == "Trident") {
                gladiatorList.remove(0);
            } else {
                gladiatorList.remove(1);
            }
        } else if (gladiatorList.get(0).weapon == "Trident") {
            if (gladiatorList.get(1).weapon == "Trident") {
                gladiatorList.remove(1);
                gladiatorList.remove(0);
            } else if (gladiatorList.get(1).weapon == "Club") {
                gladiatorList.remove(0);
            } else {
                gladiatorList.remove(1);
            }
        } else {
            if (gladiatorList.get(1).weapon == "Club") {
                gladiatorList.remove(1);
                gladiatorList.remove(0);
            } else if (gladiatorList.get(1).weapon == "Spear") {
                gladiatorList.remove(0);
            } else {
                gladiatorList.remove(1);
            }
        }
            this.gladiators = gladiatorList.toArray(this.gladiators);
        }

}


