/*15. Faça um programa em JAVA que imprima os N primeiros termos da serie de Fibonacci. Sabe-se que N é fornecido pelo usuário. Fibonacci = 1, 1, 2, 3, 5, 8, 13, 21, ...
*/

import java.util.Scanner;

public class Gustavo15{
  public static void main(String[] args){
    Scanner teclado = new Scanner(System.in);
    
    
    System.out.println("Digite quantos números de fibonacci você que ver: ");
    int Qntd = teclado.nextInt();
    
    System.out.println();
    
    int num1 = 1;
    int num2 =0;
    System.out.println(num1);
    for(int i = 0; i < Qntd-1; i++){
      num1 = num1 + num2;
      num2 = num1 - num2;
      System.out.println(num1);
    }
  }
}
