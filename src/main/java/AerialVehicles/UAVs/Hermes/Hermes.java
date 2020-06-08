package AerialVehicles.UAVs.Hermes;

import AerialVehicles.AerialBdaVehicle;
import AerialVehicles.UAVs.UAV;
import Missions.BdaMission;

public abstract class Hermes extends UAV implements AerialBdaVehicle {
    private static final int MAX_FLYING_HOURS = 100;
    String cameraType;

    @Override
    public String preformBda() {
        return getPilotName() + ": " + getVehicleName() + " taking pictures of " +
                ((BdaMission) getMission()).getObjective()
                + " with: " + cameraType + " camera";
    }

    public int getMaxFlyingHours() {
        return MAX_FLYING_HOURS;
    }

}
