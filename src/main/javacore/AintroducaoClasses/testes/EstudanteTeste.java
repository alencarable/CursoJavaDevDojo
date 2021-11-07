package main.javacore.AintroducaoClasses.testes;

import main.javacore.AintroducaoClasses.classes.Estudante;

public class EstudanteTeste {

    public static void main(String[] args) {

        Estudante joao = new Estudante();

        joao.nome = "João";
        joao.matricula = "1212";
        joao.idade = 16;

        System.out.println(joao.nome);
        System.out.println(joao.matricula);
        System.out.println(joao.idade);

    }
}
