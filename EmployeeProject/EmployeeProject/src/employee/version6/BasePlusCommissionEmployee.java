/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.version6;

import employee.version1.DateParser;

/**
 *
 * @author User
 */
public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;
     
    public BasePlusCommissionEmployee() {
        super();
    }
    
    public BasePlusCommissionEmployee(int empID, String fname, String lname, String mname, String empDateHired, String empBirthDate) {
        super(empID, fname, lname, mname, empDateHired, empBirthDate);
    }
    
    public BasePlusCommissionEmployee(int empID, String fname, String lname, String mname, String empDateHired, String empBirthDate, double totalSales, double baseSalary) {
        super(empID, fname, lname, mname, empDateHired, empBirthDate, totalSales);
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public double computeSalary() {
        return super.computeSalary() + this.baseSalary;
    }
    
    @Override
    public void displayInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("\n----- EMPLOYEE INFORMATION -----\n"));
        sb.append(String.format("ID: %d\n", super.getEmpID()));
        sb.append(String.format("Name: %s\n", super.getEmpName()));
        sb.append(String.format("Date Hired: %s\n", DateParser.convertDateToString(super.getEmpDateHired())));
        sb.append(String.format("Date Birthed: %s\n", DateParser.convertDateToString(super.getEmpBirthDate())));
        sb.append(String.format("Total Sales: %.2f\n", super.getTotalSales()));
        sb.append(String.format("Base Salary: %.2f\n", this.baseSalary));
        
        System.out.println(sb.toString());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("ID: %d\n", super.getEmpID()));
        sb.append(String.format("Name: %s\n", super.getEmpName()));
        sb.append(String.format("Date Hired: %s\n", DateParser.convertDateToString(super.getEmpDateHired())));
        sb.append(String.format("Date Birthed: %s\n", DateParser.convertDateToString(super.getEmpBirthDate())));
        sb.append(String.format("Total Sales: %.2f\n", super.getTotalSales()));
        sb.append(String.format("Base Salary: %.2f\n", this.baseSalary));
        sb.append(String.format("Salary: %.2f\n", this.computeSalary()));
        
        return sb.toString();
    }
}
