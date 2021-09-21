package exercicios.controleFluxo;

import java.util.Scanner;

public class ControleDeFluxo {
    /*
    * Crie uma variável salário e imprima o seu imposto
    * Se salário < 1000, então 5% de imposto
    * Se salário >= 1000 && salario < 2000, então 10% de imposto
    * Se salário >= 2000 && salario < 4000, então 15% de imposto
    * Se salário > 5000, então 20% de imposto
    * */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Qual o seu salário? \nR$");
        double salario = sc.nextDouble();

        double imposto = 0;

        if (salario < 1000) {
            imposto = salario * 0.05;
        } else if (salario >= 1000 && salario < 2000) {
            imposto = salario * 0.1;
        } else if (salario >= 2000 && salario < 4000) {
            imposto = salario * 0.15;
        } else if (salario > 5000) {
            imposto = salario * 0.2;
        }

        System.out.println("O imposto incidente sobre o salário de R$" + salario + " é igual a R$" + imposto);

    }
}
