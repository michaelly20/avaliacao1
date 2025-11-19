public class verificacaoDeCompra {
    public static void main(String[] args) {
        double precoDoProduto = 20.0;
        double dinheiroDisponivel = 20.0;

        final double TAXA_DESCONTO = 0.10; // 10% de desconto

        //Calculo do preco final com desconto
        double precoFinal = precoDoProduto -(precoDoProduto * TAXA_DESCONTO);


        //Verificacao se o cliente tem dinheiro sulficiente
        boolean compraPermitida = precoFinal <= dinheiroDisponivel;
        //Exibindo o resultado
        System.out.println("Compra permitida: " + compraPermitida);





    }

}
