package main.introducao.arrays;

public class Arrays1 {

    public static void main(String[] args) {

        int[] idades1; // Mais recomendado
        int idades2[]; //Não é tão recomendado

        // Todo array em java é entendido como um objeto (necessita de new)

        int[] idades = new int[3]; // É necessário definir o tamanho do array

        idades[0] = 23;
        idades[1] = 20;
        idades[2] = 45;

        System.out.printf("Idade 1 %d", idades[0]);
        System.out.printf("Idade 2 %d", idades[1]);
        System.out.printf("Idade 3 %d", idades[2]);
    }
}
