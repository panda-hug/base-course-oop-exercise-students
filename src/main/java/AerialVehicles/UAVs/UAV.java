package AerialVehicles.UAVs;

import AerialVehicles.AerialIntelligenceVehicle;
import AerialVehicles.AerialVehicle;
import Missions.IntelligenceMission;

public abstract class UAV extends AerialVehicle implements AerialIntelligenceVehicle {
    protected String sensorType;

    @Override
    public String collectIntelligence() {
        return getPilotName() + ": " + getVehicleName() + " Collecting Data in " +
                ((IntelligenceMission)getMission()).getRegion()
                + " with sensor type: " + sensorType;
    }
}
