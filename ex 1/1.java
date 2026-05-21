public class Main {
    public static void main(String[] args) {

        double firstNumber = 20.00;

        double secondNumber = 80.00;

        double total = (firstNumber + secondNumber) * 100.00;

        double remainder = total % 40.00;


        boolean isNoRemainder = (remainder == 0);


        System.out.println(isNoRemainder);


        if (!isNoRemainder) {
            System.out.println("got some remainder");
        }
    }
}
