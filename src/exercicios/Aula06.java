package exercicios;

public class Aula06 {
    /*
    Crie um algoritmo que possua variáveis para salvar os seguintes dados: Nome, Endereço e Telefone de uma pessoa
    Imprima essas variáveis da seguinte forma: O <nome> domiciliado no endereço <endereco> e telefone <telefone> não possui nenhum tipo de pendência.
     */

    public static void main(String[] args) {

        String nome = "Pedro";
        String endereco = "Rua dos Bobos, 0";
        int telefone = 965748932;

        System.out.printf("O %s domiciliado no endereço %s e telefone %d não possui nenhum tipo de pendência.", nome, endereco, telefone);
    }
}
