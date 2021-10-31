package exercicios.introducaoMetodos.testes;

import exercicios.introducaoMetodos.classes.Estudante;

public class EstudanteTeste {

    public static void main(String[] args) {

        Estudante estudante = new Estudante();

        /*
        Não serão mais usados pois o acesso de Estudantes passou a ser private

        estudante.nome = "Pabblo Vittar";
        estudante.idade = 30;
        estudante.notas = new double[] {6, 9, 5.4};
         */

        estudante.setNome("Pabblo Vittar");
        estudante.setIdade(30);
        estudante.setNotas(new double[]{6, 9, 5.4});

        estudante.imprimir();
        estudante.media();

        System.out.println(estudante.getNome());
        System.out.println(estudante.getIdade());
        System.out.println(estudante.getNotas());
        System.out.println("Aprovado? " + estudante.isAprovado());
    }
}
