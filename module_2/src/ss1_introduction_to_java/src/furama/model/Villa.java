package ss8_mvc.model;

public class Villa extends Facility{
    private String roomStandard;
    private double poolArea;
    private int floors;

    public Villa(String serviceId, String serviceName, double area, double rentCost, int maxOccupancy, String roomStandard, double poolArea, int floors) {
        super(serviceId, serviceName, area, rentCost, maxOccupancy);
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.floors = floors;
    }

    public Villa(String roomStandard, double poolArea, int floors) {
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.floors = floors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }
}
