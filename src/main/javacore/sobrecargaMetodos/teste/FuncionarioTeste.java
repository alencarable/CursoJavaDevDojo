package main.javacore.sobrecargaMetodos.teste;

import main.javacore.sobrecargaMetodos.classes.Funcionario;

public class FuncionarioTeste {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario("Chica da Silva", "111.222.333-44", 3500, "134257890-6");

        Funcionario funcionarioVazio = new Funcionario();

        //funcionario.init("Chica da Silva", "111.222.333-44", 3500, "134257890-6");

        /*
        funcionario.setNome("Chica da Silva");
        funcionario.setCpf("111.222.333-44");
        funcionario.setSalario(3500);
         */

        funcionario.imprime();
        funcionarioVazio.imprime();
    }
}
