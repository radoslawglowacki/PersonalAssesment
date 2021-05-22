package human.student;

import enums.Modules;
import human.Human;

import java.util.Arrays;

public class Student extends Human {

    private int progres;
    private Modules curentModule;
    private boolean isGraduated;

    public Student(String name, int phoneNumber, int birthday) {
        super(name, phoneNumber, birthday);
        this.progres = 0;
        this.curentModule = Modules.PROGRAMMING_BASIC;
        this.isGraduated = false;
    }

    public void increaseProgres() {
        progres += 20;
        checkProgresAndSetModule();
    }

    private void checkProgresAndSetModule() {
        if (!isGraduated) {
            if (progres == 100) {
                progres = 0;
                int index = Arrays.asList(Modules.values()).indexOf(curentModule);
                if (index < 3) {
                    curentModule = Modules.values()[index + 1];
                } else {
                    isGraduated = true;
                    System.out.println(getName() + " finish the school");
                }
            }
        }
    }

    public int getProgres() {
        return progres;
    }

    public void setProgres(int progres) {
        this.progres = progres;
    }

    public Modules getCurentModule() {
        return curentModule;
    }

    public void setCurentModule(Modules curentModule) {
        this.curentModule = curentModule;
    }

    public boolean isGraduated() {
        return isGraduated;
    }
}
