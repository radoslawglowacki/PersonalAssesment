import enums.Knowledge;
import human.employee.Mentor;
import human.student.Student;

public class App {
    public static void main(String[] args) {

        ProgrammingSchool programmingSchool = new ProgrammingSchool();

        programmingSchool.generateModules();

        programmingSchool.addMemberToModule(new Student("radek", 555555555, 1995), 0);

        programmingSchool.addMemberToModule(new Mentor("Arek", 5555555, 1980, Knowledge.PYTHON, 1500), 0);

        programmingSchool.run();
    }
}
