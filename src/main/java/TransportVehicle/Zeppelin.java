package TransportVehicle;

import Interfaces.IControlAltitude;
import Interfaces.IDriveAircraft;

public class Zeppelin extends Vehicle implements IDriveAircraft {

    private int maxAltitude;

    public Zeppelin(String name, int minSpeed, int maxSpeed, int maxAltitude) {
        super(name, minSpeed, maxSpeed);
        this.maxAltitude = maxAltitude;
    }

    public int getMaxAltitude(){
        return maxAltitude;
    }


    @Override
    public void goUp(int altitudeToReach) {

    }

    @Override
    public void goDown(int altitudeToReach) {

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
