import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hora;
        System.out.println("Quantas horas?");
        hora = scanner.nextInt();
        if (hora < 12){
            System.out.println("Bom dia");
        }else{
            System.out.println("Boa tarde");
        }
        scanner.close();
    }
}
