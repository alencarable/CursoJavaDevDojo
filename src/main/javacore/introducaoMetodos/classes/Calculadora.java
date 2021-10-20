package main.javacore.introducaoMetodos.classes;

public class Calculadora {

    /**
     *     1º - Modificador de Acesso: public, private
     *     2º - Tipo de retorno: void, String, double, int...
     *     3º - Nome do método: "somaDoisNumeros", "somaArray"
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

    public void somaArray (int[] numeros) {

        int soma = 0;
        for (int num:
             numeros) {
            soma +=num;
        }
        System.out.println(soma);
    }

    /**
    Vamos usar o @VarArgs para o caso dos arrays.

    Só podemos usar um VarArgs por assinatura de método.
    O uso do VarArgs "..." somente poderá ser colocado por último, para o Java compilar perfeitamente:

    public void somaVarArgs (double valorDouble, int... numeros) {}
     */
    public void somaVarArgs (int... numeros) {
        int soma = 0;
        for (int num:
                numeros) {
            soma +=num;
        }
        System.out.println(soma);
    }
}
