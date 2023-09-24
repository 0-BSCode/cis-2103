package employee.version4;

public class EmployeeRoster {
    private Employee[] empList;
    private int count;
    private int size;

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

    public void displayAllEmployees() {
        for (int i = 0; i < this.count; i++) {
            this.empList[i].displayInfo();
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
        for (int i = 0; i < this.count; i++) {
            if (this.empList[i].getClass().getSimpleName().equals(type)) {
                this.empList[i].displayInfo();
            }
        }
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
        // TODO: Dummy values if no element has id
        Employee emp = new Employee();
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

    public Employee searchEmployee(int id) {
        Employee res = new Employee();

        for (int i = 0; i < this.count; i++) {
            if (this.empList[i].getEmpID() == id) {
                res = this.empList[i];
            }
        }

        return res;
    }
}
