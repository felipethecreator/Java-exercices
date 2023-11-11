/*
Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
 */

package condicionais;
import java.util.Scanner;
public class ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escreva um número inteiro: ");
        int numero = sc.nextInt();

        if (numero < 0) {
            System.out.println("NEGATIVO");
        } else {
            System.out.println("NÃO NEGATIVO");
        }
    }
}
