import java.util.Scanner;

public class salarioAdicional {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Digite o salario: ");
        double salarioBase = input.nextDouble();

        System.out.print("Digite o valor do percentual de aumento: ");
        double percentualAumento = input.nextDouble();

        double salarioReajustado = salarioBase * percentualAumento;

        double salarioFinal = salarioReajustado + salarioBase;

        System.out.println("=== SALARIO ===");
        System.out.println("Valor do reajuste: R$ " + salarioReajustado);
        System.out.println("Salario final: R$ " + salarioFinal);
    }
}
