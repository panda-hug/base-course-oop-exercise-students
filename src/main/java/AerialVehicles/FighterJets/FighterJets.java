package AerialVehicles.FighterJets;

import AerialVehicles.AerialAttackVehicle;
import AerialVehicles.AerialVehicle;
import Missions.AttackMission;

public abstract class FighterJets extends AerialVehicle implements AerialAttackVehicle {
    private static final int MAX_FLYING_HOURS = 250;
    protected int numberOfBombs;
    protected String bombsType;

    @Override
    public String attack() {
        return getPilotName() + ": " + getVehicleName() + " Attacking "
                + ((AttackMission) getMission()).getTarget()
                + " with: " + bombsType + "X" + numberOfBombs;
    }

    public int getMaxFlyingHours() {
        return MAX_FLYING_HOURS;
    }
}
