/*
Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
 */

package condicionais;
import java.util.Scanner;
public class ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int GameStartTime, GameEndTime, duracao;

        System.out.println("Digite a hora inicial do jogo: ");
        GameStartTime = sc.nextInt();
        System.out.println("Digite a hora final do jogo: ");
        GameEndTime = sc.nextInt();

        if (GameStartTime < GameEndTime) {
            duracao = GameEndTime - GameStartTime;
        }
        else {
            duracao = 24 - GameStartTime + GameEndTime;
        }
        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

        sc.close();
        }
    }

