public class ControleFluxo5 {

    public static void main(String[] args) {

        //Tenho um valor total de um carro e quero descobrir em quantas parcelas posso parcelar, contudo, as parcelas devem ser maiores ou igual a R$1000,00

        double valorTotal = 30000;

        for (int parcela = 1; parcela < valorTotal; parcela++) {

            double valorParcela = valorTotal / parcela;

            if (valorParcela < 1000) {
                break;
            }
            System.out.println("Parcela " + parcela + " R$ " + valorParcela);
        }
    }
}
