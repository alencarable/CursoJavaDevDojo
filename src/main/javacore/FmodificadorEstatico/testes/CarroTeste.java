package main.javacore.FmodificadorEstatico.testes;

import main.javacore.FmodificadorEstatico.classes.Carro;

public class CarroTeste {

    public static void main(String[] args) {

        Carro esportivo = new Carro("BMW", 280);
        Carro utilitario = new Carro("Audi", 275);
        Carro luxo = new Carro("Mercedes", 300);

        esportivo.imprime();
        utilitario.imprime();
        luxo.imprime();

        System.out.println("##################");

        /*
        Ao alterar a velocidade limite, no caso um atributo estático, mesmo alterando apenas um,
        todos os outros serão afetados, pois o atributo estático referencia à classe e não ao objeto.


        esportivo.setVelocidadeLimite(200);
        esportivo.imprime();
        utilitario.imprime();
        luxo.imprime();

         */

        /**
        O certo seria

        Carro.velocidadeLimite = 200

         excluindo-se os getters & setters desse atributo.
        */

    }
}
