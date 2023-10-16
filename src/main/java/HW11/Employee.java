package HW11;

import java.util.Objects;

public class Employee {
    protected String name;
    protected String address;
    protected double salary;
    protected String position;

    public Employee(String name, String address, double salary, String position) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.position = position;
    }

    public double calculateBonus() {
        return salary * 0.2;
    }

    public String performanceReport() {
        return "Performance report for " + position + " " + name + " --> Good";
    }

    public String jobDescription() {
        return "Employee performs such kind of job: ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return position == employee.position && Double.compare(employee.salary, salary) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address, salary, position);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                ", position='" + position + '\'' +
                '}';
    }

}
