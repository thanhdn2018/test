package ss8_mvc.model;

public class Furama {
    String serviceName,rentType;
    int fee,maxPeople,useArea,serviceID;

    public Furama() {
    }

    public Furama(String serviceName, String rentType, int fee, int maxPeople, int useArea, int serviceID) {
        this.serviceName = serviceName;
        this.rentType = rentType;
        this.fee = fee;
        this.maxPeople = maxPeople;
        this.useArea = useArea;
        this.serviceID = serviceID;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getRentType() {
        return rentType;
    }

    public void setRentType(String rentType) {
        this.rentType = rentType;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public int getUseArea() {
        return useArea;
    }

    public void setUseArea(int useArea) {
        this.useArea = useArea;
    }

    public int getServiceID() {
        return serviceID;
    }

    public void setServiceID(int serviceID) {
        this.serviceID = serviceID;
    }
}
