import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int distancia = scanner.nextInt();
        int tempo = distancia * 2;
        System.out.println(tempo + " minutos");
        scanner.close();
    }
}