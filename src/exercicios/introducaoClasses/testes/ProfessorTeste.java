package exercicios.introducaoClasses.testes;

import exercicios.introducaoClasses.classes.Professor;

public class ProfessorTeste {

    public static void main(String[] args) {

        Professor professor = new Professor();

        professor.nome = "Gustavo Guanabara";
        professor.cpf = "022.876.900-57";
        professor.matricula = 6754980;
        professor.rg = "73.470.222-0";

        System.out.printf("O professor %s, possui matrícula: %d. Está inscrito no CPF:%s e no RG %s.",
                professor.nome,
                professor.matricula,
                professor.cpf,
                professor.rg);

    }
}
