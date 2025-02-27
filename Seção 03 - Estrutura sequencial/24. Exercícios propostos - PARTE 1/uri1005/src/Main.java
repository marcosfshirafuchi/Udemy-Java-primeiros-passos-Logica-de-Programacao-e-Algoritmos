import java.util.Locale;
import java.util.Scanner;

public class Main {
    /**
     * <h1> beecrowd | 1005<br>
     * Média 1<br>
     * Adaptado por Neilor Tonin, URI  Brasil
     *
     * Timelimit: 1</h1>
     * Descrição Geral<br><br>
     * Leia 2 valores de ponto flutuante de dupla precisão A e B, que correspondem a 2 notas de um aluno. A seguir, calcule a média do aluno, sabendo que a nota A tem peso 3.5 e a nota B tem peso 7.5 (A soma dos pesos portanto é 11). Assuma que cada nota pode ir de 0 até 10.0, sempre com uma casa decimal.<br><br>
     *
     * Entrada<br>
     * O arquivo de entrada contém 2 valores com uma casa decimal cada um.<br><br>
     *
     * Saída<br>
     * Imprima a mensagem "MEDIA" e a média do aluno conforme exemplo abaixo, com 5 dígitos após o ponto decimal e com um espaço em branco antes e depois da igualdade. Utilize variáveis de dupla precisão (double) e como todos os problemas, não esqueça de imprimir o fim de linha após o resultado, caso contrário, você receberá "Presentation Error".<br><br>
     *
     * |Exemplos de Entrada	 |Exemplos de Saída<br>
     * --------------------------------------------<br>
     * | 5.0                |MEDIA = 6.43182<br>
     * | 7.1                |<br><br>
     *---------------------------------------------<br>
     * |0.0                 | MEDIA = 4.84091<br>
     * |7.1                 |<br><br>
     *-----------------------------------------------<br>
     * |10.0                 |MEDIA = 10.00000<br>
     * |10.0                |<br><br>
     * ----------------------------------------------<br>
     * <p>
     * <b>Note:</b> Desenvolvido na linguagem Java.
     *
     * @authors
     * Marcos Ferreira Shirafuchi<br>
     * @version 1.0
     * @since 27/02/2025
     */
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        double A = scanner.nextFloat();
        double B = scanner.nextFloat();
        double media = ((A *3.5)+ (B*7.5))/11.0;
        System.out.printf("MEDIA = %.5f%n",media);
        scanner.close();
    }
}