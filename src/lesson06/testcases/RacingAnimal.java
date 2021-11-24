package lesson06.testcases;

import lesson06.commons.Animal;
import lesson06.imp.Dog;
import lesson06.imp.Horse;
import lesson06.imp.Tiger;

import java.util.HashMap;
import java.util.Map;

public class RacingAnimal {

    public static void main(String[] args) {
        HashMap<Animal, Integer> listAnimal = new HashMap<Animal, Integer>();
        Tiger speechTiger = new Tiger(100);
        Horse speechHorse = new Horse(75);
        Dog speechDog = new Dog(60);

        listAnimal.put(speechTiger, speechTiger.speed());
        listAnimal.put(speechDog, speechDog.speed());
        listAnimal.put(speechHorse, speechHorse.speed());

        System.out.println("The animal's speed: " + listAnimal.toString());

        getWinner(listAnimal);
    }

    public static void getWinner(HashMap<Animal, Integer> listAnimal) {
        int max = 0;
        Object animalMaxSpeed = null;
        for (Map.Entry animal : listAnimal.entrySet()) {
            if ((int) animal.getValue() >= max) {
                max = (int) animal.getValue();
                animalMaxSpeed = animal.getKey();
            }
        }

        System.out.println("The winner is: " + animalMaxSpeed.getClass().getSimpleName() + " with speed: " + max);
    }

}
