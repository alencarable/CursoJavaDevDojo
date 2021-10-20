package exercicios.introducaoMetodos.testes;

import exercicios.introducaoMetodos.classes.Estudante;

public class EstudanteTeste {

    public static void main(String[] args) {

        Estudante estudante = new Estudante();

        estudante.nome = "Pabblo Vittar";
        estudante.idade = 30;
        estudante.notas = new double[] {6, 9, 5.4};

        estudante.imprimir();
        estudante.media();
    }
}
