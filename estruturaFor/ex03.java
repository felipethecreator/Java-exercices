/*
Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
peso 5.
 */

import java.util.Scanner;
import java.util.Locale;
public class ex03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        sc.useLocale(Locale.US);

        int quantiaCasos;
        double nota1, nota2, nota3;

        System.out.println("Informe o número de casos: ");
        quantiaCasos = sc.nextInt();

        for (int i = 0; i < quantiaCasos; i++) {
            System.out.println("Informe as 3 notas:");
            nota1 = sc.nextDouble();
            nota2 = sc.nextDouble();
            nota3 = sc.nextDouble();

            double mediaPonderada = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / (2 + 3 + 5);
            System.out.printf("%.1f\n", mediaPonderada);

        }
        sc.close();
    }
}
