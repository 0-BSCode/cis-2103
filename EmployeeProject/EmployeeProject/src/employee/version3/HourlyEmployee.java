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
public class HourlyEmployee extends Employee {
    private float totalHoursWorked;
    private float ratePerHour;

    public HourlyEmployee() {
        super();
    }
    
    public HourlyEmployee(int empID, String fname, String lname, String mname, String empDateHired, String empBirthDate) {
        super(empID, fname, lname, mname, empDateHired, empBirthDate);
        this.ratePerHour = 7.5f;
    }
    
    public HourlyEmployee(int empID, String fname, String lname, String mname, String empDateHired, String empBirthDate, float totalHoursWorked, float ratePerHour) {
        super(empID, fname, lname, mname, empDateHired, empBirthDate);
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
    }

    public float getTotalHoursWorked() {
        return totalHoursWorked;
    }

    public void setTotalHoursWorked(float totalHoursWorked) {
        this.totalHoursWorked = totalHoursWorked;
    }

    public float getRatePerHour() {
        return ratePerHour;
    }

    public void setRatePerHour(float ratePerHour) {
        this.ratePerHour = ratePerHour;
    }
    
    public double computeSalary() {
        double baseSalary = 0.0;
        float overchargedHours = this.totalHoursWorked - 40f;
        if (overchargedHours > 0) {
            baseSalary = this.ratePerHour * (overchargedHours * 1.5) + 40 * this.ratePerHour;
        } else {
            baseSalary = this.ratePerHour * this.totalHoursWorked;
        }
        return baseSalary;
    }
    
    @Override
    public void displayInfo() {
        StringBuilder sb = new StringBuilder();
        super.displayInfo();
        sb.append(String.format("Total Hours Worked: %.2f\n", this.totalHoursWorked));
        sb.append(String.format("Rate per Hour: %.2f\n", this.ratePerHour));
        
        System.out.println(sb.toString());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        String parentString = super.toString();
        sb.append(parentString);
        sb.append(String.format("Total Hours Worked: %.2f\n", this.totalHoursWorked));
        sb.append(String.format("Rate per Hour: %.2f\n", this.ratePerHour));
        sb.append(String.format("Salary: %.2f\n", this.computeSalary()));
        
        return sb.toString();
    }
}
