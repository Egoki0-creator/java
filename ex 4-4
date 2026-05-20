public class Main {

    public static void main(String[] args) {

        System.out.println(isPalindrome(707));   // true
        System.out.println(isPalindrome(1221));  // true
        System.out.println(isPalindrome(11212)); // false
    }

    public static boolean isPalindrome(int number) {

        int originalNumber = number;
        int reversedNumber = 0;

        while (number != 0) {

            int digit = number % 10;

            reversedNumber = reversedNumber * 10 + digit;

            number = number / 10;
        }

        return originalNumber == reversedNumber;
    }
}
