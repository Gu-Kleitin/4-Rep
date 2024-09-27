/*
7. Faça um algoritmo que imprima a soma da sequência apresentada: H = 1/1 + 1/2 + 1/3 + ... + 1/N. O valor de N deve ser positivo e fornecido pelo usuário.
*/
import java.util.Scanner;

public class Gustavo7 {

  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.print("Digite o valor de N: ");
    int n = teclado.nextInt();

    double soma = 0;
    for (int i = 1; i <= n; i++) {
      soma += 1.0 / i;
    }

    System.out.format("A soma da sequência é: %.2f \n", soma);
  }
}