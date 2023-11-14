/*
Ler um número inteiro N e calcular todos os seus divisores.
 */

package estruturaFor;

import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;

        System.out.println("Informe um número: ");
        numero = sc.nextInt();

        for (int i = 1 ; i <= numero ; i++) {
            if (numero % i == 0) {
                System.out.println(i);
            }
        sc.close();
        }
    }
}
