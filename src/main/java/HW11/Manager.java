package HW11;

public class Manager extends Employee {
    public Manager(String name, String address, double salary) {
        super(name, address, salary, "Manager");
    }

    @Override
    public double calculateBonus() {
        return salary * 0.2;
    }

    @Override
    public String jobDescription() {
        return "Manager performs management processes for employees";
    }

    @Override
    public String toString() {
        return "Manager{" +
                ", name=" + name +
                ", address=" + address +
                ", salary=" + salary +
                ", position='" + position + '\'' +
                '}';
    }
}
