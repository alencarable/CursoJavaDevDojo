public class ControleFluxo4 {

    public static void main(String[] args) {

        int contador = 10;
        /*while(contador < 10) {
            System.out.println(++contador);
        }*/

        do {
            System.out.println("dentro do do while");
        } while (contador < 10);

        for (int i = 0; i < 10; i ++) {
            System.out.println("i = " + i);
            break;
        }

    }
}
