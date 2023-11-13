/*
Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).
 */

import java.util.Scanner;
public class ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quantia, numeroInput, dentroDoInervalo = 0, foraDoIntervalo = 0 ;

        System.out.println("Qual será a quantidade de números? ");
        quantia = sc.nextInt();

        for (int i = 0 ; i < quantia ; i++) {
            numeroInput = sc.nextInt();
            if(numeroInput >= 10 && numeroInput <= 20) {
                dentroDoInervalo++;
            } else {
                foraDoIntervalo++;
            }

        }
        System.out.printf("%d in\n", dentroDoInervalo);
        System.out.printf("%d out", foraDoIntervalo);
        sc.close();
    }
}
