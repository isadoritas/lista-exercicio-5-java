import java.util.Scanner;
public class Medias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c, mediaAritmetica, mediaHarmonica, mediaGeometrica;
        System.out.println("Insira o primeiro valor: ");
        a = scanner.nextDouble();
        System.out.println("Insira o segundo valor: ");
        b = scanner.nextDouble();
        System.out.println("Insira o terceiro valor: ");
        c = scanner.nextDouble();
        mediaAritmetica = calcularMediaAritmetica(a, b, c);
        mediaGeometrica = calcularMediaGeometrica(a, b, c);
        mediaHarmonica = calcularMediaHarmonica(a, b, c);
        System.out.println("\nA média aritmética desses números é " + mediaAritmetica);
        System.out.println("\nA média geométrica desses números é " + mediaGeometrica);
        System.out.println("\nA média harmônica desses números é " + mediaHarmonica);
        scanner.close();
    
    }
    public static double calcularMediaAritmetica(double a, double b, double c) {
        return (a + b + c) / 3;
    }
    public static double calcularMediaHarmonica(double a, double b, double c) {
        return 3 / (1/a + 1/b + 1/c);
    }
    public static double calcularMediaGeometrica(double a, double b, double c) {
        return Math.cbrt(a * b * c);
    }
 
}