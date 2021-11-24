package lesson06.testcases;

import lesson06.commons.Animal;

import java.util.HashMap;

public class RacingAnimal_Animal {


    public static void main(String[] arg){
        HashMap<Animal, Integer> listAnimal = new HashMap<Animal, Integer>();
        Animal tiger = new Animal("Tiger", 100);
        Animal horse = tiger;
        tiger.setMaxSpeed(101);
        Animal dog = new Animal("Dog",60);

        listAnimal.put(tiger, tiger.getMaxSpeed());
        listAnimal.put(horse, horse.getMaxSpeed());
        listAnimal.put(dog, dog.getMaxSpeed());

        System.out.println("list: " + listAnimal.toString() + " list.size() " + listAnimal.size());

        ///previous case: parse object to JSON
        /**
         * Create A (class)
         * method createA: using set, get to add/get info from class A
         * declare A a = new A();
         * a = createA();
         * declare A b = new A();
         * b = a;
         * a modify any properties/attribute
         * b will be modified
         */

    }
}
