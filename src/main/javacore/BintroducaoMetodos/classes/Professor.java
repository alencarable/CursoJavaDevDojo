package main.javacore.BintroducaoMetodos.classes;

public class Professor {

    public String nome;
    public int matricula;
    public String rg;
    public String cpf;

    /*
     * Quando junto à Professor, torna-se uma variável de referencia local. Esperando um objeto do tipo professor.
     * Desta forma, é visto que o aux (auxiliar) fará referência ao mesmo objeto que o prof e prof2. É um tipo reference,
     * não um tipo primitivo.
     *
     * Quem executa o método será o objeto, não apenas a variável de referência aux. Por isso, usa-se um generics.
     * A variável de referência vai funcionar para chamar o método.
     *
     *public void imprime (Professor aux) {

     */

    /*
    Usando o this:
    É utilizado quando se quer utilizar os atributos do próprio objeto.
    */
    public void imprime () {
        System.out.printf("O professor %s, possui matrícula: %d. Está inscrito no CPF:%s e no RG %s.\n",
                this.nome,
                this.matricula,
                this.cpf,
                this.rg);
    }
}
