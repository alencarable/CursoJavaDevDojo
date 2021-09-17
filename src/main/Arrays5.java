package main;

public class Arrays5 {

    public static void main(String[] args) {

        int[][] ano = new int[12][]; //é possível deixar só uma referência

        int[][] dias = new int[2][2];

        dias[0][0] = 30;
        dias[0][1] = 31;
        dias[1][0] = 29;
        dias[1][1] = 28;

        for (int i = 0; i < dias.length; i++) {
            System.out.println(dias[i]); //vai imprimir apenas o id de referência
            for (int j = 0; j < dias.length; j++) {
                System.out.println(dias[i][j]); //agora sim teremos os valores, uma vez que são bidimensionais
            }
        }

        System.out.println("-----------");

        for (int[] referencia:
             dias) {
            for (int dia:
                 referencia) {
                System.out.println(dia);
            };
        }
    }
}
