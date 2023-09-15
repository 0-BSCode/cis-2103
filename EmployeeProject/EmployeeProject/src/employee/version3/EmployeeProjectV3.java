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
public class EmployeeProjectV3 {
        /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        HourlyEmployee hEmp = new HourlyEmployee(0, "Bryan", "Sanchez", "Pelaez", "08/09/2022", "09/02/2002", 45f, 10f);
//        System.out.println(hEmp);
//        hEmp.displayInfo();
//        
//        PieceWorkerEmployee pEmp = new PieceWorkerEmployee(0, "Bryan", "Sanchez", "Pelaez", "08/09/2022", "09/02/2002", 500, 10f);
//        System.out.println(pEmp);
//        pEmp.displayInfo();
        
//        CommissionEmployee cEmp = new CommissionEmployee(0, "Bryan", "Sanchez", "Pelaez", "07/08/2023", "09/02/2002", 107000.0);
//        System.out.println(cEmp);
//        cEmp.displayInfo();

        BasePlusCommissionEmployee bcEmp = new BasePlusCommissionEmployee(0, "Bryan", "Sanchez", "Pelaez", "07/08/2023", "09/02/2002", 107000.0, 50000.0);
        System.out.println(bcEmp);
        bcEmp.displayInfo();
    }
}
