import java.util.Scanner;

public class Main {
    /**
     * <h1> Curso Completo de Lógica de Programação usando Java</h1>
     * <br>https://www.udemy.com/user/nelio-alves <br><br>
     * Prof. Dr. Nelio Alves<br><br>
     * Seção: Matrizes<br>
     * Exercícios propostos<br>
     * 1) Ler dois números M e N, e depois ler uma matriz MxN de números inteiros, conforme exemplo. Em seguida, mostrar
     * na tela somente os números negativos da matriz. <br><br>
     * Entrada: <br>
     * A entrada contém os números M e N na mesma linha, depois os dados da matriz. <br><br>
     * Saída: <br>
     * A saída contém uma mensagem e depois os números negativos da matriz, conforme exemplo.<br> <br>
     * Exemplo: <br>
     * Entrada <br>
     * 2 3<br>
     * 12 -8 5 <br>
     * -13 10 -6<br>
     *Saída <br>
     * VALORES NEGATIVOS: <br>
     * -8<br>
     * -13<br>
     * -6<br>
     * <p>
     * <b>Note:</b> Desenvolvido na linguagem Java.
     *
     * @authors
     * Marcos Ferreira Shirafuchi<br>
     * @version 1.0
     * @since 09/03/2025
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int M = scanner.nextInt();
        int N = scanner.nextInt();
        int[][] mat = new int[M][N];
        for (int i = 0; i < M; i++){
            for (int j = 0; j < N; j++){
                mat[i][j] = scanner.nextInt();
            }
        }
        System.out.println("VALORES NEGATIVOS:");
        for (int i = 0; i < M; i++){
            for (int j = 0; j < N; j++){
                if (mat[i][j] < 0){
                    System.out.println(mat[i][j]);
                }
            }
        }
        scanner.close();
    }
}