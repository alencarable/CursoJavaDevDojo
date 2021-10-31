package main.javacore.sobrecargaMetodos.classes;

public class Funcionario {

    private String nome;
    private String cpf;
    private double salario;
    private String rg;

    public void init (String nome, String cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    /*Você não pode simplesmente colocar o RG no método init, imagina se fossem 500 novos parâmetros,
    Vai ter que usar a sobrecarga de métodos:
    Ocorre quando temos o mesmo nome de metódo mas os tipos dos parâmetros são diferentes, é possível também mudar o tipo de acesso e o retorno.
    */

    public void init (String nome, String cpf, double salario, String rg) {
        init(nome, cpf, salario);
        this.rg = rg;
    }

    public void imprime () {
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.salario);
        System.out.println(this.rg);
    }

    /*
    Getters and Setters
    */

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public double getSalario() {
        return salario;
    }

    public String getRg () {return rg;}

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setRg (String rg) {this.rg = rg;}
}
