public class Main {

    public static void main(String[] args) {

        long bytes = 5368709120L;

        printDataSize(bytes);
    }

    public static void printDataSize(long bytes) {

        double kilobytes = bytes / 1024.0;
        double megabytes = kilobytes / 1024.0;
        double gigabytes = megabytes / 1024.0;
        double terabytes = gigabytes / 1024.0;

        System.out.println("Bytes: " + bytes);
        System.out.println("Kilobytes: " + kilobytes + " KB");
        System.out.println("Megabytes: " + megabytes + " MB");
        System.out.println("Gigabytes: " + gigabytes + " GB");
        System.out.println("Terabytes: " + terabytes + " TB");
    }
}
