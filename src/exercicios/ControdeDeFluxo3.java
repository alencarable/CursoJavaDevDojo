package exercicios;

public class ControdeDeFluxo3 {

    /*Imprima todos os números pares de 0 até 100000*/

    public static void main(String[] args) {

        int valor = 100000;

        for (int i = 0; i <= valor; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        // Para números ímpares

        for (int i = 0; i <= valor; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
