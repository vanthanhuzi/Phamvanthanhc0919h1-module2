package Models;

public class Villa extends Service {
    private String roomStandard;
    private String otherFacilities;
    private float poolArea;
    private int floorNumber;

    public Villa() {

    }

    public Villa(String nameService, float useArea, float rentPay, int fullPeople,
                 String typeRent, String id, String roomStandard, String otherFacilities, float poolArea, int floorNumber) {
        super(nameService, useArea, rentPay, fullPeople, typeRent, id);
        this.roomStandard = roomStandard;
        this.otherFacilities = otherFacilities;
        this.poolArea = poolArea;
        this.floorNumber = floorNumber;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getOtherFacilities() {
        return otherFacilities;
    }

    public void setOtherFacilities(String otherFacilities) {
        this.otherFacilities = otherFacilities;
    }

    public float getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(float poolArea) {
        this.poolArea = poolArea;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    @Override
    public String showInfor() {
        System.out.println("Villa" + "\n" +
                "nameService='" + getNameService() + "\n" +
                ", useArea=" + getUseArea() + "\n" +
                ", rentPay=" + getRentPay() + "\n" +
                ", fullPeople=" + getFullPeople() + "\n" +
                ", typeRent='" + getTypeRent() + "\n" +
                ", id='" + getId() + "\n" +
                "roomStandard='" + roomStandard + "\n" +
                ", otherFacilities='" + otherFacilities + "\n" +
                ", poolArea=" + poolArea + "\n" +
                ", floorNumber=" + floorNumber);

        return null;
    }
}





