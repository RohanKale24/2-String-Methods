import java.util.ArrayList;

public class StringClass {
    public static void main(String[] args) {
        if (abcTest(". abc")) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        System.out.println(alternateStrings("Hillllllllllllllllll", "There"));
    }

    public static boolean abcTest(String message) {
        if (message.contains(".")) {
            for (int i = 0; i < message.length() - 2; i++) {
                String letter = message.substring(i, i + 1);
                if (!letter.equals(".")) {
                    String CheckABC = message.substring(i, i + 3);
                    if (CheckABC.equals("abc")) {
                        return true;
                    }
                } else {
                    i++;
                }


            }

        } else if (message.contains("abc")) {
            return true;
        }
        return false;

    }
    public static String alternateStrings(String message1, String message2) {
        ArrayList<String> finalMessage = new ArrayList<>();
        String message = "";
        if (message1.length() > message2.length()) {
            for (int i = 0; i < message2.length(); i++) {
                String message1Letter = message1.substring(i, i + 1);
                String message2Letter = message2.substring(i, i + 1);
                finalMessage.add(message1Letter);
                finalMessage.add(message2Letter);
            }
            finalMessage.add(message1.substring(message2.length()));

        } else {

            for (int i = 0; i < message1.length(); i++) {
                String message1Letter = message1.substring(i, i + 1);
                String message2Letter = message2.substring(i, i + 1);
                finalMessage.add(message1Letter);
                finalMessage.add(message2Letter);
            }
            finalMessage.add(message2.substring(message1.length()));
        }
        for (int i = 0; i < finalMessage.size(); i++) {
            message += finalMessage.get(i);

        }
        return message;
    }
}
