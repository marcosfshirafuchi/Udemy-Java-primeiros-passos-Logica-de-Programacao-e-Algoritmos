package Exercicio01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        boolean loop = true;
        while (loop){
            System.out.println("*******Amazon Brasil*******");
            System.out.println("1 - Comprar");
            System.out.println("2 - Pagar");
            System.out.println("3 - Sair");
            System.out.println("****************************");

        }        String produto1 = "Iphone 15";
        carrinhoDeCompras.adicionarItem(produto1);
        scanner.close();
    }
}