package lesson07_1.animals;

public class Bird {
    //2. to get all info from DogBuilder
    private String name;
    private String color;
    private int maxSpeed;
    private int randomSpeed;

    public String getColor() {
        return color;
    }

    public int getRandomSpeed() {
        return randomSpeed;
    }

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

    public Bird(String name, int maxSpeed, boolean isFly, String color, int randomSpeed) {
        this.isFly = isFly;
        this.maxSpeed = maxSpeed;
        this.name = name;
        this.color = color;
        this.randomSpeed = randomSpeed;
    }
}
