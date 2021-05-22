package module;

import enums.Knowledge;
import enums.Modules;
import human.Human;
import human.employee.Mentor;
import human.student.Student;

import java.util.ArrayList;
import java.util.List;

public class SchoolModule {
    private List<Student> students;
    private final List<Mentor> mentors;
    private final Modules module;
    private final Knowledge knowledge;

    public SchoolModule(Modules module, Knowledge knowledge) {
        this.students = new ArrayList<>();
        this.mentors = new ArrayList<>();
        this.module = module;
        this.knowledge = knowledge;
    }

    public void addToModule(Human human) {
        if (human instanceof Mentor) {
            if (((Mentor) human).getKonownLanguages().equals(this.knowledge)) {
                ((Mentor) human).setCurrentModule(this.module);
                mentors.add((Mentor) human);
            } else {
                System.out.println("this mentor can't be in this module");
            }
        } else if (human instanceof Student) {
            if (((Student) human).getCurentModule().equals(this.module)) {
                students.add((Student) human);
            } else {
                System.out.println("You cant add this student");
            }
        }
    }

    public void displayListOfStudnets() {
        for (Student student : students) {
            System.out.println(student.getName());
            System.out.println(student.getProgres());
            System.out.println(student.getCurentModule());
        }
    }

    public void displayListOfMentors() {
        for (Mentor mentor : mentors) {
            System.out.println(mentor.getName());
        }
    }


    public void increaseProgresOfAllStudnets() {
        for (Student studnet : students) {
            studnet.increaseProgres();
        }
    }

    public Modules getModule() {
        return module;
    }

    public List<Student> getStudents() {
        return students;
    }
}
