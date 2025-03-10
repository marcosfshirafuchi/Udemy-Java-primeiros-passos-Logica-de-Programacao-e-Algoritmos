import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tempo = scanner.nextInt();
        int velocidadeMedia = scanner.nextInt();
        int distancia = tempo * velocidadeMedia;
        double litros = distancia / 12.0;
        System.out.printf("%.3f%n",litros);
        scanner.close();
    }
}