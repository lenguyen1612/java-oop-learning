package lesson06.commons;

import java.security.SecureRandom;

public class Animal {

    public String name;

    public int maxSpeed;

    public Animal(){

    }

    public Animal(String name, int maxSpeed){
        this.name = name;
        this.maxSpeed = maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int speed() {
        return new SecureRandom().nextInt(this.maxSpeed
        );
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
