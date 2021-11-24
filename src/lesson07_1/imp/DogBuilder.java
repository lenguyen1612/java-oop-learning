package lesson07_1.imp;

import lesson07_1.animals.Dog;
import lesson07_1.components.KindsOfDog;
import lesson07_1.commons.AnimalBuilder;

import java.security.SecureRandom;

public class DogBuilder implements AnimalBuilder {

    private String name;
    private int maxSpeed;
    private boolean isFly;
    private KindsOfDog kindOfDog;

    public void setKindOfDog(KindsOfDog kindOfDog) {
        this.kindOfDog = kindOfDog;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void setFly(boolean fly) {
        this.isFly = isFly;
    }

    @Override
    public int speed() {
        return new SecureRandom().nextInt(this.maxSpeed);
    }

    public Dog defineDog(){
        return new Dog(this.name, this.maxSpeed, this.isFly, this.kindOfDog, speed());
    }
}
