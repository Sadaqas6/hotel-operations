package com.pluralsight;

import java.time.LocalDateTime;

public class Employee {
    private int employeeId;
    private String name, department;
    private double payRate, hoursWorked;
    private int startTime = -1;

    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
        this.startTime = -1;
    }

    public void punchTimeCard(int time) {
        if (startTime == -1) {
            punchIn(time);
        } else {
            punchOut(time);
        }
    }

    public void punchIn() {
        LocalDateTime now = LocalDateTime.now();
        int hour = now.getHour();
        punchIn(hour);
    }

    public void punchIn(int time) {
        startTime = time;
    }

    public void punchOut(int time) {
        this.hoursWorked += time - startTime;
        startTime = -1;
    }

    public void punchOut() {
        LocalDateTime now = LocalDateTime.now();
        int hour = now.getHour();
        punchOut(hour);
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

    public double getRegularHours() {
        double regularHours;
        if (hoursWorked > 40) {
            regularHours = 40;
        } else {
            regularHours = hoursWorked;
        }
        return regularHours;
    }

    public double getOvertimeHours() {
        double overtimeHours = 0;
        if (hoursWorked > 40) {
            overtimeHours = hoursWorked - 40;
        }
        return overtimeHours;
    }

    public double getTotalPay() {
        double totalPay = (getRegularHours() * getPayRate()) + (getOvertimeHours() * (getPayRate() * 1.5));
        return totalPay;
    }
}