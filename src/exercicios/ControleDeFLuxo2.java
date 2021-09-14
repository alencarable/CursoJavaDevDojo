package exercicios;

import java.util.Scanner;

public class ControleDeFLuxo2 {

    /*
    * Crie um switch que dado um valor de 1 a 7, considete 1 domingo e imprima se é dia útil ou final de semana*/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número de 1 a 7");
        byte num = sc.nextByte();

        switch (num) {
            case 1:
            case 7:
                System.out.println("Final de Semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");
                break;
            default:
                System.out.println("Número inválido");
        }
    }
}
