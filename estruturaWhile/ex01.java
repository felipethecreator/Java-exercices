/*
Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.
 */

package estruturaWhile;
import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tentativa, senhaCorreta = 2002;

        System.out.println("Informe a senha: ");
        tentativa = sc.nextInt();

        while (tentativa != senhaCorreta) {
            System.out.println("Senha inválida");
            tentativa = sc.nextInt();
        }
        System.out.println("Acesso Permitido");

        sc.close();
    }
}
