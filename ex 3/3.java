public class Main {

    public static void main(String[] args) {


        System.out.println(getCountryName("+37251234567"));
        System.out.println(getCountryName("+37121234567"));
        System.out.println(getCountryName("+37061234567"));


        System.out.println(getCountryName(37251234567L));
        System.out.println(getCountryName(358401234567L));
    }


    public static String getCountryName(String phoneNumber) {


        if (phoneNumber.startsWith("+")) {
            phoneNumber = phoneNumber.substring(1);
        }

        String countryCode;


        if (phoneNumber.startsWith("372")) {
            countryCode = "372";
        } else if (phoneNumber.startsWith("371")) {
            countryCode = "371";
        } else if (phoneNumber.startsWith("370")) {
            countryCode = "370";
        } else if (phoneNumber.startsWith("358")) {
            countryCode = "358";
        } else if (phoneNumber.startsWith("46")) {
            countryCode = "46";
        } else if (phoneNumber.startsWith("47")) {
            countryCode = "47";
        } else if (phoneNumber.startsWith("48")) {
            countryCode = "48";
        } else if (phoneNumber.startsWith("49")) {
            countryCode = "49";
        } else if (phoneNumber.startsWith("380")) {
            countryCode = "380";
        } else if (phoneNumber.startsWith("7")) {
            countryCode = "7";
        } else {
            countryCode = "unknown";
        }


        return switch (countryCode) {

            case "372" -> "Estonia";
            case "371" -> "Latvia";
            case "370" -> "Lithuania";
            case "358" -> "Finland";
            case "46" -> "Sweden";
            case "47" -> "Norway";
            case "48" -> "Poland";
            case "49" -> "Germany";
            case "380" -> "Ukraine";
            case "7" -> "Russia";

            default -> "Unknown country";
        };
    }


    public static String getCountryName(long phoneNumber) {

        return getCountryName(String.valueOf(phoneNumber));
    }
}
