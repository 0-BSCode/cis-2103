package employee.version6;

import java.util.ArrayList;

public class EmployeeRoster {
    private ArrayList<Employee> empList;
    private int size;

    public EmployeeRoster() {
        this.size = 100;
        this.empList = new ArrayList<Employee>();
    }

    public EmployeeRoster(int size) {
        this.size = size;
        this.empList = new ArrayList<Employee>();
    }

    public ArrayList<Employee> getEmpList() {
        return empList;
    }

    public ArrayList<Employee> getEmployeeList() {
        return this.empList;
    }

    public void displayAllEmployees() {
        for (Employee employee : this.empList) {
            employee.displayInfo();
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
        for (Employee employee : this.empList) {
            if (employee.getClass().getSimpleName().equals(type)) {
                employee.displayInfo();
            }
        }
    }

    public boolean addEmployee(Employee e) {
        boolean res = false;
        if (this.empList.size() >= this.size) {
            System.out.println("Employee Roster is full!\n");
        } else {
            this.empList.add(e);
            res = true;
        }

        return res;
    }

    public Employee deleteEmployee(int id) {
        // TODO: Dummy values if no element has id
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

    public Employee searchEmployee(int id) {
        Employee res = null;

        for (int i = 0; i < this.empList.size(); i++) {
            if (this.empList.get(i).getEmpID() == id) {
                res = this.empList.get(i);
            }
        }

        return res;
    }
}
