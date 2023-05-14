import java.util.Scanner;

public class ConversorDeTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double fahrenheit, celsius;

        System.out.println("Digite a temperatura(em Fahrenheit): ");
        fahrenheit = scanner.nextDouble();

        celsius = ConverterTemperatura(fahrenheit);

        System.out.println("\nA temperatura em graus celsius é " + celsius);
        scanner.close();

    }
    public static double ConverterTemperatura(double fahrenheit) {
        return (fahrenheit - 32) / 1.8;
    } 
}