public class Main {

    public static boolean isValidIdCode(String idCode) {

        // Must contain exactly 11 digits
        if (idCode.length() != 11 || !idCode.matches("\\d+")) {
            return false;
        }

        int[] weights1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 1};
        int[] weights2 = {3, 4, 5, 6, 7, 8, 9, 1, 2, 3};

        int sum = 0;


        for (int i = 0; i < 10; i++) {
            int digit = Character.getNumericValue(idCode.charAt(i));
            sum += digit * weights1[i];
        }

        int remainder = sum % 11;
        int controlNumber;


        if (remainder < 10) {
            controlNumber = remainder;
        } else {


            sum = 0;

            for (int i = 0; i < 10; i++) {
                int digit = Character.getNumericValue(idCode.charAt(i));
                sum += digit * weights2[i];
            }

            remainder = sum % 11;

            if (remainder < 10) {
                controlNumber = remainder;
            } else {
                controlNumber = 0;
            }
        }

        int lastDigit = Character.getNumericValue(idCode.charAt(10));

        return controlNumber == lastDigit;
    }

    public static void main(String[] args) {

        String idCode = "37605030299";

        if (isValidIdCode(idCode)) {
            System.out.println("ID code is correct");
        } else {
            System.out.println("ID code is NOT correct");
        }
    }
}
