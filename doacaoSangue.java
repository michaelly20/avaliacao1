import java.util.Scanner;

public class doacaoSangue {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Digite a idade: ");
        int idadePessoa = input.nextInt();

        System.out.println("Digite o peso: ");
        double peso = input.nextDouble();

        final double PESO_MINIMO = 50.0;

        boolean elegivel = idadePessoa >= 18 && peso >= PESO_MINIMO;
        System.out.println("Ele pode doar: " + (elegivel ? "SIM" : "NAO"));

    }
}
