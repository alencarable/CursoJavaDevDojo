package main.javacore.CsobrecargaMetodos.classes;

public class Funcionario {

    private String nome;
    private String cpf;
    private double salario;
    private String rg;

    /**
    Construtores @Funcionario
    * - Construtor nunca terá retorno,
    * - Apenas modificador de acesso e nome da classe.*
     * - Caso você não coloque um construtor, o compilador insere um construtor
    * Observe:
    */

    public Funcionario (String nome) {
        /*
        Estou informando nesse construtor que não é possível criar um funcionário sem determinar o nome,
        Podendo ou não alterar o nome mais tarde
        */
        this.nome = nome;
    }

    /*
    Podemos colocar o init dentro do construtor, facilitando a inicialização do código ainda mais.

        public void init (String nome, String cpf, double salario) {
            this.nome = nome;
            this.cpf = cpf;
            this.salario = salario;
        }
    */

    /*Você não pode simplesmente colocar o RG no método init, imagina se fossem 500 novos parâmetros,
    Vai ter que usar a sobrecarga de métodos:
    Ocorre quando temos o mesmo nome de metódo mas os tipos dos parâmetros são diferentes, é possível também mudar o tipo de acesso e o retorno.
    */

    /*
        public void init (String nome, String cpf, double salario, String rg) {
            init(nome, cpf, salario);
            this.rg = rg;
        }
    */

    public Funcionario (String nome, String cpf, double salario, String rg) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.rg = rg;
    }

    /*
    Também é possível criar um construtor vazio, como já vimos e chamá-lo no FuncionarioTeste.java
    */

    public Funcionario () {}


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
