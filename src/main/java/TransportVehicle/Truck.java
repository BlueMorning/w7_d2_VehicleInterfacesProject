package TransportVehicle;

import Interfaces.IDriveRoadVehicle;

public class Truck extends Vehicle implements IDriveRoadVehicle {


    public Truck(String name, int minSpeed, int maxSpeed) {
        super(name, minSpeed, maxSpeed);
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
