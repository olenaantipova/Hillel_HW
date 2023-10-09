package HW9;

public class Task3 {
    public static void main(String[] args) {

        String str = "abcd4efabc123deabcdaaa";
        str = str.replaceAll("[a]", "");
        str = str.replaceAll("[d]", "");
        str = str.replaceAll("[3]", "");
        System.out.println(str);
    }
}
