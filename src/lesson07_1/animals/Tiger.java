package lesson07_1.animals;

public class Tiger {
    //2. to get all info from TigerBuilder
    private String name;
    private String leaving;
    private int randomSpeed;
    private int maxSpeed;
    private boolean isFly;

    public String getLeaving() {
        return leaving;
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

    public Tiger(String name, int maxSpeed, boolean isFly, String leaving, int randomSpeed) {
        this.isFly = isFly;
        this.maxSpeed = maxSpeed;
        this.name = name;
        this.leaving = leaving;
        this.randomSpeed = randomSpeed;
    }
}
