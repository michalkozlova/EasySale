package michal.edu.easysale;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Customer implements Serializable {

    @SerializedName("customer_id")
    @Expose
    private Integer customerId;
    @SerializedName("last_name")
    @Expose
    private String lastName;
    @SerializedName("first_name")
    @Expose
    private String firstName;
    @SerializedName("street")
    @Expose
    private String street;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("zipcode")
    @Expose
    private String zipcode;
    @SerializedName("country")
    @Expose
    private String country;
    @SerializedName("phone")
    @Expose
    private String phone;
    @SerializedName("phone2")
    @Expose
    private String phone2;
    @SerializedName("fax")
    @Expose
    private String fax;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("id_number")
    @Expose
    private Integer idNumber;
    @SerializedName("vat_number")
    @Expose
    private Integer vatNumber;
    @SerializedName("customer_type")
    @Expose
    private Integer customerType;
    @SerializedName("price_list_id")
    @Expose
    private Integer priceListId;
    @SerializedName("agent_id")
    @Expose
    private Integer agentId;
    @SerializedName("project_id")
    @Expose
    private Object projectId;
    @SerializedName("discount_percent")
    @Expose
    private Double discountPercent;
    @SerializedName("acc_ref")
    @Expose
    private String accRef;
    @SerializedName("exempt_vat")
    @Expose
    private Boolean exemptVat;
    @SerializedName("comments")
    @Expose
    private String comments;
    @SerializedName("available_from")
    @Expose
    private String availableFrom;
    @SerializedName("available_to")
    @Expose
    private String availableTo;
    @SerializedName("credit_terms")
    @Expose
    private Integer creditTerms;
    @SerializedName("credit_days")
    @Expose
    private Integer creditDays;
    @SerializedName("due_date")
    @Expose
    private String dueDate;
    @SerializedName("pob")
    @Expose
    private Integer pob;
    @SerializedName("pal_code")
    @Expose
    private Integer palCode;
    @SerializedName("paying_customer_id")
    @Expose
    private Integer payingCustomerId;
    @SerializedName("is_registered")
    @Expose
    private Boolean isRegistered;
    @SerializedName("balance")
    @Expose
    private Double balance;

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
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

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(Integer idNumber) {
        this.idNumber = idNumber;
    }

    public Integer getVatNumber() {
        return vatNumber;
    }

    public void setVatNumber(Integer vatNumber) {
        this.vatNumber = vatNumber;
    }

    public Integer getCustomerType() {
        return customerType;
    }

    public void setCustomerType(Integer customerType) {
        this.customerType = customerType;
    }

    public Integer getPriceListId() {
        return priceListId;
    }

    public void setPriceListId(Integer priceListId) {
        this.priceListId = priceListId;
    }

    public Integer getAgentId() {
        return agentId;
    }

    public void setAgentId(Integer agentId) {
        this.agentId = agentId;
    }

    public Object getProjectId() {
        return projectId;
    }

    public void setProjectId(Object projectId) {
        this.projectId = projectId;
    }

    public Double getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(Double discountPercent) {
        this.discountPercent = discountPercent;
    }

    public String getAccRef() {
        return accRef;
    }

    public void setAccRef(String accRef) {
        this.accRef = accRef;
    }

    public Boolean getExemptVat() {
        return exemptVat;
    }

    public void setExemptVat(Boolean exemptVat) {
        this.exemptVat = exemptVat;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getAvailableFrom() {
        return availableFrom;
    }

    public void setAvailableFrom(String availableFrom) {
        this.availableFrom = availableFrom;
    }

    public String getAvailableTo() {
        return availableTo;
    }

    public void setAvailableTo(String availableTo) {
        this.availableTo = availableTo;
    }

    public Integer getCreditTerms() {
        return creditTerms;
    }

    public void setCreditTerms(Integer creditTerms) {
        this.creditTerms = creditTerms;
    }

    public Integer getCreditDays() {
        return creditDays;
    }

    public void setCreditDays(Integer creditDays) {
        this.creditDays = creditDays;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public Integer getPob() {
        return pob;
    }

    public void setPob(Integer pob) {
        this.pob = pob;
    }

    public Integer getPalCode() {
        return palCode;
    }

    public void setPalCode(Integer palCode) {
        this.palCode = palCode;
    }

    public Integer getPayingCustomerId() {
        return payingCustomerId;
    }

    public void setPayingCustomerId(Integer payingCustomerId) {
        this.payingCustomerId = payingCustomerId;
    }

    public Boolean getIsRegistered() {
        return isRegistered;
    }

    public void setIsRegistered(Boolean isRegistered) {
        this.isRegistered = isRegistered;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", zipcode='" + zipcode + '\'' +
                ", country='" + country + '\'' +
                ", phone='" + phone + '\'' +
                ", phone2='" + phone2 + '\'' +
                ", fax='" + fax + '\'' +
                ", email='" + email + '\'' +
                ", idNumber=" + idNumber +
                ", vatNumber=" + vatNumber +
                ", customerType=" + customerType +
                ", priceListId=" + priceListId +
                ", agentId=" + agentId +
                ", projectId=" + projectId +
                ", discountPercent=" + discountPercent +
                ", accRef='" + accRef + '\'' +
                ", exemptVat=" + exemptVat +
                ", comments='" + comments + '\'' +
                ", availableFrom='" + availableFrom + '\'' +
                ", availableTo='" + availableTo + '\'' +
                ", creditTerms=" + creditTerms +
                ", creditDays=" + creditDays +
                ", dueDate='" + dueDate + '\'' +
                ", pob=" + pob +
                ", palCode=" + palCode +
                ", payingCustomerId=" + payingCustomerId +
                ", isRegistered=" + isRegistered +
                ", balance=" + balance +
                '}';
    }
}