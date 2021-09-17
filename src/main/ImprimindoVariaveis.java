package main;

public class ImprimindoVariaveis {

    public static void main(String[] args) {

        int idade = 24;
        double salarioDouble = 3000.0;
        float salarioFloat = 3000;
        byte idadeByte = 12;
        short idadeShort = 32767;
        boolean verdadeiro = true;
        boolean falso = false;
        long numeroGrande = 10000L;
        char caractere = '\u0041'; //2 bytes only

        String nome = "Pedro";

        System.out.println("Meu nome é " + nome + " e tenho " + idade + " anos.");
    }
}
