package Models;

/*
Họ tên Customer, Ngày sinh, Giới tính, Số CMND, Số ĐT, Email, Loại khách,
 Địa chỉ và thuộc tính sử dụng dịch vụ có kiểu đối tượng là Services, và phương thức showInfor() tương tự như Villa.
 */
public class Customer {
    private String id;
    private String fullName;
    private String birthDay;
    private String genDer;
    private String idCard;
    private int numberPhone;
    private String eMail;
    private String customerType;
    private String address;
    private Service service;

    public Customer() {
    }

    public Customer(String id, String fullName, String birthDay, String genDer,
                    String idCard, int numberPhone, String eMail, String customerType, String address, Service service) {
        this.id = id;
        this.fullName = fullName;
        this.birthDay = birthDay;
        this.genDer = genDer;
        this.idCard = idCard;
        this.numberPhone = numberPhone;
        this.eMail = eMail;
        this.customerType = customerType;
        this.address = address;
        this.service = service;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getGenDer() {
        return genDer;
    }

    public void setGenDer(String genDer) {
        this.genDer = genDer;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public int getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(int numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public void showInforFull() {
        System.out.println("Customer:" + "\n" +
                "id= " + id + "\n" +
                "fullName='" + fullName + "\n" +
                ", birthDay='" + birthDay + "\n" +
                ", genDer='" + genDer + "\n" +
                ", idCard=" + idCard + "\n" +
                ", numberPhone=" + numberPhone + "\n" +
                ", eMail='" + eMail + "\n" +
                ", customerType='" + customerType + "\n" +
                ", address='" + address + "\n" + service.showInfor()
        );
    }

    public void showInformation() {
        System.out.println("Customer:" + "\n" +
                "id= " + id + "\n" +
                "fullName='" + fullName + "\n" +
                ", birthDay='" + birthDay + "\n" +
                ", genDer='" + genDer + "\n" +
                ", idCard=" + idCard + "\n" +
                ", numberPhone=" + numberPhone + "\n" +
                ", eMail='" + eMail + "\n" +
                ", customerType='" + customerType + "\n" +
                ", address='" + address
        );

    }
}
