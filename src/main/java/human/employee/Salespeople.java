package human.employee;

import human.student.Student;

public class Salespeople extends SchoolEmployee {

    public Salespeople(String name, int phoneNumber, int birthday, int salary) {
        super(name, phoneNumber, birthday, salary);
    }

    public void offerJobForStudent(Student student) {
        System.out.println("I want to offer you job proposition" + student.getName());
    }

}
