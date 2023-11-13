/*
Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
 */

import java.util.Locale;
import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        sc.useLocale(Locale.US);

        int quantiaCasos;
        double numero1, numero2;

        System.out.println("Informe a quantia de divisões: ");
        quantiaCasos = sc.nextInt();

        for (int i = 0 ; i < quantiaCasos ; i++) {
            System.out.println("\nInforme o valor da divisão: ");
            numero1 = sc.nextDouble();
            numero2 = sc.nextDouble();

            if (numero2 == 0) {
                System.out.println("Divisão impossível\n");
            } else {
                double divisao = numero1 / numero2;
                System.out.println(divisao);
            }
        }
        sc.close();
    }
}
