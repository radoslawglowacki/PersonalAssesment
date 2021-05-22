import enums.Knowledge;
import enums.Modules;
import human.Human;
import human.employee.Salespeople;
import human.student.Student;
import module.SchoolModule;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ProgrammingSchool {

    private final List<SchoolModule> modules;
    private final List<Salespeople> salespeople;

    public ProgrammingSchool() {
        this.modules = new ArrayList<>();
        this.salespeople = new ArrayList<>();
    }

    public void generateModules() {
        for (int i = 0; i < Modules.values().length; i++) {
            modules.add(new SchoolModule(Modules.values()[i], Knowledge.values()[i]));
        }
    }

    public void addSales(Salespeople sales){
        salespeople.add(sales);
    }

    public void addMemberToModule(Human human, int idModule) {
        modules.get(idModule).addToModule(human);
    }

    public void run(){
        for (int i = 0; i< 20; i++) {
            for (SchoolModule module: modules) {
                displayListOfMembersInGroups(module);
                increaseProgresOfAllStudentsInModule(module);
//                checkStudentsModuleAndSetCorrect(module);
            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void displayListOfMembersInGroups(SchoolModule module) {
            System.out.println(module.getModule().getModule());
            System.out.println("Mentors:");
            module.displayListOfMentors();
            System.out.println();
            System.out.println("Studnets:");
            module.displayListOfStudnets();
            System.out.println();
    }

    private void increaseProgresOfAllStudentsInModule(SchoolModule module) {
        module.increaseProgresOfAllStudnets();
    }

    private void pickRandomSalesAndOffer(Student student){
        int countSales = salespeople.size();
        if(countSales> 0){
            salespeople.get(new Random().nextInt(countSales)).offerJobForStudent(student);
        }
    }

//TODO
    private void checkStudentsModuleAndSetCorrect(SchoolModule module) {
        List<Student> students = module.getStudents();
        if (students.size() > 0) {
            for (Student student : students) {
                if (!student.isGraduated()) {
                    if (!student.getCurentModule().equals(module.getModule())) {
                        int oldModuleIndex = modules.indexOf(module);
                        int newModuleIndex = oldModuleIndex + 1;
                        modules.get(newModuleIndex).addToModule(student);
                        students.remove(student);
                    }
                } else {
                    module.getStudents().remove(student);
                    System.out.println(student.getName() + " finishes the course");
                    pickRandomSalesAndOffer(student);
                }
            }
        }
    }
}
