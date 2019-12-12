package Model;

public class Customer {
    private int id;
    private String name;
    private String Email;
    private String Address;

    public Customer() {
    }

    public Customer(int id, String name, String email, String address) {
        this.id = id;
        this.name = name;
        Email = email;
        Address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }
}
