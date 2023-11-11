/*
Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
ordem crescente ou decrescente.

 */

package condicionais;
import java.util.Scanner;
public class ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valorA, valorB;
        System.out.println("Digite dois valores inteiros: ");
        valorA = sc.nextInt();
        valorB = sc.nextInt();

        if (valorA % valorB == 0 || valorB % valorA == 0)  {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }
    }
}

