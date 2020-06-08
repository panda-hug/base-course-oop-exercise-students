package AerialVehicles.UAVs.Haron;

import AerialVehicles.AerialAttackVehicle;
import AerialVehicles.UAVs.UAV;
import Missions.AttackMission;

public abstract class Haron extends UAV implements AerialAttackVehicle {
    private static final int MAX_FLYING_HOURS = 150;
    int numberOfBombs;
    String bombsType;

    @Override
    public String attack() {
        return getPilotName() + ": " + getVehicleName() + " Attacking "
                + ((AttackMission) getMission()).getTarget()
                + " with: " + bombsType + "X" + numberOfBombs;
    }

    protected int getMaxFlyingHours() {
        return MAX_FLYING_HOURS;
    }
}
