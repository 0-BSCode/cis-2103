/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.version1;


/**
 *
 * @author User
 */
public class EmployeeProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HourlyEmployee hEmp = new HourlyEmployee(0, "Bryan", "08/09/2022", "09/02/2002", 45f, 10f);
        PieceWorkerEmployee pEmp = new PieceWorkerEmployee(0, "Bryan", "08/09/2022", "09/02/2002", 500, 10f);
        CommissionEmployee cEmp = new CommissionEmployee(0, "Bryan", "07/08/2023", "09/02/2002", 107000.0);
        BasePlusCommissionEmployee bcEmp = new BasePlusCommissionEmployee(0, "Bryan", "07/08/2023", "09/02/2002", 107000.0, 15.0);

        hEmp.displayInfo();
        pEmp.displayInfo();
        cEmp.displayInfo();
        bcEmp.displayInfo();
    }
    
}
