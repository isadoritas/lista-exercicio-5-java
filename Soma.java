import java.util.Scanner;
public class Soma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double argumento1, argumento2, argumento3;
        System.out.println("Digite o primeiro argumento: ");
        argumento1 = scanner.nextDouble();
        System.out.println("Digite o segundo número: ");
        argumento2 = scanner.nextDouble();
        System.out.println("Digite o terceiro número: ");
        argumento3 = scanner.nextDouble();

        double resultado = somarArgumentos(argumento1, argumento2, argumento3);
        System.out.println("A soma desses argumentos é " + resultado);
        scanner.close();

    }
    public static double somarArgumentos(double argumento1, double argumento2, double argumento3) {
        return (argumento1 + argumento2 + argumento3);
    }
}