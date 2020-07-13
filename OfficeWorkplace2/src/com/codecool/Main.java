package com.codecool;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        OfficeWorkers officeWorker1 = new OfficeWorkers("Andrei",Group.OFFICE,SeniorityPosition.JUNIOR);
        OfficeWorkers officeWorker2 = new OfficeWorkers("Ion",Group.OFFICE,SeniorityPosition.SENIOR);

//        System.out.println(officeWorker1);
//        System.out.println(officeWorker2);

        SalesPeople salesPeople1 = new SalesPeople("Andreea",Group.SALES );
        SalesPeople salesPeople2 = new SalesPeople("Ioana",Group.SALES );

//        System.out.println(salesPeople1);
//        System.out.println(salesPeople2);

        List<SalesPeople> tempSalesPeopleList = new ArrayList<>();

        tempSalesPeopleList.add(salesPeople1);
        tempSalesPeopleList.add(salesPeople2);
        int numberOfEmployeeAssigned = tempSalesPeopleList.size();

        GroupLeads groupLeads1 = new GroupLeads("Belu",Group.SALES,numberOfEmployeeAssigned);
//        System.out.println(groupLeads1);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(officeWorker1);
        employeeList.add(officeWorker2);
        employeeList.add(salesPeople1);
        employeeList.add(salesPeople2);
        employeeList.add(groupLeads1);

        int numberOfMonths = 12;
        testSalary(employeeList, numberOfMonths);

    }

    private static void testSalary(List<Employee> employeeList, int numberOfMonths) {
        for (int i = 0; i <numberOfMonths ; i++) {
            System.out.println("Month " + i);
            for (Employee employee : employeeList) {
                employee.calculateSalary();
                System.out.println(employee.getEmployeeId()+" "
                                    +employee.getName()+" "
                                    +employee.getSalary());
            }
        }
    }
}
