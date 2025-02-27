import java.util.Locale;
import java.util.Scanner;

public class Main {
    /**
     * <h1> beecrowd | 1005<br>
     * Salário com Bônus<br>
     * Adaptado por Neilor Tonin, URI  Brasil
     *
     * Timelimit: 1</h1>
     * Descrição Geral<br><br>
     * Faça um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o total a receber no final do mês, com duas casas decimais.<br><br>
     *
     * Entrada<br>
     * O arquivo de entrada contém um texto (primeiro nome do vendedor) e 2 valores de dupla precisão (double) com duas casas decimais, representando o salário fixo do vendedor e montante total das vendas efetuadas por este vendedor, respectivamente.<br><br>
     *
     * Saída<br>
     * Imprima o total que o funcionário deverá receber, conforme exemplo fornecido.<br><br>
     *
     * |Exemplos de Entrada	 |Exemplos de Saída<br>
     * --------------------------------------------<br>
     * | JOAO               |TOTAL = R$ 684.54<br>
     * | 500.00             |<br>
     * | 1230.30            |<br>
     *---------------------------------------------<br>
     * |PEDRO               | TOTAL = R$ 700.00<br>
     * |700.00              |<br>
     * |0.00                |<br>
     *-----------------------------------------------<br>
     * |MANGOJATA           |TOTAL = R$ 1884.58<br>
     * |1700.00             |
     * |1230.50             |<br><br>
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
        String nome = scanner.next();
        double salario = scanner.nextDouble();
        double vendas = scanner.nextDouble();
        double total = salario + (vendas * 0.15);
        System.out.printf("TOTAL = R$ %.2f%n",total);
        scanner.close();
    }
}