/*
Write a program for billing system for a shopping mall. Create a class BillGenerator that
uses method overloading to generate bills based on customer type:
generateBill(int itemTotal): For regular customers, apply no discount.
generateBill(int itemTotal, int discount): For privileged customers, apply flat discount in
rupees.
generateBill(int itemTotal, double discountPercent): For festive offers, apply percentage
discount.
Write a program to display the final bill amount using appropriate overloaded method
based on customer category 
*/

import java.util.*;

class BillGenerator{

    // for regular customer 
    public double generateBill(int itemTotal){
        return itemTotal;
    }

    // for privileged customer
    public double generateBill(int itemTotal, int discount){
        return itemTotal - discount;
    }

    // for festive offers
    public double generateBill(int itemTotal, double discountPercent){
        return (itemTotal * (discountPercent / 100));
    }
}

public class Pr2_4{
    public static void main(String[] args){
        BillGenerator bill = new BillGenerator();

        int total = 5000;

        System.out.println("Total Amt: " +  total);
        System.out.println("Bill - Regular Customer: " + generateBill(total))
    }
}