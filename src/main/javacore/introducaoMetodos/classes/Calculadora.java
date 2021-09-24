package main.javacore.introducaoMetodos.classes;

public class Calculadora {

    /**
     *     1º - Modificador de Acesso
     *     2º - Tipo de retorno
     *     3º - Nome do método.
     */

    public void somaDoisNumeros () {
        System.out.println(5 + 5);
    }

    public void subtraiDoisNumeros () {
        System.out.println(5 - 5);
    }

    public void multiplicaDoisNumeros (int a, int b) {
        System.out.println(a * b);
    }

    //Quero um valor como retorno, ou seja, nada de void

    public double divisaoDoisNumeros (double a, double b) {
        if (b != 0) {
            return a / b;
        }
        return 0;
    }

    public void alteraDoisNumeros (int a, int b) {
        a = 30;
        b = 40;

        System.out.println("Dentro altera dois números");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
