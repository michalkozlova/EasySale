package michal.edu.easysale;

import java.io.Serializable;

public class SmallCustomer implements Serializable {


    private int customerId;
    private String lastName;
    private String firstName;
    private String city;
    private String zipcode;
    private String country;
    private String email;
    private Boolean isRegistered;
    private boolean expanded;


    public SmallCustomer(Integer customerId, String lastName, String firstName, String city, String zipcode, String country, String email, Boolean isRegistered) {
        this.customerId = customerId;
        this.lastName = lastName;
        this.firstName = firstName;
        this.city = city;
        this.zipcode = zipcode;
        this.country = country;
        this.email = email;
        this.isRegistered = isRegistered;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getRegistered() {
        return isRegistered;
    }

    public void setRegistered(Boolean registered) {
        isRegistered = registered;
    }

    public boolean isExpanded() {
        return expanded;
    }

    public void setExpanded(boolean expanded) {
        this.expanded = expanded;
    }

    @Override
    public String toString() {
        return "SmallCustomer{" +
                "customerId=" + customerId +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", city='" + city + '\'' +
                ", zipcode='" + zipcode + '\'' +
                ", country='" + country + '\'' +
                ", email='" + email + '\'' +
                ", isRegistered=" + isRegistered +
                '}';
    }
}
