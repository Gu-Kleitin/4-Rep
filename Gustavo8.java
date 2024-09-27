/*8. Faça um algoritmo que imprima a soma da sequência apresentada: H = 1 - 1/2 + 1/3 – 1/4 + 1/5... 1/N. O valor de N deve ser positivo e fornecido pelo usuário.
*/

import java.util.Scanner;

public class Gustavo8{
  public static void main(String[]args){
    Scanner teclado = new Scanner(System.in);
    double H = 0;
    int termo =1;
    System.out.println("Digite um número: ");
    int N = teclado.nextInt();
    
    for(int num =1; num<=N; num++){
    H=H+(termo)*1.0/num;
    termo=-termo;
    }
    System.out.format("A soma da sequência é: %.2f \n", H);
    

  }
}