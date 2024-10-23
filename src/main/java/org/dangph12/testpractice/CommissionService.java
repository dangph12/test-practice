package org.dangph12.testpractice;

public class CommissionService {
    public int calculateCommission(Order order) {
        String product = order.getProduct();
        String customer = order.getCustomer();
        String employee = order.getEmployee();
        int amount = order.getAmount();
        if (product.equalsIgnoreCase("standard") || customer.equalsIgnoreCase("regulars")) {
            return 0;
        }

        if (employee.equalsIgnoreCase("salaried") && product.equalsIgnoreCase("high-end")) {
            if (amount >= 1000) {
                return amount / 100 * 5;
            } else {
                return 25;
            }
        }

        if (employee.equalsIgnoreCase("salaried")) {
            if (customer.equalsIgnoreCase("one-time")) {
                if (product.equalsIgnoreCase("high-end")) {
                    if (amount >= 1000) {
                        return amount / 100 * 10;
                    } else {
                        return 75;
                    }
                }

                if (product.equalsIgnoreCase("middle")) {
                    if (amount >= 10000) {
                        return amount / 100 * 10;
                    } else {
                        return amount / 100 * 5;
                    }
                }
            }
        }
        return 0;
    }
}
