package org.dangph12.testpractice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CommissionServiceTest {

    @Test
    void calculateCommission() {
        CommissionService commissionService = new CommissionService();
        Order order = new Order("standard", "regulars", "salaried", 100);
        int expectedCommission = 0;
        assertEquals(expectedCommission, commissionService.calculateCommission(order));
    }
}