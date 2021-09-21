package main.introducao.controleFluxo;

public class ControleFluxo1 {
    public static void main(String[] args) {

        /*
        Se idade < 15 - Categoria Infantil
        Se idade >= 15 e <= 18 - Juvenil
        Se idade >= 18 - Adulto
        */
        int idade = 20;
        String categoria = "";

        if (idade < 15) {
            categoria = "Infantil";
        } else if (idade >= 15 && idade < 18) {
            categoria = "Juvenil";
        } else {
            categoria = "Adulto";
        }
        System.out.printf("Categoria %s", categoria);
    }
}
