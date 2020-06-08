package AerialVehicles.UAVs.Haron;

import AerialVehicles.AerialBdaVehicle;
import Missions.BdaMission;
import Missions.Mission;

public class Shoval extends Haron implements AerialBdaVehicle {
    private String cameraType;

    public Shoval(String cameraType, int numberOfBombs, String bombType, String sensorType, String pilotName, Mission mission,
                  int hoursOfFlightSinceLastRepair, boolean isReadyToFly) {
        this.cameraType = cameraType;
        this.numberOfBombs = numberOfBombs;
        this.bombsType = bombType;
        this.sensorType = sensorType;
        setPilotName(pilotName);
        setMission(mission);
        setHoursOfFlightSinceLastRepair(hoursOfFlightSinceLastRepair);
        setReadyToFly(isReadyToFly);
    }

    @Override
    public String preformBda() {
        return getPilotName() + ": " + getVehicleName() + " taking pictures of "
                + ((BdaMission) getMission()).getObjective()
                + " with: " + cameraType + " camera";
    }

    @Override
    public String getVehicleName() {
        return "Shoval";
    }
}

