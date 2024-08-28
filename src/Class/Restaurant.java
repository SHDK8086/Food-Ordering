package Class;

import java.util.List;

public class Restaurant {
    private String location;
    private String name;
    private String username;
    private String phoneNo;
    private String address;
    private String password;

    public
    Restaurant (String location, String name, String username, String phoneNo, String address, String password) {
        this.location = location;
        this.name = name;
        this.username = username;
        this.phoneNo = phoneNo;
        this.address = address;
        this.password = password;
    }

    public
    String getLocation () {
        return location;
    }

    public
    void setLocation (String location) {
        this.location = location;
    }

    public
    String getName () {
        return name;
    }

    public
    void setName (String name) {
        this.name = name;
    }

    public
    String getUsername () {
        return username;
    }

    public
    void setUsername (String username) {
        this.username = username;
    }

    public
    String getPhoneNo () {
        return phoneNo;
    }

    public
    void setPhoneNo (String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public
    String getAddress () {
        return address;
    }

    public
    void setAddress (String address) {
        this.address = address;
    }

    public
    String getPassword () {
        return password;
    }

    public
    void setPassword (String password) {
        this.password = password;
    }
    


}
