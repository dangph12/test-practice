package org.dangph12.testpractice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CommissionServiceTest {

    private CommissionService commissionService = new CommissionService();

    @Test
    void testCase1() {
        Order order = new Order("standard", "regulars", "salaried", 1001);
        int expectedCommission = 0;
        assertEquals(expectedCommission, commissionService.calculateCommission(order.getProduct(), order.getCustomer(), order.getEmployee(), order.getAmount()));
    }

    @Test
    void testCase2() {
        Order order = new Order("middle", "regulars", "salaried", 1001);
        int expectedCommission = 0;
        assertEquals(expectedCommission, commissionService.calculateCommission(order.getProduct(), order.getCustomer(), order.getEmployee(), order.getAmount()));
    }

    @Test
    void testCase3() {
        Order order = new Order("high-end", "one-time", "salaried", 1000);
        int expectedCommission = 50;
        assertEquals(expectedCommission, commissionService.calculateCommission(order.getProduct(), order.getCustomer(), order.getEmployee(), order.getAmount()));
    }

    @Test
    void testCase4() {
        Order order = new Order("high-end", "one-time", "salaried", 1001);
        int expectedCommission = 25;
        assertEquals(expectedCommission, commissionService.calculateCommission(order.getProduct(), order.getCustomer(), order.getEmployee(), order.getAmount()));
    }

    @Test
    void testCase5() {
        Order order = new Order("high-end", "one-time", "non-salaried", 1000);
        int expectedCommission = 100;
        assertEquals(expectedCommission, commissionService.calculateCommission(order.getProduct(), order.getCustomer(), order.getEmployee(), order.getAmount()));
    }

    @Test
    void testCase6() {
        Order order = new Order("high-end", "one-time", "non-salaried", 1001);
        int expectedCommission = 75;
        assertEquals(expectedCommission, commissionService.calculateCommission(order.getProduct(), order.getCustomer(), order.getEmployee(), order.getAmount()));
    }

    @Test
    void testCase7() {
        Order order = new Order("middle", "one-time", "non-salaried", 10000);
        int expectedCommission = 1000;
        assertEquals(expectedCommission, commissionService.calculateCommission(order.getProduct(), order.getCustomer(), order.getEmployee(), order.getAmount()));
    }

    @Test
    void testCase8() {
        Order order = new Order("middle", "one-time", "non-salaried", 10001);
        int expectedCommission = 500;
        assertEquals(expectedCommission, commissionService.calculateCommission(order.getProduct(), order.getCustomer(), order.getEmployee(), order.getAmount()));
    }

    @Test
    void testCase9() {
        Order order = new Order("middle", "one-time", "salaried", 1000);
        int expectedCommission = 0;
        assertEquals(expectedCommission, commissionService.calculateCommission(order.getProduct(), order.getCustomer(), order.getEmployee(), order.getAmount()));
    }

    @Test
    void testCase10() {
        Order order = new Order("", "one-time", "non-salaried", 1000);
        int expectedCommission = 0;
        assertEquals(expectedCommission, commissionService.calculateCommission(order.getProduct(), order.getCustomer(), order.getEmployee(), order.getAmount()));
    }

    @Test
    void testCase11() {
        Order order = new Order("", "", "non-salaried", 1000);
        int expectedCommission = 0;
        assertEquals(expectedCommission, commissionService.calculateCommission(order.getProduct(), order.getCustomer(), order.getEmployee(), order.getAmount()));
    }
}