package ss8_mvc.model;

public class House extends Facility {
    private String roomStandard;
    private int numberOfFloors;

    public House(String serviceId, String serviceName, double area, double rentCost, int maxOccupancy, String roomStandard, int numberOfFloors) {
        super(serviceId, serviceName, area, rentCost, maxOccupancy);
        this.roomStandard = roomStandard;
        this.numberOfFloors = numberOfFloors;
    }

    public House(String roomStandard, int numberOfFloors) {
        this.roomStandard = roomStandard;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }
}
