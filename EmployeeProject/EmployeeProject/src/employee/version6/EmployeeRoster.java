package employee.version6;

import java.util.ArrayList;

class EmployeeRoster {
    private ArrayList<Employee> empList;
    private String formatStr = "| %-7s | %-60s | %-60s | %-15s |";


    public EmployeeRoster() {
        this.empList = new ArrayList<Employee>();
    }

    public ArrayList<Employee> getEmpList() {
        return empList;
    }

    public ArrayList<Employee> getEmployeeList() {
        return this.empList;
    }
    private void printRow() {
        System.out.println(String.format("%-100s", "-".repeat(155)));
    }

    public void displayAllEmployees() {
        if (this.empList.isEmpty()) {
            System.out.println("Roster is empty!\n");
        } else {
            this.printRow();
            System.out.println(String.format(formatStr, "ID", "Name", "Type", "Salary"));
            for (Employee currEmployee : this.empList) {
                this.printRow();;
                System.out.println(String.format(formatStr, currEmployee.getEmpID(), currEmployee.getEmpName(), currEmployee.getClass().getSimpleName(), currEmployee.computeSalary()));
            }
            this.printRow();
        }
    }

    public int countEmployeeType(String type) {
        int ctr = 0;

        for (Employee employee : this.empList) {
            if (employee.getClass().getSimpleName().equals(type)) {
                ctr++;
            }
        }

        return ctr;
    }

    public void displayEmployeeType(String type) {
        EmployeeRoster roster = new EmployeeRoster();
        for (Employee employee : this.empList) {
            if (employee.getClass().getSimpleName().equals(type)) {
                roster.addEmployee(employee);
            }
        }

        roster.displayAllEmployees();
    }

    public boolean addEmployee(Employee e) {
        boolean res = true;
        try {
            this.empList.add(e);
        } catch (Exception err) {
            res = false;
        }


        return res;
    }

    public Employee deleteEmployee(int id) {
        Employee emp = null;
        int i;

        for (i = 0; i < this.empList.size() && this.empList.get(i).getEmpID() != id; i++) {}

        if (i < this.empList.size()) {
            emp = this.empList.get(i);
            for (; i < this.empList.size() - 1; i++) {
                this.empList.set(i, this.empList.get(i));
            }
        }

        return emp;
    }

    public void updateEmployee(int id, Name name) {
        for (int i = 0; i < this.empList.size(); i++) {
            if (this.empList.get(i).getEmpID() == id) {
                Employee emp = this.empList.get(i);
                emp.setEmpName(name);
                this.empList.set(i, emp);
            }
        }
    }

    public void searchEmployee(String name) {
        EmployeeRoster roster = new EmployeeRoster();

        for (Employee employee: this.empList) {
            if (employee.getEmpName().toString().contains(name)) {
                roster.addEmployee(employee);
            }
        }

        roster.displayAllEmployees();
    }
}
