import java.util.Scanner;
public class PositivoOuNegativo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double argumento;

        System.out.println("Digite o argumento:");
        argumento = scanner.nextDouble();

        calcularPositivoOuNegativo(argumento);
        scanner.close();
    }
    public static void calcularPositivoOuNegativo(double argumento) {
        if (argumento < 0) {
            System.out.println("\nN");
        } else {
            System.out.println("\nP");
        }
    
    }
}