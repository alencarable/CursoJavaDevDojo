public class Arrays2 {

    public static void main(String[] args) {
        /*
        * O array inicializa com o valor zero para os tipos:
        * byte
        * short
        * int
        * long
        * float
        * double
        *
        * Outro tipos:
        * char = '\u0000'''
        * boolean = false;
        * Se for um objeto, então retornará "reference null"*/
        int[] idade = new int[3];

        System.out.printf("Idade 1 %d \n", idade[0]);
        System.out.printf("Idade 2 %d \n", idade[1]);
        System.out.printf("Idade 3 %d \n", idade[2]);

        String[] nomes = new String[4];

        nomes[0] = "Pabblo";
        nomes[1] = "Gloria";
        nomes[2] = "Linn";
        nomes[3] = "Carol";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}
