package com.pluralsight;

import java.time.LocalDateTime;

public class Employee {
    private int employeeId;
    private String name, department;
    private double payRate, hoursWorked, startTime;



    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;



    }

    public void punchTimeCard(double time){
        if (startTime != -1){
            punchIn(time);
        }else{
            punchOut(time);
        }
    }
    public void punchIn(){
        LocalDateTime now = LocalDateTime.now();

        double hour = now.getHour();
        double minute = now.getMinute();

        double time = hour + (minute / 60);
        punchIn(time);
    }

    public void punchIn(double time){
        startTime = time; // saves the time that was passed in
    }

    public void punchOut(double time){

        this.hoursWorked += time - startTime; // uses the time passed in
        startTime = -1;
    }

    public void punchOut(){
        LocalDateTime now = LocalDateTime.now();
        double hour = now.getHour();
        double minute = now.getMinute();

        double time = hour + (minute / 60);
        punchOut(time);
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
        double regularHours;
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
        double totalPay = (this.getRegularHours() * this.getPayRate()) + (this.getOvertimeHours() * (this.getPayRate() * 1.5));
        return totalPay;
    }
}
