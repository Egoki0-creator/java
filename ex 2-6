public class Main {

    public static void main(String[] args) {

        String message = "HELLO WORLD";


        String encrypted1 = encryptMessage(message, 3);
        System.out.println("Custom shift: " + encrypted1);


        String encrypted2 = encryptMessage(message);
        System.out.println("Automatic shift: " + encrypted2);
    }


    public static String encryptMessage(String message, int shift) {

        String encrypted = "";

        for (int i = 0; i < message.length(); i++) {

            char character = message.charAt(i);


            if (character >= 'A' && character <= 'Z') {

                character = (char) (character + shift);


                if (character > 'Z') {
                    character = (char) (character - 26);
                }
            }

            else if (character >= 'a' && character <= 'z') {

                character = (char) (character + shift);


                if (character > 'z') {
                    character = (char) (character - 26);
                }
            }

            encrypted += character;
        }

        return encrypted;
    }


    public static String encryptMessage(String message) {

        int defaultShift = 3;

        return encryptMessage(message, defaultShift);
    }
}
