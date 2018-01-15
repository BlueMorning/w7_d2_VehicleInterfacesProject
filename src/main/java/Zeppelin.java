public class Zeppelin extends Vehicle {

    private int maxAltitude;

    public Zeppelin(String name, int minSpeed, int maxSpeed, int maxAltitude) {
        super(name, minSpeed, maxSpeed);
        this.maxAltitude = maxAltitude;
    }

    public int getMaxAltitude(){
        return maxAltitude;
    }

}
