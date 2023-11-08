/*
Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
 */
import java.util.Scanner;
public class ex03 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int valorA, valorB, valorC, valorD, diferencaProduto;

        System.out.println("Informe quatro valores inteiros: ");
        valorA = sc.nextInt();
        valorB = sc.nextInt();
        valorC = sc.nextInt();
        valorD = sc.nextInt();

        diferencaProduto = (valorA * valorB - valorC * valorD);

        System.out.println("DIFERENCA = " + diferencaProduto);

    }
}


