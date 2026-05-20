public class Main {

    public static void main(String[] args) {

        System.out.println(generatePassword(10));
    }

    public static String generatePassword(int length) {

        if (length < 8) {
            return "Password length must be at least 8";
        }

        String lower = "abcdefghijklmnopqrstuvwxyz";
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numbers = "0123456789";
        String special = "!@#$%^&*";

        String allChars = lower + upper + numbers + special;

        String password = "";


        password += lower.charAt((int)(Math.random() * lower.length()));
        password += upper.charAt((int)(Math.random() * upper.length()));
        password += numbers.charAt((int)(Math.random() * numbers.length()));
        password += special.charAt((int)(Math.random() * special.length()));


        for (int i = 4; i < length; i++) {

            int randomIndex = (int)(Math.random() * allChars.length());

            password += allChars.charAt(randomIndex);
        }

        // shuffle password characters
        char[] chars = password.toCharArray();

        for (int i = 0; i < chars.length; i++) {

            int randomPosition = (int)(Math.random() * chars.length);

            char temp = chars[i];
            chars[i] = chars[randomPosition];
            chars[randomPosition] = temp;
        }

        return new String(chars);
    }
}
