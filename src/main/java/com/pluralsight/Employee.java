package com.pluralsight;

public class Employee {
    private int employeeId;
    private String name, department;
    private double payRate, hoursWorked;


    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;


    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getPayRate() {
        return payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public double getRegularHours(){
        double regularHours = 0;
        if(hoursWorked > 40){
            regularHours = 40;
        }else{
            regularHours = hoursWorked;
        }
        return regularHours;
    }

    public double getOvertimeHours(){
       double overtimeHours = 0;
        if(hoursWorked > 40){
            overtimeHours = hoursWorked - 40;
        }
        return overtimeHours;
    }

    public double getTotalPay(){
        double totalPay = (getRegularHours() * getPayRate() + getOvertimeHours() * getPayRate() * 1.5);
        return totalPay;
    }
}
