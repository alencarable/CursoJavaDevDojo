package main.javacore.DsobrecargaConstrutores.teste;

import main.javacore.DsobrecargaConstrutores.classes.Estudante;

public class EstudanteTeste {

    public static void main(String[] args) {

        Estudante estudante = new Estudante("11520064",
                "Charles Xavier",
                new double[] {5,8,9},
                "22/12/2055");

        estudante.imprime();
    }
}
