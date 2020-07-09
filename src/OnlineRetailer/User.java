package OnlineRetailer;

import java.util.Map;

public class User {
    private int count = 1;
    private long userId;
    private String username;
    private Map<String, Address> address;

    public User() {
        userId = count++;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setAddress(Map<String, Address> address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Username: " + username + " " + "\nShipping address: " + address.get("Shipping");
    }
}
