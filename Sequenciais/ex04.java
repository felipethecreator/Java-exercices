
/*
Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
decimais.
 */
import java.util.Scanner;
import java.util.Locale;
public class ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        sc.useLocale(Locale.US);

        int numeroFuncionario, horasTrabalhadas;
        double valorRecebidoPorHora, valorTotalDoSalario;

        System.out.println("Informe o número do funcionário: ");
        numeroFuncionario = sc.nextInt();

        System.out.println("Informe as horas trabalhadas pelo funcionário: ");
        horasTrabalhadas = sc.nextInt();

        System.out.println("Informe o salário do funcionário recebido por hora: ");
        valorRecebidoPorHora = sc.nextDouble();

        valorTotalDoSalario = horasTrabalhadas * valorRecebidoPorHora;

        System.out.println("NUMBER = "+numeroFuncionario);
        System.out.println("SALARY = "+valorTotalDoSalario);
        sc.close();
    }
}
