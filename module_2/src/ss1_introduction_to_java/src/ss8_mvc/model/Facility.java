package ss8_mvc.model;

public abstract class Facility {
    private String serviceId;
    private String serviceName;
    private double area;
    private double rentCost;
    private int maxOccupancy;

    public Facility(String serviceId, String serviceName, double area, double rentCost, int maxOccupancy) {
        this.serviceId = serviceId;
        this.serviceName = serviceName;
        this.area = area;
        this.rentCost = rentCost;
        this.maxOccupancy = maxOccupancy;
    }

    public Facility() {
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getRentCost() {
        return rentCost;
    }

    public void setRentCost(double rentCost) {
        this.rentCost = rentCost;
    }

    public int getMaxOccupancy() {
        return maxOccupancy;
    }

    public void setMaxOccupancy(int maxOccupancy) {
        this.maxOccupancy = maxOccupancy;
    }
}
