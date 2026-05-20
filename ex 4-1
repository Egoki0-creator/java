public class Main {

    public static void main(String[] args) {

        int result = countPrimes(1, 20);
        System.out.println("Prime numbers count = " + result);
    }

    public static int countPrimes(int start, int end) {

        int count = 0;

        for (int i = start; i <= end; i++) {

            if (isPrime(i)) {
                count++;
            }
        }

        return count;
    }

    public static boolean isPrime(int number) {

        if (number <= 1) {
            return false;
        }

        for (int i = 2; i < number; i++) {

            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
