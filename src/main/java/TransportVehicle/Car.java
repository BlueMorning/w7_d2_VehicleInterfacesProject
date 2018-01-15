package TransportVehicle;

import Interfaces.IDriveRoadVehicle;

public class Car extends Vehicle implements IDriveRoadVehicle {


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


    @Override
    public void goBackward() {

    }

    @Override
    public void goForward() {

    }

    @Override
    public void speedUp(int speedToReach) {

    }

    @Override
    public void slowDown(int speedToReach) {

    }

    @Override
    public void maintainSpeed(int speedToMaintain) {

    }

    @Override
    public void turnRight(Double angle) {

    }

    @Override
    public void turnLeft(Double angle) {

    }
}
