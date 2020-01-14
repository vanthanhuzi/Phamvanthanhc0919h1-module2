package Models;

public class House extends Service {
    private String roomStandard;
    private String otherFacilities;
    private int floorNumber;

    public House() {
    }

    public House(String nameService, float useArea, float rentPay
            , int fullPeople, String typeRent, String id, String roomStandard, String otherFacilities, int floorNumber) {
        super(nameService, useArea, rentPay, fullPeople, typeRent, id);
        this.roomStandard = roomStandard;
        this.otherFacilities = otherFacilities;
        this.floorNumber = floorNumber;
    }

    @Override
    public String showInfor() {
        System.out.println("House{" + "\n" + "nameService='" + getNameService() + "\n" +
                ", useArea=" + getUseArea() + "\n" +
                ", rentPay=" + getRentPay() + "\n" +
                ", fullPeople=" + getFullPeople() + "\n" +
                ", typeRent='" + getTypeRent() + "\n" +
                ", id='" + getId() + "\n" + "roomStandard='" + roomStandard + "\n" +
                ", otherFacilities='" + otherFacilities + "\n" +
                ", floorNumber=" + floorNumber + "\n" +
                '}');
        return null;
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

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }
}
