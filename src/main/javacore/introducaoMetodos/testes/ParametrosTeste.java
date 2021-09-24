package main.javacore.introducaoMetodos.testes;

import main.javacore.introducaoMetodos.classes.Calculadora;

public class ParametrosTeste {
    public static void main(String[] args) {

        Calculadora calc = new Calculadora();

        int a = 5;
        int b = 10;
        calc.alteraDoisNumeros(a, b);
        System.out.println("Dentro do teste");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}
