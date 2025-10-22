package com.pluralsight;

import java.time.LocalDateTime;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private double startTime;

    public Employee(int employeeId, String name, String department, double payRate, int hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    //derived getters
    public double getRegularHours() {
        if(this.getHoursWorked() > 40){
            return 40;
        }
        return this.getHoursWorked();
    }

    public double getOvertimeHours() {
        if (this.getHoursWorked() > 40) {
            return this.getHoursWorked() - 40;
        }
        return 0;
    }
    public void punchedIn(double time){
        this.startTime = time;
    }

    public void punchedOut(double time){
        this.hoursWorked += time - this.startTime;
    }

    public void punchIn(){
        LocalDateTime now = LocalDateTime.now();
        double currentTime = now.getHour() + (now.getMinute() / 60.0);

        this.punchIn(currentTime);
    }

    public double getTotalPay() {

        double regularPay = this.getRegularHours() * this.getPayRate();
        double overTimePay = this.getOvertimeHours() * this.getPayRate() * 1.5;

        return regularPay + overTimePay;
    }
    public void punchOut(){
        LocalDateTime now = LocalDateTime.now();
        double currentTime = now.getHour() + (now.getMinute() / 60.0);

        this.punchOut(currentTime);
    }

    public void punchTimeCard(double punchInTime, double punchOutTime){
        this.punchIn(punchedInTime);
        this.punchOut(punchedOutTime);
    }
}