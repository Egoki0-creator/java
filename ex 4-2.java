public class Main {

    public static void main(String[] args) {

        System.out.println(isFibonacci(13)); // true
        System.out.println(isFibonacci(10)); // false
    }

    public static boolean isFibonacci(int number) {

        if (number < 0) {
            return false;
        }

        int first = 0;
        int second = 1;

        while (first <= number) {

            if (first == number) {
                return true;
            }

            int next = first + second;
            first = second;
            second = next;
        }

        return false;
    }
}
