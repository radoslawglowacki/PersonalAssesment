package human.employee;

import enums.Knowledge;
import enums.Modules;

public class Mentor extends SchoolEmployee {

    private Knowledge konownLanguages;
    private Modules currentModule;


    public Mentor(String name, int phoneNumber, int birthday, Knowledge konownLanguages, int salary) {
        super(name, phoneNumber, birthday, salary);
        this.konownLanguages = konownLanguages;
    }

    public Knowledge getKonownLanguages() {
        return konownLanguages;
    }

    public void setKonownLanguages(Knowledge konownLanguages) {
        this.konownLanguages = konownLanguages;
    }

    public Modules getCurrentModule() {
        return currentModule;
    }

    public void setCurrentModule(Modules currentModule) {
        this.currentModule = currentModule;
    }

}
