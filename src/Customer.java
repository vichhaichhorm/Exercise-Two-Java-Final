public class Customer {
    private String name;
    private String customerType;

    public Customer(String name) {
        this.name = name;
        this.customerType = "Regular";
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getCustomerType() {
        return customerType;
    }
}
