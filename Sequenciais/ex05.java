/*
Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago
 */
import java.util.Locale;
import java.util.Scanner;
public class ex05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int codigoPeca1, codigoPeca2, quantiaPeca1, quantiaPeca2;
        double valorPeca1, valorPeca2, valorTotal;

        System.out.println("Informe, respectivamente, o código, quantia e valor da peça nº1: ");
        codigoPeca1 = sc.nextInt();
        quantiaPeca1 = sc.nextInt();
        valorPeca1 = sc.nextDouble();

        System.out.println("Informe, respectivamente, o código, quantia e valor da peça nº2: ");
        codigoPeca2 = sc.nextInt();
        quantiaPeca2 = sc.nextInt();
        valorPeca2 = sc.nextDouble();

        valorTotal = (quantiaPeca1 * valorPeca1) + (quantiaPeca2 * valorPeca2);

        System.out.printf("VALOR A PAGAR: R$ %.2f", valorTotal);
    }
}
