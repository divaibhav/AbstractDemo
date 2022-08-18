package main;

import data.dervied.Manager;
import data.dervied.RegionalHead;

public class Implementation {
    public static void main(String[] args) {
        Manager manager = new Manager("Ramesh", 1234, 50000, 12, 6);
        Manager manager1 = new Manager("Suresh",1236, 60000, 12, 9);

        RegionalHead regionalHead = new RegionalHead("Ravi",1233, 90000,"MPCG", 5,6);
        RegionalHead regionalHead1 = new RegionalHead("Vaibhavi", 1236, 100000, "Goa", 10, 11);

        System.out.println("manager.calculateIncrement(5) = " + manager.calculateIncrement(5));
        System.out.println("manager1.calculateIncrement(5) = " + manager1.calculateIncrement(5));
        System.out.println("regionalHead.calculateIncrement(8) = " + regionalHead.calculateIncrement(8));
        System.out.println("regionalHead1.calculateIncrement(8) = " + regionalHead1.calculateIncrement(8));
    }
}
