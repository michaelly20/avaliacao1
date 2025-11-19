import java.util.Scanner;

public class calculoNotaFinal {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor da nota 1: ");
        double nota1 = input.nextDouble();

        System.out.println("Digite o valor da nota 2: ");
        double nota2 = input.nextDouble();

        final double MEDIA_APROVACAO = 7.0;

        double media = (nota1 + nota2) / 2;

        boolean resultado = media >= MEDIA_APROVACAO;
        System.out.println("O aluno está: " + (resultado ? "Aprovado!" : "Reprovado!"));

        if(media >= MEDIA_APROVACAO){
            System.out.println("Voce esta aprovado!");
        }
        else {
            System.out.println("Voce nao esta aprovado!");
        }

    }
}
