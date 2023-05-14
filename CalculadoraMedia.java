//Faça um programa que leia dois números informados pelo usuário a partir doteclado. Possua uma função (método) que receberá os dois números lidos peloteclado como parâmetro e que apresente o resultado da média aritmética dos dois números informados.//
import java.util.Scanner;
public class CalculadoraMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        double numero1 = scanner.nextDouble();

        System.out.println("Digite o segundo número:");
        double numero2 = scanner.nextDouble();

        double media = calcularMedia( numero1, numero2);
        System.out.println("A média aritmética é: " + media);

        scanner.close();
    }
    public static double calcularMedia(double numero1, double numero2) {
        return(numero1 + numero2 / 2);
    }
}
