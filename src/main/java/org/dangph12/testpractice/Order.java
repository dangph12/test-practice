package org.dangph12.testpractice;

public class Order {
    private String product;
    private String customer;
    private String employee;
    private int amount;

    public Order() {
    }

    public Order(String product, String customer, String employee, int amount) {
        this.product = product;
        this.customer = customer;
        this.employee = employee;
        this.amount = amount;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
