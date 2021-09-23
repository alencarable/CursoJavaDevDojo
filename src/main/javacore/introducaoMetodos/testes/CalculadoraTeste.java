package main.javacore.introducaoMetodos.testes;

import main.javacore.introducaoMetodos.classes.Calculadora;

public class CalculadoraTeste {

    //Vamos criar uma variável de referencia do tipo Calculadora, e assim, um objeto desse tipo.

    public static void main(String[] args) {

        Calculadora calc = new Calculadora();

        calc.somaDoisNumeros();
        calc.subtraiDoisNumeros();
        calc.multiplicaDoisNumeros(20, 4);
        System.out.println(calc.divisaoDoisNumeros(30, 8));
    }
}
