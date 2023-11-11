/*
Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.
 */
import java.util.Scanner;
import java.util.Locale;
public class ex06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        sc.useLocale(Locale.US);

        double A,B,C, pi = 3.14169;

        System.out.println("Informe o valor de A,B e C, respectivamente: ");
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        double AreaTriangulo = (A * C)/2;
        double AreaCirculo = pi * Math.pow(C,2);
        double AreaTrapezio = (A + B) * C / 2;
        double AreaQuadrado = Math.pow(B,2);
        double AreaRetangulo = A*B;

        System.out.printf("TRIANGULO: %.3f\n", AreaTriangulo);
        System.out.printf("CIRCULO: %.3f\n", AreaCirculo);
        System.out.printf("TRAPEZIO: %.3f\n", AreaTrapezio);
        System.out.printf("QUADRADO: %.3f\n", AreaQuadrado);
        System.out.printf("RETANGULO: %.3f\n", AreaRetangulo);
    }
}
