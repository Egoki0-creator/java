public class Main {

    public static void main(String[] args) {

        System.out.println(sumDigits(125)); // 8
        System.out.println(sumDigits(9));   // 9
        System.out.println(sumDigits(-5));  // -1
    }

    public static int sumDigits(int number) {

        if (number < 0) {
            return -1;
        }

        int sum = 0;

        while (number > 0) {

            int digit = number % 10;
            sum += digit;

            number = number / 10;
        }

        return sum;
    }
}
