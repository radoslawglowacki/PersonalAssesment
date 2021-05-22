package enums;

public enum Modules {

    PROGRAMMING_BASIC("Programming basic"),
    WEB_MODULE("WEB module"),
    OOP_MODULE("OOP module"),
    ADVANCED_MODULE("Advanced module");

    private String module;

    Modules(String module) {
        this.module = module;
    }

    public String getModule() {
        return module;
    }
}
