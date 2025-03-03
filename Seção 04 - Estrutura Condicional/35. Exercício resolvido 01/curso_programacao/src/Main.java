import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        double nota1 = scanner.nextDouble();
        double nota2 = scanner.nextDouble();
        double notaFinal = nota1 + nota2;
        System.out.printf("NOTA FINAL = %.1f%n",notaFinal);
        if (notaFinal < 60.0){
            System.out.println("REPROVADO");
        }
        scanner.close();
    }
}