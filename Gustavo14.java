/*14. Faça um programa que calcule e imprima o fatorial do valor N. O valor de N será fornecido de entrada pelo usuário. O fatorial de um número positivo N qualquer (representado por N!) é o produto de todos os inteiros positivos menores ou iguais à N, ou seja, Fatorial (N) = 1 * 2 * 3 * ... * N. Por exemplo, o fatorial de 5 = 1*2*3*4*5 = 120.
  */

import java.util.Scanner;

public class Gustavo14{
  public static void main(String[]args){
    Scanner teclado = new Scanner(System.in);

    System.out.println("Digite o número inteiro para calcularmos o fatorial dele: ");
    int num = teclado.nextInt();
    int i = 1;
    long Fatorial = 1;
    for(i = 1; i<=num; i++){
      Fatorial=Fatorial*i;      
    }
    //percebi que a partir de 13 o resultado fica errado
    System.out.println(Fatorial);
  }
}