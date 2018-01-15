public class Car extends Vehicle {


    private Boolean isFourWheelDrive;
    private Boolean isSelfDriven;

    public Car(String name, int minSpeed, int maxSpeed) {
        super(name, minSpeed, maxSpeed);
    }

    public Boolean getFourWheelDrive() {
        return isFourWheelDrive;
    }

    public Boolean getSelfDriven() {
        return isSelfDriven;
    }
}
