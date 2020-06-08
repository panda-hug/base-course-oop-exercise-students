package AerialVehicles.FighterJets;

import AerialVehicles.AerialIntelligenceVehicle;
import Missions.IntelligenceMission;
import Missions.Mission;

public class F15 extends FighterJets implements AerialIntelligenceVehicle {
    private String sensorType;

    public F15(String sensorType, int numberOfBombs, String bombType, String pilotName, Mission mission,
               int hoursOfFlightSinceLastRepair, boolean isReadyToFly) {
        this.sensorType = sensorType;
        this.numberOfBombs = numberOfBombs;
        this.bombsType = bombType;
        setPilotName(pilotName);
        setMission(mission);
        setHoursOfFlightSinceLastRepair(hoursOfFlightSinceLastRepair);
        setReadyToFly(isReadyToFly);
    }


    @Override
    public String collectIntelligence() {
        return getPilotName() + ": " + getVehicleName() + " Collecting Data in "
                + ((IntelligenceMission) getMission()).getRegion()
                + " with sensor type: " + sensorType;
    }

    @Override
    public String getVehicleName() {
        return "F15";
    }
}
