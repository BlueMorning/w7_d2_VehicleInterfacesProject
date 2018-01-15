package TransportVehicle;

public abstract class Vehicle {

    private String name;
    private int maxSpeed;
    private int minSpeed;

    public Vehicle(String name, int minSpeed, int maxSpeed) {
        this.name     = name;
        this.minSpeed = minSpeed;
        this.maxSpeed = maxSpeed;
    }

    public String getName() {
        return name;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getMinSpeed() {
        return minSpeed;
    }




}
