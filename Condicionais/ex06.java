/*
Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em
nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.
 */

package condicionais;
import java.util.Scanner;
import java.util.Locale;
public class ex06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        double intervalo;

        System.out.println("Informe o valor do intervalo: ");
        intervalo = sc.nextDouble();

        if (intervalo >= 0 && intervalo <= 25) {
            System.out.println("Intervalo [0,25]");
        } else if (intervalo >= 75 && intervalo <= 100) {
            System.out.println("Intervalo (75,100]");
        } else if (intervalo >= 25 && intervalo <= 50) {
            System.out.println("Intervalo (25,50]");
        } else {
            System.out.println("Fora de intervalo");
        }
    }
}
