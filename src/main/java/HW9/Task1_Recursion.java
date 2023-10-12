package HW9;

public class Task1_Recursion {
    public static void main(String[] args) {
        String s = "Java, World!";
        StringBuilder check = new StringBuilder(s);
        StringBuilder s1 = new StringBuilder();
        recursion(check, s1);
        System.out.println(s1.toString());
    }

    public static void recursion(StringBuilder s, StringBuilder s1) {
        if (s.length() == 0) {
            return;
        }
        s1.append(s.substring(s.length() - 1));
        s.deleteCharAt(s.length() - 1);
        recursion(s, s1);

    }
}
