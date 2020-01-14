package Models;

public class Room extends Service {
    private String freeService;

    public Room() {

    }

    public Room(String nameService, float useArea, float rentPay, int fullPeople, String typeRent, String id, String freeService) {
        super(nameService, useArea, rentPay, fullPeople, typeRent, id);
        this.freeService = freeService;
    }

    @Override
    public String showInfor() {
        System.out.println("Room{" + "\n" + "nameService='" + getNameService() + "\n" +
                ", useArea=" + getUseArea() + "\n" +
                ", rentPay=" + getRentPay() + "\n" +
                ", fullPeople=" + getFullPeople() + "\n" +
                ", typeRent='" + getTypeRent() + "\n" +
                ", id='" + getId() + "\n" + "freeService='" + freeService + "\n" +
                '}');
        return null;
    }


    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }
}
