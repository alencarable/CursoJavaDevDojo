package exercicios.introducaoMetodos.classes;

public class Estudante {

    public String nome;
    public int idade;
    public double[] notas;


    public void imprimir() {

        System.out.printf("O estudante %s, com %d anos, tem as notas: ",
                this.nome,
                this.idade);

        if (notas != null) //Se uma nota for esquecida não dará erro (nullpointerexeption)
        for (double nota : notas) {
            System.out.print(nota + " ");
        }
        System.out.println();
    }

    public void media () {

        if (notas == null) {
            System.out.println("Esse aluno não possui notas");
            return;
        }

        double soma = 0;

        for (double nota :
                notas) {
            soma += nota;
        }

        soma = soma / notas.length;

        if (soma > 6) {
            System.out.printf("A média é: %.2f \nSituação: aprovado!", soma);
        } else {
            System.out.printf("A média é: %.2f \nSituação: reprovado!", soma);
        }
    }
}
