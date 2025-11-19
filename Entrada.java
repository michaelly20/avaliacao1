import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);


         System.out.println("Digite um numero: ");
         Integer numero = input.nextInt();

         System.out.println("Digite um nome");
         Character caractere = input.next().charAt(0);

         System.out.println("O resultado é: " + numero + caractere);
















    }
}
