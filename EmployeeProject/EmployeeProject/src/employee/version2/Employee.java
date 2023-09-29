/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.version2;

import employee.version1.DateParser;
import java.util.Date;

/**
 *
 * @author User
 */
public class Employee {
    private int empID;
    private String empName;
    private Date empDateHired;
    private Date empBirthDate;

    public Employee() {}
    
    public Employee(int empID, String empName, String empDateHired, String empBirthDate) {
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

    public void setEmpDateHired(Date empDateHired) {
        this.empDateHired = empDateHired;
    }

    public Date getEmpBirthDate() {
        return empBirthDate;
    }

    public void setEmpBirthDate(Date empBirthDate) {
        this.empBirthDate = empBirthDate;
    }
    
    public void displayInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("\n----- EMPLOYEE INFORMATION -----\n"));
        sb.append(String.format("ID: %d\n", this.empID));
        sb.append(String.format("Name: %s\n", this.empName));
        sb.append(String.format("Date Hired: %s\n", DateParser.convertDateToString(this.empDateHired)));
        sb.append(String.format("Date Birthed: %s", DateParser.convertDateToString(this.empBirthDate)));
        
        System.out.println(sb.toString());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("ID: %d\n", this.empID));
        sb.append(String.format("Name: %s\n", this.empName));
        sb.append(String.format("Date Hired: %s\n", DateParser.convertDateToString(this.empDateHired)));
        sb.append(String.format("Date Birthed: %s\n", DateParser.convertDateToString(this.empBirthDate)));
        
        return sb.toString();
    }
}
