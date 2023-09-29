package employee.version4;

public class EmployeeRoster {
    private Employee[] empList;
    private int count;
    private int size;
    private String formatStr = "| %-7s | %-60s | %-60s | %-15s |";

    public EmployeeRoster() {
        this.size = 100;
        this.count = 0;
        this.empList = new Employee[this.size];
    }

    public EmployeeRoster(int size) {
        this.size = size;
        this.count = 0;
        this.empList = new Employee[this.size];
    }

    public Employee[] getEmpList() {
        return empList;
    }

    public Employee[] getEmployeeList() {
        return this.empList;
    }

    public int getCount() {
        return this.count;
    }

    public int getSize() {
        return this.size;
    }

    private void printRow() {
        System.out.println(String.format("%-100s", "-".repeat(155)));
    }

    private double computeEmployeeSalary(Employee e) {
        double res = 0.0;

        switch (e) {
            case HourlyEmployee hEmp -> res = hEmp.computeSalary();
            case PieceWorkerEmployee pEmp -> res = pEmp.computeSalary();
            case CommissionEmployee cEmp -> res = cEmp.computeSalary();
            default -> res = 0.0;
        }

        return res;
    }

    public void displayAllEmployees() {
        if (this.count == 0) {
            System.out.println("Roster is empty!\n");
        } else {
            this.printRow();
            System.out.println(String.format(formatStr, "ID", "Name", "Type", "Salary"));
            for (int i = 0; i < this.count; i++) {
                this.printRow();
                Employee currEmployee = this.empList[i];
                System.out.println(String.format(formatStr, currEmployee.getEmpID(), currEmployee.getEmpName(), currEmployee.getClass().getSimpleName(), this.computeEmployeeSalary(currEmployee)));
            }
            this.printRow();
        }
    }

    public int countEmployeeType(String type) {
        int ctr = 0;

        for (int i = 0; i < this.count; i++) {
            if (this.empList[i].getClass().getSimpleName().equals(type)) {
                ctr++;
            }
        }

        return ctr;
    }

    public void displayEmployeeType(String type) {
        EmployeeRoster employees = new EmployeeRoster();

        for (int i = 0; i < this.count; i++) {
            if (this.empList[i].getClass().getSimpleName().equals(type)) {
                employees.addEmployee(this.empList[i]);
            }
        }

        employees.displayAllEmployees();
    }

    public boolean addEmployee(Employee e) {
        boolean res = false;
        if (this.count >= this.size) {
            System.out.println("Employee Roster is full!\n");
        } else {
            this.empList[this.count] = e;
            this.count++;
            res = true;
        }

        return res;
    }

    public Employee deleteEmployee(int id) {
        Employee emp = null;
        int i;

        for (i = 0; i < this.count && this.empList[i].getEmpID() != id; i++) {}

        if (i < this.count) {
            emp = this.empList[i];
            for (; i < this.count - 1; i++) {
                this.empList[i] = this.empList[i + 1];
            }
            this.count--;
        }

        return emp;
    }

    public void updateEmployee(int id, Name name) {
        for (int i = 0; i < this.count; i++) {
            if (this.empList[i].getEmpID() == id) {
                this.empList[i].setEmpName(name);
            }
        }
    }

    public void searchEmployee(String name) {
        EmployeeRoster employees = new EmployeeRoster();

        for (int i = 0; i < this.count; i++) {
            if (this.empList[i].getEmpName().toString().contains(name)) {
                employees.addEmployee(this.empList[i]);
            }
        }

        employees.displayAllEmployees();
    }
}
