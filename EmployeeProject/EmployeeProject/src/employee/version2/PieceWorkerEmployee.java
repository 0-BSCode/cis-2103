/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.version2;

/**
 *
 * @author User
 */
public class PieceWorkerEmployee extends Employee {
    private int totalPiecesFinished;
    private float ratePerPiece;

    public PieceWorkerEmployee() {
        super();
    }
    
    public PieceWorkerEmployee(int empID, String empName, String empDateHired, String empBirthDate) {
        super(empID, empName, empDateHired, empBirthDate);
        this.ratePerPiece = 7.5f;
    }
    
    public PieceWorkerEmployee(int empID, String empName, String empDateHired, String empBirthDate, int totalPiecesFinished, float ratePerPiece) {
        super(empID, empName, empDateHired, empBirthDate);
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
    }

    public int getTotalPiecesFinished() {
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
    
    @Override
    public void displayInfo() {
        StringBuilder sb = new StringBuilder();
        super.displayInfo();
        sb.append(String.format("Total Pieces Finished: %d\n", this.totalPiecesFinished));
        sb.append(String.format("Rate per Piece: %.2f\n", this.ratePerPiece));
        
        System.out.println(sb.toString());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        String parentString = super.toString();
        sb.append(parentString);
        sb.append(String.format("Total Pieces Finished: %d\n", this.totalPiecesFinished));
        sb.append(String.format("Rate per Piece: %.2f\n", this.ratePerPiece));
        sb.append(String.format("Salary: %.2f\n", this.computeSalary()));
        
        return sb.toString();
    }
}
