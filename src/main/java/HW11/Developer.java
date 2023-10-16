package HW11;

public class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, String address, double salary, String programmingLanguage) {
        super(name, address, salary, "Developer");
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public String performanceReport() {
        return "Performance report for " + position + " " + name + " --> Good";
    }

    @Override
    public String jobDescription() {
        return "Developer codes in " + programmingLanguage;
    }
}
