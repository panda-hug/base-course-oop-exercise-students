package AerialVehicles.UAVs.Haron;

import Missions.Mission;

public class Eitan extends Haron {

    public Eitan(int numberOfBombs, String bombType, String sensorType, String pilotName, Mission mission,
                 int hoursOfFlightSinceLastRepair, boolean isReadyToFly) {
        this.numberOfBombs = numberOfBombs;
        this.bombsType = bombType;
        this.sensorType = sensorType;
        setPilotName(pilotName);
        setMission(mission);
        setHoursOfFlightSinceLastRepair(hoursOfFlightSinceLastRepair);
        setReadyToFly(isReadyToFly);
    }

    @Override
    public String getVehicleName() {
        return "Eitan";
    }
}
