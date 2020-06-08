package AerialVehicles.UAVs.Hermes;

import Missions.Mission;

public class Zik extends Hermes {

    public Zik(String cameraType, String sensorType, String pilotName, Mission mission,
               int hoursOfFlightSinceLastRepair, boolean isReadyToFly) {
        this.cameraType = cameraType;
        this.sensorType = sensorType;
        setPilotName(pilotName);
        setMission(mission);
        setHoursOfFlightSinceLastRepair(hoursOfFlightSinceLastRepair);
        setReadyToFly(isReadyToFly);
    }

    @Override
    public String getVehicleName() {
        return "Zik";
    }
}
