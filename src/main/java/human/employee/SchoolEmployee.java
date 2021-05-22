package human.employee;

import human.Human;

public abstract class SchoolEmployee extends Human {
    private int salary;

    public SchoolEmployee(String name, int phoneNumber, int birthday, int salary) {
        super(name, phoneNumber, birthday);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
