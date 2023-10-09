package ss8_mvc.model;

public class Room extends Facility {
    private String freeServices;

    public Room(String serviceId, String serviceName, double area, double rentCost, int maxOccupancy, String freeServices) {
        super(serviceId, serviceName, area, rentCost, maxOccupancy);
        this.freeServices = freeServices;
    }

    public Room(String freeServices) {
        this.freeServices = freeServices;
    }

    public String getFreeServices() {
        return freeServices;
    }

    public void setFreeServices(String freeServices) {
        this.freeServices = freeServices;
    }
}
