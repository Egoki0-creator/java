public class Main {

    public static void main(String[] args) {

        // Calling first method
        double height1 = convertToCentimeters(68);
        System.out.println("68 inches = " + height1 + " cm");

        // Calling second method
        double height2 = convertToCentimeters(5, 8);
        System.out.println("5 feet 8 inches = " + height2 + " cm");
    }


    public static double convertToCentimeters(int inches) {

        return inches * 2.54;
    }


    public static double convertToCentimeters(int feet, int inches) {

        int totalInches = (feet * 12) + inches;

        return convertToCentimeters(totalInches);
    }
}
