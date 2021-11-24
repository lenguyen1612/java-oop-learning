package lesson07_1.imp;

import lesson07_1.animals.Tiger;
import lesson07_1.commons.AnimalBuilder;

import java.security.SecureRandom;

public class TigerBuilder implements AnimalBuilder {
    private String name;
    private int maxSpeed;
    private boolean isFly;

    public void setLeaving(String leaving) {
        this.leaving = leaving;
    }

    private String leaving;

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

    public Tiger defineTiger(){
        return new Tiger(this.name, this.maxSpeed, this.isFly, this.leaving, speed());
    }
}
