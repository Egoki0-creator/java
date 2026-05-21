public class Main {

    public static void main(String[] args) {

        int examScore = 85;

        String grade = getGrade(examScore);

        System.out.println("Exam score: " + examScore);
        System.out.println("Grade: " + grade);
    }

    public static String getGrade(int score) {

        if (score >= 90 && score <= 100) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else if (score >= 50) {
            return "E";
        } else if (score >= 0) {
            return "F";
        } else {
            return "Invalid score";
        }
    }
}
