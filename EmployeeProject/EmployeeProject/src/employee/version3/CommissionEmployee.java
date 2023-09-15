/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.version3;

/**
 *
 * @author User
 */
public class CommissionEmployee extends Employee {
    private double totalSales;

    public CommissionEmployee() {
        super();
    }
    
    public CommissionEmployee(int empID, String fname, String lname, String mname, String empDateHired, String empBirthDate) {
        super(empID, fname, lname, mname, empDateHired, empBirthDate);
    }
    
    public CommissionEmployee(int empID, String fname, String lname, String mname, String empDateHired, String empBirthDate, double totalSales) {
        super(empID, fname, lname, mname, empDateHired, empBirthDate);
        this.totalSales = totalSales;
    }

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }
    
    public double computeSalary() {
        double salary = 0.05 * this.totalSales;
        
        if (this.totalSales >= 50000.0 && this.totalSales < 100000.0) {
            salary = 0.2 * this.totalSales;
        } else if (this.totalSales >= 100000.0 && this.totalSales < 500000.0) {
            salary = 0.3 * this.totalSales;
        } else if (this.totalSales >= 500000.0) {
            salary = 0.5 * this.totalSales;
        }
        
        return salary;
    }
    
    @Override
    public void displayInfo() {
        StringBuilder sb = new StringBuilder();
        super.displayInfo();
        sb.append(String.format("Total Sales: %.2f\n", this.totalSales));
        
        System.out.println(sb.toString());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        String parentString = super.toString();
        sb.append(parentString);
        sb.append(String.format("Total Sales: %.2f\n", this.totalSales));
        sb.append(String.format("Salary: %.2f\n", this.computeSalary()));
        
        return sb.toString();
    }
}
