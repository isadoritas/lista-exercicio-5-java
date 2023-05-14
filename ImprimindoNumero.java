import java.util.Scanner;
public class ImprimindoNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        System.out.println("Digite o número: ");
        numero = scanner.nextInt();

        imprimirVezes(numero);
        scanner.close();
    }
    public static void imprimirVezes(int numero) {
    for (int i = 0; i < numero; i++) {
        System.out.println(numero + " ");
}
}
}