import java.util.Scanner;

public class conversaoTemperatura {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Solicitacao da temperatura em celsius
        System.out.println("Digite a temperatura em Celsius: ");
        double celsius = input.nextDouble();

       //Conversao da temperatura de Celsius para Farenheit
        double farenheit = (celsius * 9/5) + 32;

        //Exibindo o resultado
        System.out.println("Convertido para farenheit: " +  farenheit);


    }
}
