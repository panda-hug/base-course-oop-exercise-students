package AerialVehicles.FighterJets;

import AerialVehicles.AerialBdaVehicle;
import Missions.BdaMission;
import Missions.Mission;

public class F16 extends FighterJets implements AerialBdaVehicle {
    private String cameraType;

    public F16(String cameraType, int numberOfBombs, String bombType, String pilotName, Mission mission,
               int hoursOfFlightSinceLastRepair, boolean isReadyToFly) {
        this.cameraType = cameraType;
        this.numberOfBombs = numberOfBombs;
        this.bombsType = bombType;
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
        return "F16";
    }
}
