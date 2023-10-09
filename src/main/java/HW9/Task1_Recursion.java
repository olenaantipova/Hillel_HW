package HW9;

public class Task1_Recursion {
    public static void main(String[] args) {
        String s = "Java, World!";

        if (s.length() > 0) {
            recursion(s, s.length() - 1);
        }
    }
    public static void recursion(String s, int index){
        if(index == 0){
            System.out.println(s.charAt(index));
            return;
        }
        System.out.println(s.charAt(index));
        recursion(s, index - 1);
    }
}
