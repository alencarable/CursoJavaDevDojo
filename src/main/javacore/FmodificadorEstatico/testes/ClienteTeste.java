package main.javacore.FmodificadorEstatico.testes;


import main.javacore.FmodificadorEstatico.classes.Cliente;

public class ClienteTeste {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        Cliente cliente1 = new Cliente();
        Cliente cliente2 = new Cliente();

        System.out.println("Exibindo quantidade de parcelas possíveis");
//        for (int parcela:
//             cliente.getParcelas()) {
//            System.out.println(parcela);
//        }

        System.out.println(Cliente.getParcelas().length);
    }
}
