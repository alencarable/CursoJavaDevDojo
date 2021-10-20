package exercicios.introducaoMetodos.classes;

public class Estudante {

    private String nome;
    private int idade;
    private double[] notas;


    public void imprimir() {

        System.out.printf("O estudante %s, com %d anos, tem as notas: ",
                this.nome,
                this.idade);

        if (this.notas != null) //Se uma nota for esquecida não dará erro (nullpointerexeption)
        for (double nota : this.notas) {
            System.out.print(nota + " ");
        }
        System.out.println();
    }

    public void media () {

        if (this.notas == null) {
            System.out.println("Esse aluno não possui notas");
            return;
        }

        double soma = 0;

        for (double nota :
                this.notas) {
            soma += nota;
        }

        soma = soma / this.notas.length;

        if (soma > 6) {
            System.out.printf("A média é: %.2f \nSituação: aprovado!", soma);
        } else {
            System.out.printf("A média é: %.2f \nSituação: reprovado!", soma);
        }
    }

    //Se o atributo for privado, então deve-se criar um método get e um set.

    /*
    * Colocar um valor dentro da memória: SET
    *
    * Para setar um valor dentro da memória utiliza-se set + nome da variável, seguindo a convenção de código para métodos
    * Inserir o parâmetro com o tipo e argumento;
    * Escrever o valor em memória recebendo o argumento do parâmetro.
    */

    public void setNome (String nome){
        this.nome = nome;
    }

    public void setIdade (int idade) {
        if (idade < 0) {
            System.out.println("A idade deve ser maior que zero");
            return;
        }
        this.idade = idade;
    }

    public void setNotas (double[] notas) {
        this.notas = notas;
    }

    /*
    * Buscar um valor dentro da memória: GET
    *
    * Utiliza o mesmo tipo de retorno e formatação do método set, sendo que o tipo é passado na construção do método
    */

    public String getNome () {
        return this.nome;
    }

    public int getIdade () {
        return this.idade;
    }

    public double[] getNotas () {
        return this.notas;
    }
}
