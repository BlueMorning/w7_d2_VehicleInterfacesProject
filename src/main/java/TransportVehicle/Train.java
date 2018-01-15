package TransportVehicle;

import Interfaces.IControlSpeed;
import Interfaces.IDriveTrain;

public class Train extends Vehicle implements IDriveTrain {

    public Train(String name, int minSpeed, int maxSpeed) {
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
}
