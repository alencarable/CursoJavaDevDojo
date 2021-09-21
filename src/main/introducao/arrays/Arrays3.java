package main.introducao.arrays;

public class Arrays3 {

    public static void main(String[] args) {

        int[] numeros = new int[5];
        int[] numeros2 = {1,2,3,4,5};
        int[] numeros3 = new int[]{5,4,3,2,1}; //se voce já colocou os valores entre chaves, não poderá definir dentro dos colchetes.

        for (int posicao:
             numeros2) {
            System.out.println(posicao);
        }


    }

}
