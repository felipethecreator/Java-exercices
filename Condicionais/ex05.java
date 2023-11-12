/*
Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
seguir, calcule e mostre o valor da conta a pagar.
 */

package condicionais;
import java.util.Scanner;
import java.util.Locale;
public class ex05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int itemCode;
        int itemAmount;
        double cachorroQuente, xSalada, xBacon, torrada, refrigerante;

        System.out.print("Informe o código do item desejado: \n");
        System.out.print("1 - cachorro quente - preço: 4.00 \n");
        System.out.print("2 - X-salada - preço: 4.50 \n");
        System.out.print("3 - X-bacon - preço: 5.00 \n");
        System.out.print("4 - Torrada simples - preço: 2.00 \n");
        System.out.print("5 - Refrigerante - preço: 1.50 \n");
        itemCode = sc.nextInt();

        System.out.print("Informe a quantidade desejada: \n");
        itemAmount = sc.nextInt();

        if (itemCode == 1) {
            cachorroQuente = 4 * itemAmount;
            System.out.printf("Total: R$ %.2f", cachorroQuente);
        } else if (itemCode == 2) {
            xSalada = 4.5 * itemAmount;
            System.out.printf("Total: R$ %.2f", xSalada);
        } else if (itemCode == 3) {
            xBacon = 5 * itemAmount;
            System.out.printf("Total: R$ %.2f", xBacon);
        } else if (itemCode == 4) {
            torrada = 2 * itemAmount;
            System.out.printf("Total: R$ %.2f", torrada);
        } else if (itemCode == 5) {
            refrigerante = 1.5 * itemAmount;
            System.out.printf("Total: R$ %.2f", refrigerante);
        } else {
            System.out.println("Informe um código válido!");
        }
    }
}
