public class Main {

    public static void main(String[] args) {

        // Version 1 - day and month as int
        System.out.println(getZodiacSign(15, 5));

        // Version 2 - date as String
        System.out.println(getZodiacSign("23-08"));

        // Version 3 - LocalDate style values
        System.out.println(getZodiacSign(2000, 12, 1));
    }

    // =====================================
    // Version 1 - day and month
    // =====================================

    public static String getZodiacSign(int day, int month) {

        return switch (month) {

            case 1 -> (day >= 20) ? "Aquarius" : "Capricorn";
            case 2 -> (day >= 19) ? "Pisces" : "Aquarius";
            case 3 -> (day >= 21) ? "Aries" : "Pisces";
            case 4 -> (day >= 20) ? "Taurus" : "Aries";
            case 5 -> (day >= 21) ? "Gemini" : "Taurus";
            case 6 -> (day >= 21) ? "Cancer" : "Gemini";
            case 7 -> (day >= 23) ? "Leo" : "Cancer";
            case 8 -> (day >= 23) ? "Virgo" : "Leo";
            case 9 -> (day >= 23) ? "Libra" : "Virgo";
            case 10 -> (day >= 23) ? "Scorpio" : "Libra";
            case 11 -> (day >= 22) ? "Sagittarius" : "Scorpio";
            case 12 -> (day >= 22) ? "Capricorn" : "Sagittarius";

            default -> "Invalid date";
        };
    }

    // =====================================
    // Version 2 - String date
    // Format: dd-mm
    // =====================================

    public static String getZodiacSign(String date) {

        String[] parts = date.split("-");

        int day = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);

        return getZodiacSign(day, month);
    }

    // =====================================
    // Version 3 - year, month, day
    // =====================================

    public static String getZodiacSign(int year, int month, int day) {

        return getZodiacSign(day, month);
    }
}
