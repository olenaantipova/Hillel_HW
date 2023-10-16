package HW11;

public class QA extends Employee {
    public QA(String name, String address, double salary) {
        super(name, address, salary, "QA");
    }

    @Override
    public String performanceReport() {
        return "Performance report for " + position + " " + name + " --> Excellent";
    }

    @Override
    public String jobDescription() {
        return "QA is responsible for software quality";
    }
}
