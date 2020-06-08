package Missions;

import AerialVehicles.AerialIntelligenceVehicle;
import AerialVehicles.AerialVehicle;
import Entities.Coordinates;

public class IntelligenceMission extends Mission{
    private String region;

    public IntelligenceMission(String region, Coordinates coordinates){
        this.region = region;
        setMissionTargetCoordinates(coordinates);
    }

    public String getRegion() {
        return region;
    }
}
