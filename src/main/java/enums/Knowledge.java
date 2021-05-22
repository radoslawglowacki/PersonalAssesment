package enums;

public enum Knowledge {

    PYTHON("Python language"),
    WEB("Web Languages knowledge"),
    JAVA_SE("Java SE"),
    JAVA_EE("Java_EE");

    private String knowledge;

    Knowledge(String knowledge) {
        this.knowledge = knowledge;
    }

    public String getKnowledge() {
        return knowledge;
    }
}
