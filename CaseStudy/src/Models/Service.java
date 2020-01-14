package Models;

public abstract class Service {
    private static final java.util.UUID UUID = null;
    private String nameService;
    private float useArea;
    private float rentPay;
    private int fullPeople;
    private String typeRent;
    private String id;

    public Service() {
    }

    public Service(String nameService, float useArea, float rentPay, int fullPeople, String typeRent, String id) {
        this.nameService = nameService;
        this.useArea = useArea;
        this.rentPay = rentPay;
        this.fullPeople = fullPeople;
        this.typeRent = typeRent;
        this.id = id;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public float getUseArea() {
        return useArea;
    }

    public void setUseArea(float useArea) {
        this.useArea = useArea;
    }

    public float getRentPay() {
        return rentPay;
    }

    public void setRentPay(float rentPay) {
        this.rentPay = rentPay;
    }

    public int getFullPeople() {
        return fullPeople;
    }

    public void setFullPeople(int fullPeople) {
        this.fullPeople = fullPeople;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTypeRent() {
        return typeRent;
    }

    public void setTypeRent(String typeRent) {
        this.typeRent = typeRent;
    }

    @Override
    public String toString() {
        return "Service{" + "\n" +
                "nameService='" + nameService + "\n" +
                ", useArea=" + useArea + "\n" +
                ", rentPay=" + rentPay + "\n" +
                ", fullPeople=" + fullPeople + "\n" +
                ", typeRent='" + typeRent + "\n" +
                ", id='" + id + "\n" +
                '}';
    }

    abstract public String showInfor();


}
