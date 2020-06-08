package AerialVehicles.UAVs.Hermes;

import AerialVehicles.AerialAttackVehicle;
import AerialVehicles.AerialBdaVehicle;
import AerialVehicles.AerialIntelligenceVehicle;
import AerialVehicles.AerialVehicle;
import Missions.AttackMission;
import Missions.Mission;
import Missions.MissionTypeException;

public class Kochav extends Hermes implements AerialAttackVehicle {
    private int numberOfBombs;
    private String bombsType;

    public Kochav(int numberOfBombs, String bombsType, String cameraType, String sensorType, String pilotName, Mission mission,
               int hoursOfFlightSinceLastRepair, boolean isReadyToFly) {
        this.numberOfBombs = numberOfBombs;
        this.bombsType = bombsType;
        this.cameraType = cameraType;
        this.sensorType = sensorType;
        setPilotName(pilotName);
        setMission(mission);
        setHoursOfFlightSinceLastRepair(hoursOfFlightSinceLastRepair);
        setReadyToFly(isReadyToFly);
    }

    @Override
    public String attack() {
        return getPilotName() + ": " + getVehicleName() + " Attacking "
                + ((AttackMission)getMission()).getTarget()
                + " with: " + bombsType + "X" + numberOfBombs;
    }
    @Override
    public String getVehicleName() {
        return "Kochav";
    }
}
