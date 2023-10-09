package HW8;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student("Tom Walker", 19);
        displayStudentInfo(student1);
        displayStudentInfo(student2);
        student1.name = null;
        student1.age = 19;
        displayStudentInfo(student1);
        student2 = null;
        displayStudentInfo(student2);
    }
    public static void displayStudentInfo(Student student){
        if (student == null) {
            System.out.println("Data is absent");
        } else {
            System.out.println("Name: " + student.name);
            System.out.println("Age: " + student.age);
        }
    }
}
