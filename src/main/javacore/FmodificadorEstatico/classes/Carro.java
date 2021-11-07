package main.javacore.FmodificadorEstatico.classes;

public class Carro {

    /*
    Suponhamos que a velocidade limite de todos os carros devem ser 240km/h
    */

    private String nome;
    private double velocidadeMaxima;

    /** @static
     O operador estático faz com que o pertencimento deixe de ser do objeto para a classe.
     */
    private static double velocidadeLimite = 240;

    /*
    * Construtores
    */

    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public Carro() {
    }

    public void imprime () {
        System.out.println("Marca: " + this.nome);
        System.out.println("Velocidade Máxima: " + this.velocidadeMaxima + "km/h");
        System.out.println("Velocidade Limite: " + velocidadeLimite + "km/h");
        System.out.println("-----------------");
    }

    /*
    * Getters & Setters
    */

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public double getVelocidadeLimite() {
        return velocidadeLimite;
    }

    public static void setVelocidadeLimite(double velocidadeLimite) {
        Carro.velocidadeLimite = velocidadeLimite;
    }

}
