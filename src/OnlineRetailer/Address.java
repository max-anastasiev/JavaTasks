package OnlineRetailer;

public class Address {
    private String country;
    private String city;
    private String addressLine1;

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getFullAddress() {
        return "Street: "+ addressLine1 + ", City: " + city + ", Country: " + country;
    }

    @Override
    public String toString() {
        return getFullAddress();
    }
}