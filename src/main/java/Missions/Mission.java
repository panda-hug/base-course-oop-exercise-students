package Missions;

import Entities.Coordinates;

public abstract class Mission implements MissionService {

    private Coordinates missionTargetCoordinates;

    public void begin() {
        System.out.println("Beginning Mission!");
    }

    public void cancel() {
        System.out.println("Abort Mission!");
    }

    public void finish() {
        System.out.println("Finish Mission!");
    }

    public Coordinates getMissionTargetCoordinates() {
        return missionTargetCoordinates;
    }

    public void setMissionTargetCoordinates(Coordinates missionTargetCoordinates) {
        this.missionTargetCoordinates = missionTargetCoordinates;
    }
}
