package lesson07_1.animals;

import lesson07_1.components.KindsOfDog;

public class Dog {
    //2. to get all info from DogBuilder
    private String name;
    private KindsOfDog kindOfDog;
    private int maxSpeed;

    public KindsOfDog getKindOfDog() {
        return kindOfDog;
    }

    public int getRandomSpeed() {
        return randomSpeed;
    }

    private int randomSpeed;

    public String getName() {
        return name;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public boolean isFly() {
        return isFly;
    }

    private boolean isFly;

    public Dog(String name, int maxSpeed, boolean isFly, KindsOfDog kindOfDog, int randomSpeed){
        this.isFly = isFly;
        this.maxSpeed = maxSpeed;
        this.name = name;
        this.kindOfDog = kindOfDog;
        this.randomSpeed = randomSpeed;
    }
}
