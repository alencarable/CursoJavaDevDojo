package main.javacore.introducaoMetodos.testes;

import main.javacore.introducaoMetodos.classes.Professor;

public class ProfessorTeste {

    public static void main(String[] args) {

        Professor prof = new Professor();

        prof.nome = "Gustavo Guanabara";
        prof.cpf = "022.876.900-57";
        prof.matricula = 6754980;
        prof.rg = "73.470.222-0";

        Professor prof2 = new Professor();

        prof2.nome = "DevDojo";
        prof2.cpf = "198.876.830-57";
        prof2.matricula = 4483932;
        prof2.rg = "73.450.211-5";

        //Resolvendo a duplicidade do código, basta retornar à classe original e criar um void para impressão.
        prof.imprime();
        prof2.imprime();

    }
}
