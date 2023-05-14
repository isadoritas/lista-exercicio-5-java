// 2. Escreva um algoritmo que leia o preço de um produto a partir do teclado. Esse
// programa deverá ter uma função que receba esse dado lido como parâmetro e que
// calcule a porcentagem acrescida no valor do produto.
// Deverá no final, apresentar na tela o valor do produto acrescido de 10% de seu valor
// original.

import java.util.Scanner;

public class CalcularPreco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o preço do produto:");
        double precoAntigo = scanner.nextDouble();

        double preco = atualizarPreco(precoAntigo);
        System.out.println("O novo preço do produto é: " + preco);

        scanner.close();
    }

    public static double atualizarPreco(double precoAntigo) {
        return precoAntigo + (0.1 * precoAntigo);
    }
}
