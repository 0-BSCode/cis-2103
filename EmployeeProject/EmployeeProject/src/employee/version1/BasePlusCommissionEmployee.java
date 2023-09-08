/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.version1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author User
 */
public class BasePlusCommissionEmployee {
    private int empID;
    private String empName;
    private Date empDateHired;
    private Date empBirthDate;
    private double totalSales;
    private double baseSalary;
    
    public BasePlusCommissionEmployee() {}

    public BasePlusCommissionEmployee(int empID, String empName, String empDateHired, String empBirthDate, double totalSales, double baseSalary) {
        this.empID = empID;
        this.empName = empName;
        this.empBirthDate = DateParser.convertStringToDate(empBirthDate);
        this.empDateHired = DateParser.convertStringToDate(empDateHired);
        this.totalSales = totalSales;
        this.baseSalary = baseSalary;
    }
    
    
    public BasePlusCommissionEmployee(int empID, String empName, String empDateHired, String empBirthDate) {
        this.empID = empID;
        this.empName = empName;
        this.empBirthDate = DateParser.convertStringToDate(empBirthDate);
        this.empDateHired = DateParser.convertStringToDate(empDateHired);
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Date getEmpDateHired() {
        return empDateHired;
    }

    public void setEmpDateHired(String empDateHired) {
        this.empDateHired = DateParser.convertStringToDate(empDateHired);
    }

    public Date getEmpBirthDate() {
        return empBirthDate;
    }

    public void setEmpBirthDate(String empBirthDate) {
        this.empBirthDate = DateParser.convertStringToDate(empBirthDate);
    }

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }
    
    public double computeSalary() {
        double commission = 0.05 * this.totalSales;
        
        if (this.totalSales >= 50000.0 && this.totalSales < 100000.0) {
            commission = 0.2 * this.totalSales;
        } else if (this.totalSales >= 100000.0 && this.totalSales < 500000.0) {
            commission = 0.3 * this.totalSales;
        } else if (this.totalSales >= 500000.0) {
            commission = 0.5 * this.totalSales;
        }
        
        return this.baseSalary + commission;
    }
        
    public void displayInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("\n----- EMPLOYEE INFORMATION -----\n"));
        sb.append(String.format("ID: %d\n", this.empID));
        sb.append(String.format("Name: %s\n", this.empName));
        sb.append(String.format("Date Hired: %s\n", DateParser.convertDateToString(this.empDateHired)));
        sb.append(String.format("Date Birthed: %s\n", DateParser.convertDateToString(this.empBirthDate)));
        sb.append(String.format("Total Sales: %.2f\n", this.totalSales));
        sb.append(String.format("Base Salary: %.2f\n", this.baseSalary));
        sb.append(String.format("Salary: %.2f\n", this.computeSalary()));
        
        System.out.println(sb.toString());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("ID: %d\n", this.empID));
        sb.append(String.format("Name: %s\n", this.empName));
        sb.append(String.format("Date Hired: %s\n", DateParser.convertDateToString(this.empDateHired)));
        sb.append(String.format("Date Birthed: %s\n", DateParser.convertDateToString(this.empBirthDate)));
        sb.append(String.format("Total Sales: %.2f\n", this.totalSales));
        sb.append(String.format("Base Salary: %.2f\n", this.baseSalary));
        
        return sb.toString();
    }
}
