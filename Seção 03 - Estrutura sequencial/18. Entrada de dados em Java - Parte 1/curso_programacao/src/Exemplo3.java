import java.util.Scanner;

public class Exemplo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x;
        x = sc.nextDouble();
        System.out.println("Você digitou: " + x);
        System.out.printf("Você digitou: %.2f%n", x);
        sc.close();
    }
}
