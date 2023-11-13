/*
Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma)
 */

import java.util.Scanner;
import java.util.Locale;

public class ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double pontoX, pontoY;

        System.out.println("Informe o ponto X: ");
        pontoX = sc.nextInt();
        System.out.println("Informe o ponto Y: ");
        pontoY = sc.nextInt();

        while (pontoX != 0 || pontoY != 0) {
            if (pontoX > 0 && pontoY > 0) {
                System.out.println("Primeiro");
            } else if (pontoX < 0 && pontoY > 0) {
                System.out.println("Segundo");
            } else if (pontoX < 0 && pontoY < 0) {
                System.out.println("Terceiro");
            } else if (pontoX > 0 && pontoY < 0) {
                System.out.println("Quarto");
            }
            pontoX = sc.nextInt();
            pontoY = sc.nextInt();
        }
        sc.close();
    }
}
