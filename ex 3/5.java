public class Main {

    public static void main(String[] args) {


        double pounds = convertFromEuro(100.0, "GBP");
        System.out.println("100 EUR = " + pounds + " GBP");

        double sek = convertFromEuro(100.0, "SEK");
        System.out.println("100 EUR = " + sek + " SEK");

        double euros = convertToEuro(100.0, "GBP");
        System.out.println("100 GBP = " + euros + " EUR");

        double euros2 = convertToEuro(100.0, "PLN");
        System.out.println("100 PLN = " + euros2 + " EUR");
    }

    // =====================================
    // Convert euros to another currency
    // =====================================

    public static double convertFromEuro(double amount, String currency) {

        currency = currency.toUpperCase();

        double rate = switch (currency) {

            case "GBP" -> 0.86;   // British Pound
            case "SEK" -> 11.40;  // Swedish Krona
            case "NOK" -> 11.70;  // Norwegian Krone
            case "DKK" -> 7.46;   // Danish Krone
            case "PLN" -> 4.30;   // Polish Zloty
            case "CZK" -> 25.00;  // Czech Koruna
            case "HUF" -> 390.00; // Hungarian Forint
            case "RON" -> 4.97;   // Romanian Leu
            case "BGN" -> 1.96;   // Bulgarian Lev
            case "CHF" -> 0.96;   // Swiss Franc

            default -> -1;
        };

        if (rate == -1) {
            System.out.println("Unsupported currency");
            return 0;
        }

        return amount * rate;
    }

    // =====================================
    // Convert another currency to euros
    // =====================================

    public static double convertToEuro(double amount, String currency) {

        currency = currency.toUpperCase();

        double rate = switch (currency) {

            case "GBP" -> 0.86;
            case "SEK" -> 11.40;
            case "NOK" -> 11.70;
            case "DKK" -> 7.46;
            case "PLN" -> 4.30;
            case "CZK" -> 25.00;
            case "HUF" -> 390.00;
            case "RON" -> 4.97;
            case "BGN" -> 1.96;
            case "CHF" -> 0.96;

            default -> -1;
        };

        if (rate == -1) {
            System.out.println("Unsupported currency");
            return 0;
        }

        return amount / rate;
    }
}
