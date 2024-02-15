public class Sale {
    private Customer customer;
    private String date;
    private double productExpense;
    private double serviceExpense;

    public Sale(Customer customer, String date) {
        this.customer = customer;
        this.date = date;
    }

    public void setProductExpense(double productExpense) {
        this.productExpense = productExpense;
    }

    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense = serviceExpense;
    }

    public void displayInfo() {
        double totalExpense = productExpense + serviceExpense;

        // Apply discount based on customer type
        double discountRate;
        switch (customer.getCustomerType()) {
            case "Premium":
                discountRate = DiscountRate.serviceDiscountPremium + DiscountRate.productDiscountPremium;
                break;
            case "Gold":
                discountRate = DiscountRate.serviceDiscountGold + DiscountRate.productDiscountGold;
                break;
            case "Silver":
                discountRate = DiscountRate.serviceDiscountSilver + DiscountRate.productDiscountSilver;
                break;
            default:
                discountRate = 0.0; // No discount for regular customers
        }

        double discountedExpense = totalExpense - (totalExpense * discountRate);

        System.out.println("Sale Information:");
        System.out.println("Date: " + date);
        System.out.println("Customer: " + customer.getCustomerType());
        System.out.println("Total Expense: $" + totalExpense);
        System.out.println("Discounted Expense: $" + discountedExpense);
        System.out.println("------------------------------");
    }
}

