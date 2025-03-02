import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dinheiro = scanner.nextInt();
        int aux = dinheiro;
        int cont100 = 0, cont50 = 0, cont20 = 0, cont10 = 0, cont5 = 0, cont2 = 0, cont1 = 0;
        cont100 = aux / 100;
        aux = aux - (cont100 * 100);
        cont50 = aux / 50;
        aux = aux - (cont50 * 50);
        cont20 = aux / 20;
        aux = aux - (cont20 * 20);
        cont10 = aux / 10;
        aux = aux - (cont10 * 10);
        cont5 = aux / 5;
        aux = aux - (cont5 * 5);
        cont2 = aux / 2;
        aux = aux - (cont2 * 2);
        cont1 = aux / 1;
        aux = aux - (cont1 * 1);
        System.out.println(dinheiro);
        System.out.printf("%d nota(s) de R$ 100,00%n", cont100);
        System.out.printf("%d nota(s) de R$ 50,00%n", cont50);
        System.out.printf("%d nota(s) de R$ 20,00%n", cont20);
        System.out.printf("%d nota(s) de R$ 10,00%n", cont10);
        System.out.printf("%d nota(s) de R$ 5,00%n", cont5);
        System.out.printf("%d nota(s) de R$ 2,00%n", cont2);
        System.out.printf("%d nota(s) de R$ 1,00%n", cont1);

        scanner.close();
    }
}