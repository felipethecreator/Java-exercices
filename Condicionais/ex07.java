/*
Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
Se o ponto estiver na origem, escreva a mensagem “Origem”.
Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a
situação.
 */

package condicionais;

import java.util.Scanner;
import java.util.Locale;

public class ex07 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        sc.useLocale(Locale.US);

        double eixoX, eixoY;

        System.out.println("Informe o valor do eixo X: ");
         eixoX = sc.nextDouble();

        System.out.println("informe o valor do eixo Y: ");
        eixoY = sc.nextDouble();

        if (eixoX > 0 && eixoY > 0) {
            System.out.println("Q1");
        } else if (eixoX < 0 && eixoY > 0) {
            System.out.println("Q2");
        } else if (eixoX < 0 && eixoY < 0) {
            System.out.println("Q3");
        } else if (eixoX > 0 && eixoY < 0) {
            System.out.println("Q4");
        } else {
            System.out.println("Origem");
        }
    }
}
