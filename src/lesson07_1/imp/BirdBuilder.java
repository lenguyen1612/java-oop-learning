package lesson07_1.imp;

import lesson07_1.animals.Bird;
import lesson07_1.commons.AnimalBuilder;

import java.security.SecureRandom;

public class BirdBuilder implements AnimalBuilder {
    private String name;
    private int maxSpeed;
    private String color;
    private boolean isFly;

    public void setColor(String color) {
        this.color = color;
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

    public Bird defineBird() {
        return new Bird(this.name, this.maxSpeed, this.isFly, this.color, speed());
    }
}
