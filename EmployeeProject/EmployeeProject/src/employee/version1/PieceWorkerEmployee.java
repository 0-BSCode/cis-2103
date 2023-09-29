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
public class PieceWorkerEmployee {
    private int empID;
    private String empName;
    private Date empDateHired;
    private Date empBirthDate;
    private int totalPiecesFinished;
    private float ratePerPiece;
    
    public PieceWorkerEmployee() {}
    
    public PieceWorkerEmployee(int empID, String empName, String empDateHired, String empBirthDate, int totalPiecesFinished, float ratePerPiece) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = DateParser.convertStringToDate(empDateHired);
        this.empBirthDate = DateParser.convertStringToDate(empBirthDate);
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
    }
    
    public PieceWorkerEmployee(int empID, String empName, String empDateHired, String empBirthDate) {
        this.empID = empID;
        this.empName = empName;
        this.empBirthDate = DateParser.convertStringToDate(empBirthDate);
        this.empDateHired = DateParser.convertStringToDate(empDateHired);
        this.ratePerPiece = 7.5f;
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

    public float getTotalPiecesFinished() {
        return totalPiecesFinished;
    }

    public void setTotalPiecesFinished(int totalPiecesFinished) {
        this.totalPiecesFinished = totalPiecesFinished;
    }

    public float getRatePerPiece() {
        return ratePerPiece;
    }

    public void setRatePerPiece(float ratePerPiece) {
        this.ratePerPiece = ratePerPiece;
    }
    
    public double computeSalary() {
        double baseSalary = this.ratePerPiece * this.totalPiecesFinished;
        int bonusPieces = this.totalPiecesFinished / 100;
        
        return baseSalary + (bonusPieces * 10 * this.ratePerPiece);
    }
    
    public void displayInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("\n----- EMPLOYEE INFORMATION -----\n"));
        sb.append(String.format("ID: %d\n", this.empID));
        sb.append(String.format("Name: %s\n", this.empName));
        sb.append(String.format("Date Hired: %s\n", DateParser.convertDateToString(this.empDateHired)));
        sb.append(String.format("Date Birthed: %s\n", DateParser.convertDateToString(this.empBirthDate)));
        sb.append(String.format("Total Pieces Finished: %d\n", this.totalPiecesFinished));
        sb.append(String.format("Rate per Piece: %.2f\n", this.ratePerPiece));
        
        System.out.println(sb.toString());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("ID: %d\n", this.empID));
        sb.append(String.format("Name: %s\n", this.empName));
        sb.append(String.format("Date Hired: %s\n", DateParser.convertDateToString(this.empDateHired)));
        sb.append(String.format("Date Birthed: %s\n", DateParser.convertDateToString(this.empBirthDate)));
        sb.append(String.format("Total Pieces Finished: %d\n", this.totalPiecesFinished));
        sb.append(String.format("Rate per Piece: %.2f\n", this.ratePerPiece));
        sb.append(String.format("Salary: %.2f\n", this.computeSalary()));
        
        return sb.toString();
    }
}
