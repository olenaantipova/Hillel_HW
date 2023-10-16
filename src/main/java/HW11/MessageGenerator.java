package HW11;

public class MessageGenerator {
    public static String infoMessage(String message, String... args) {
        String formattedMessage = String.format("Info:  %s", message);
        if (args.length > 0) {
            formattedMessage += " - " + String.join(", ", args);
        }
        return formattedMessage;
    }

    public static String errorMessage(String message, int errorCode) {
        return String.format("Error %d: %s", errorCode, message);
    }

    public static void main(String[] args) {
        String info = MessageGenerator.infoMessage("Software launching", "Version 1.0");
        System.out.println(info);

        String error = MessageGenerator.errorMessage("Not found", 404);
        System.out.println(error);
    }
}
