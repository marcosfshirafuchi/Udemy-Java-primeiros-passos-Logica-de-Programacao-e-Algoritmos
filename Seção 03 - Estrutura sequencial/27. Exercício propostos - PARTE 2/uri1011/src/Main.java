import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double PI = 3.14159;
        int raio = scanner.nextInt();
        double volume = 4/3.0 * PI * Math.pow(raio,3.0);
        System.out.printf("VOLUME = %.3f%n",volume);
        scanner.close();
    }
}