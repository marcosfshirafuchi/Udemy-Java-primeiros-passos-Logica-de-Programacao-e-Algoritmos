import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valor = scanner.nextInt();
        int cont100, cont50,cont20,cont10,cont5,cont1;
        if (valor % 100 == 0){
            cont100 = valor / 100;
        }
        System.out.println("Hello, World!");
        scanner.close();
    }
}