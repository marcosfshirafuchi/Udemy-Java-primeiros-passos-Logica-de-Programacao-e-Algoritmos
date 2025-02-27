import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        String nome1 = scanner.next();
        int idade1 = scanner.nextInt();
        String nome2 = scanner.next();
        int idade2 = scanner.nextInt();
        double media = (idade1 + idade2) / 2.0;
        System.out.printf("A idade média de %s e %s é de %.1f anos", nome1, nome2, media);
        scanner.close();
    }
}