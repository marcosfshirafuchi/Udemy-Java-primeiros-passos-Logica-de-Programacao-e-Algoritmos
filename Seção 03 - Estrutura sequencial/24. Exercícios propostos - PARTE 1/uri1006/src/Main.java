import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            double A = scanner.nextDouble();
            double B = scanner.nextDouble();
            double C = scanner.nextDouble();
            double media = (2 * A + 3 * B + 5 * C)/10.0;
        System.out.printf("MEDIA = %.1f%n", media);
        scanner.close();
    }
}