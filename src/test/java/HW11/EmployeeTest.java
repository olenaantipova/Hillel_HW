package HW11;

public class EmployeeTest {
    public static void main(String[] args) {

        Manager manager = new Manager("Marco Polo", "New York, BY684, ap.2", 2000);
        Manager manager1 = new Manager("Yan Edwards", "New York, RT4575, ap.543", 4000);
        Developer developer = new Developer("Anna Cobein", "Washington, HE345, ap.6", 5000, "Java");
        Developer developer1 = new Developer("Alex Cooper", "Los Angeles, RET233, ap.43", 5000, "Java");
        QA qa = new QA("Chris Malfred", "Washington, HFHE3243, ap.25", 4000);
        QA qa1 = new QA("Christina Bradshow", "Washington, HF4343, ap.123", 6000);


        System.out.println(manager.jobDescription());
        System.out.println(developer.jobDescription());
        System.out.println(qa.jobDescription());
        System.out.println(manager.performanceReport());
        System.out.println("Bonus for Manager is " + manager.calculateBonus());
        System.out.println(developer.performanceReport());
        System.out.println("Bonus for Developer is " + developer.calculateBonus());
        System.out.println(qa.performanceReport());
        System.out.println("Bonus for QA is " + qa.calculateBonus());


        System.out.println(manager.equals(manager1));
        System.out.println(developer1.equals(developer));
        System.out.println(qa.equals(qa1));
    }
}
