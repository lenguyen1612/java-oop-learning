package lesson07_1.commons;

public interface AnimalBuilder {
    //provide the attributes that can be modified

    void setName(String name);

    void setMaxSpeed(int maxSpeed);

    void setFly(boolean fly);

    int speed();
}
