package com.oops.encapsulation;

public class Employee {
//    static int empID = 101;

    private int empID = 103;
    private int basicSal = 20000;
    private int incentive = 500;
    private int phoneNo;
    private String name;
    private int newBasicSal;
    private int newIncentive;

    //     {created private constructor method}
    Employee() {
        phoneNo = 123456678;
        name = "Pramod";
    }

    Employee(String empName, int phone) {
        phoneNo = phone;
        name = empName;
    }


    private void countSalaries() {
        System.out.println(basicSal + incentive);
    }

     //Create Constructor
    Employee(int empID,int basicSal, int incentive, int phoneNo, String name) {
        this.empID = empID;
        this.basicSal = basicSal;
        this.incentive = incentive;
        this.phoneNo = phoneNo;
        this.name = name;
    }
    // Getter method
    int getBasicSal() {
        return basicSal;
    }
    int getIncentive() {
        return incentive;
    }
    int getPhoneNo() {
        return phoneNo;
    }
    String getName() {
        return name;
    }

    // Setter method
    void setBasicSal(int newBasicSal) {
        this.basicSal = newBasicSal;
    }

    void setIncentive(int newIncentive) {
        this.incentive = newIncentive;
    }

}

class EmployeeTest {
    public static void main(String[] args) {
        Employee engineer = new Employee("Surya", 12345678);

        engineer.setIncentive(1000);
        engineer.setBasicSal(30000);
//        System.out.println(engineer.empID);
        System.out.println(engineer.getBasicSal());
        System.out.println(engineer.getIncentive());
        System.out.println(engineer.getPhoneNo());
        System.out.println(engineer.getName());


        Employee eng2 = new Employee();
        System.out.println(eng2.getName());
        System.out.println(eng2.getPhoneNo());

//        System.out.println(Employee.empID);   // {while using static keyword}
    }
}


/*

object ----> Real life entity
lass -----> Virtual entity

Encapsulation ------> Encapsulation is the rapping of data in single unit. It is the first pillar of oops.
 */

