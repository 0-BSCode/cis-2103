package employee.version6;

public class EmployeeProjectV6 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HourlyEmployee hEmp = new HourlyEmployee(0, "Bryan", "Sanchez", "Pelaez", "08/09/2022", "09/02/2002", 45f, 10f);
        PieceWorkerEmployee pEmp = new PieceWorkerEmployee(1, "Bryan", "Sanchez", "Pelaez", "08/09/2022", "09/02/2002", 500, 10f);
        CommissionEmployee cEmp = new CommissionEmployee(2, "Bryan", "Sanchez", "Pelaez", "07/08/2023", "09/02/2002", 107000.0);
        BasePlusCommissionEmployee bcEmp = new BasePlusCommissionEmployee(3, "Bryan", "Sanchez", "Pelaez", "07/08/2023", "09/02/2002", 107000.0, 50000.0);
        HourlyEmployee hEmp2 = new HourlyEmployee(4, "John", "Uyheng", "Pelaez", "13/03/2022", "09/02/2002", 42f, 10f);

        EmployeeRoster empRoster = new EmployeeRoster();

        empRoster.addEmployee(hEmp);
        empRoster.addEmployee(pEmp);
        empRoster.addEmployee(cEmp);
//        empRoster.deleteEmployee(0);
        empRoster.updateEmployee(0, new Name("James", "Test", "Deez"));
        empRoster.addEmployee(bcEmp);
        empRoster.addEmployee(hEmp2);
        empRoster.displayAllEmployees();

        int hEmpCount = empRoster.countEmployeeType("HourlyEmployee");

//        System.out.println(hEmpCount);

        Employee searchEmp = empRoster.searchEmployee(10);
        if (searchEmp != null) {
            searchEmp.displayInfo();
        }
    }
}
