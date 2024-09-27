/*13. Faça um algoritmo para identificar se um determinado número fornecido pelo usuário é primo ou não. Lembrando que um número primo só é divisível por 1 e por ele mesmo. Exemplos: 2, 5, 7, etc.
  */
import java.util.Scanner;

public class Gustavo13 {

  public static void main(String[] args) {

    Scanner telcado = new Scanner(System.in);
    System.out.print("Digite um número inteiro: ");
    int numero = telcado.nextInt();
    
    if (Primo(numero)) {
      System.out.format("%d é primo \n", numero);
    } 
    else {
      System.out.format("%d não é primo \n", numero);
    }
  }

  public static boolean Primo(int n) {
    if (n <= 1) {
      return false;
    }
    if (n == 2) {
      return true;
    }
    if (n % 2 == 0) {
      return false;
    }
    for (int i = 3; i <= Math.sqrt(n); i += 2) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }
}