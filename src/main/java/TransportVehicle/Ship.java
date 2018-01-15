package TransportVehicle;

import Interfaces.IDriveShip;

public class Ship extends Vehicle implements IDriveShip {


    private Boolean canTransportHazardousMaterials;

    public Ship(String name, int minSpeed, int maxSpeed) {
        super(name, minSpeed, maxSpeed);
    }

    public Boolean getCanTransportHazardousMaterials() {
        return canTransportHazardousMaterials;
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
