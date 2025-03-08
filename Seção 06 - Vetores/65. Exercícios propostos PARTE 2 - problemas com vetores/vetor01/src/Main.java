import java.util.Locale;
import java.util.Scanner;

public class Main {
    /**
     * <h1> Curso Completo de Lógica de Programação usando Java</h1>
     * <br>https://www.udemy.com/user/nelio-alves <br><br>
     * Prof. Dr. Nelio Alves<br><br>
     * Seção: Vetores<br>
     * Exercícios propostos<br>
     * 1) Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela o maior número
     * do vetor (supor não haver empates). Mostrar também a posição do maior elemento.<br><br>
     * Exemplo:<br>
     * Entrada<br>
     * 6<br>
     * 8.0  4.0  10.0  14.0  13.0  7.0<br>
     * Saída<br>
     * 14.0<br>
     * 3 <br><br>
     * <p>
     * <b>Note:</b> Desenvolvido na linguagem Java.
     *
     * @authors
     * Marcos Ferreira Shirafuchi<br>
     * @version 1.0
     * @since 08/03/2025
     */
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        double[] vet = new double[N];
        for (int i = 0; i < N; i++){
            vet[i] = scanner.nextDouble();
        }
        double sum = 0.0;
        double maior = vet[0];
        int pos = 0;
        for (int i = 1; i < N; i++){
            if (vet[i] > maior){
                maior = vet[i];
                pos = i;
            }
        }
        System.out.println(maior);
        System.out.println(pos);
        scanner.close();
    }
}