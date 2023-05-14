import java.util.Scanner;
public class Reverso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        System.out.println("Digite o número:");
        numero = scanner.nextInt();
        double inverso = reverterNumero(numero);
        System.out.println("Esse número ao inverso é: " + inverso);
        scanner.close();
    }
    public static int reverterNumero(int numero) {
        int numeroReverso = 0;

    while (numero != 0) {
        int digito = numero % 10;
        numeroReverso = numeroReverso * 10 + digito;
        numero /= 10;

    }
    return (int) numeroReverso;
    
}
}