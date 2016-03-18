package com.josh;

public class InsectManager {

    public static void main(String[] args) {
        Butterfly monarch =
                new Butterfly("orange and black", "milkweed", "Monarch", 4);
        Butterfly commonYellowSwallowtail =
                new Butterfly("yellow and black", "milk parsley", "Common Yellow Swallowtail", 4);
        monarch.printSpeciesData();
        commonYellowSwallowtail.printSpeciesData();

        Bee honeyBee =
                new Bee("yellow and black", true, "Jasmine", "Honey Bee", 4);

        Bee bumbleBee =
                new Bee("yellow, black and white", false, "clover", "Bumble Bee", 4);
        honeyBee.printSpeciesData();
        bumbleBee.printSpeciesData();
    }
}
