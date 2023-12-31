/*
Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
exemplo.
 */

import java.util.Scanner;

public class ex03 {
    public static void main(String[] ags) {
        Scanner sc = new Scanner(System.in);

        int escolha, alcool = 0, gasolina = 0, diesel = 0;

        System.out.println("1 - alcool, 2 - gasolina, 3 - diesel, 4 - sair");
        escolha = sc.nextInt();

        while (escolha != 4) {
            switch (escolha) {
                case 1:
                    alcool++;
                    break;
                case 2:
                    gasolina++;
                    break;
                case 3:
                    diesel++;
                    break;
            }
            escolha = sc.nextInt();
        }
        System.out.printf("MUITO OBRIGADO \n Alcool: %d\n Gasolina: %d\n Diesel: %d\n", alcool, gasolina, diesel);
        sc.close();
    }
}
