import java.util.Scanner;
public class Imposto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double custo, taxaImposto;

        System.out.println("Qual o custo desse item?");
        custo = scanner.nextDouble();
        System.out.println("Qual a porcentagem de imposto?");
        taxaImposto = scanner.nextDouble();
        double resultado = somaImposto(taxaImposto, custo);
        System.out.println("O novo valor do item é " + resultado);
        scanner.close();
        
    }
    public static double somaImposto(double taxaImposto, double custo) {
        return (taxaImposto/ 100 * custo + custo);
    }
}