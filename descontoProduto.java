public class descontoProduto {
    public static void main(String[] args) {
        // 1. Declarar e inicializar as variáveis booleanas
        boolean produtoDesconto = true;
        boolean clienteTemCupom = false;

        // 2. Usar o operador lógico para verificar se o desconto pode ser aplicado
        boolean podeUsarDesconto = produtoDesconto || clienteTemCupom;

        // 3. Exibindo o resultado
        System.out.println("Desconto aplicado: " + podeUsarDesconto);
    }


}
