package main.javacore.BintroducaoMetodos.testes;

import main.javacore.BintroducaoMetodos.classes.Calculadora;

public class CalculadoraTeste {

    //Vamos criar uma variável de referencia do tipo Calculadora, e assim, um objeto desse tipo.

    public static void main(String... args) {

        Calculadora calc = new Calculadora();

        calc.somaDoisNumeros();
        calc.subtraiDoisNumeros();
        calc.multiplicaDoisNumeros(20, 4);
        System.out.println(calc.divisaoDoisNumeros(30, 8));

        int[] numeros = new int[] {1,2,3,4,5};
        calc.somaArray(numeros);

        System.out.println("----------");

        //Vejamos como fica a chamada do método para o caso do VarArgs

        //calc.somaVarArgs(numeros); ou
        calc.somaVarArgs(1,2,3,4,5);
    }
}
