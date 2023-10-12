package HW9;

public class Task3 {
    public static void main(String[] args) {
        String initialString = "abcd4efabc123deabcdaaa";
        String charactersToRemove = "ad3";

        String modifiedString = removeCharacters(initialString,charactersToRemove);
        System.out.println("modified String " + modifiedString);
    }
    public static String removeCharacters (String init, String charactersToRemove){
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < init.length(); i++) {
            char currentChar = init.charAt(i);

            if (charactersToRemove.indexOf(currentChar) == -1) {
                result.append(currentChar);
            }
        }
        return result.toString();
    }
}
