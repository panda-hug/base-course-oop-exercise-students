package AerialVehicles;

import Missions.Mission;

public abstract class AerialVehicle implements AerialVehicleService {
    private String pilotName;
    private Mission mission;
    private int hoursOfFlightSinceLastRepair;
    private boolean isReadyToFly;

    public void flyTo() {
        double longitude = mission.getMissionTargetCoordinates().getLongitude();
        double latitude = mission.getMissionTargetCoordinates().getLatitude();
        System.out.println("Flying to: " + longitude + ", " + latitude);
    }

    public void land() {
        System.out.println("Landing");
    }

    public void check() {
        if (hoursOfFlightSinceLastRepair > getMaxFlyingHours()) {
            repair();
        }
    }

    public void repair() {
        isReadyToFly = true;
        hoursOfFlightSinceLastRepair = 0;
    }

    public void setHoursOfFlightSinceLastRepair(int hoursOfFlightSinceLastRepair) {
        this.hoursOfFlightSinceLastRepair = hoursOfFlightSinceLastRepair;
    }

    public int getHoursOfFlightSinceLastRepair() {
        return hoursOfFlightSinceLastRepair;
    }

    protected abstract int getMaxFlyingHours();

    public void setMission(Mission mission) {
        this.mission = mission;
    }

    public String getPilotName() {
        return pilotName;
    }

    public Mission getMission() {
        return mission;
    }

    public void setPilotName(String pilotName) {
        this.pilotName = pilotName;
    }

    public void setReadyToFly(boolean readyToFly) {
        isReadyToFly = readyToFly;
    }
}
