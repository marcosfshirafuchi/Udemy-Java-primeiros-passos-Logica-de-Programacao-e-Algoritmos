import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        int codigo1 = scanner.nextInt();
        int peca1 = scanner.nextInt();
        double precoUnitario1 = scanner.nextDouble();
        int codigo2 = scanner.nextInt();
        int peca2 = scanner.nextInt();
        double precoUnitario2 = scanner.nextDouble();
        double total = peca1 * precoUnitario1 + peca2 * precoUnitario2;
        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
        scanner.close();
    }
}