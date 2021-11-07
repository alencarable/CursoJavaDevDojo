package main.javacore.EblocoDeInicializacao.classes;

public class Cliente {

    /**
     1 - Alocado espaço na memória para o objeto que será criado
     2 - Cada atributo de classe é criado e inicializado com seus valores default ou valores explicitos
     3 - Bloco de inicialização é executado
     4 - O constutor é executado
     */

    private int[] parcelas;

    //Vamos criar o Bloco de Inicialização para colocar as parcelas
    {
        parcelas = new int[101];
        for (int i = 1; i < parcelas.length; i++) {
            parcelas[i] = i;
            System.out.println(i);
        }

    }

    public Cliente () {
    }

    public int[] getParcelas() {
        return parcelas;
    }

    public void setParcelas(int[] parcelas) {
        this.parcelas = parcelas;
    }
}
