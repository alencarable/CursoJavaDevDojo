package main.javacore.FmodificadorEstatico.classes;

public class Cliente {

    /**
     1 - Bloco de inicialização é executado quando a JVM carregar a classe (é executado apenas 1 vez)
     2 - Alocado espaço na memória para o objeto que será criado
     3 - Cada atributo de classe é criado e inicializado com seus valores default ou valores explicitos
     4 - Bloco de inicialização é executado
     5 - O constutor é executado
     */

    private static int[] parcelas;

    /*
    Vamos criar o Bloco de Inicialização estático para colocar as parcelas
    Temos que tomar cuidado, o BI Estático só pode ser utilizado 1 (uma) única vez.

    Se houver mais de um BI Estático, serão executados na ordem em que forem codados.
     */

    static {
        parcelas = new int[100];
        for (int i = 1; i <= parcelas.length; i++) {
            parcelas[i-1] = i;
        }
    }

    public Cliente() {
    }

    public static int[] getParcelas() {
        return parcelas;
    }

    /*
    Não há necessidade porque já está usando um bloco de inicialização

    public static void setParcelas(int[] parcelas) {
        Cliente.parcelas = parcelas;
    }
    */
}
