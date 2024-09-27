/*
10. Implemente um algoritmo que receba de entrada N valores digitados pelo usuário. Dentre os valores digitados, seu programa deve encontrar o menor e o maior dos valores fornecidos.
*/

import java.util.Arrays;
import java.util.Scanner;

public class Gustavo10{
  public static void main(String[]args){
    Scanner telcado = new Scanner(System.in);
  
    System.out.println("Quantos números você deseja digitar? ");
    int Numeros = telcado.nextInt();
    int[] numeros = new int[Numeros];
    System.out.format("Digite os %d números:\n", Numeros);
    for (int i = 0; i < Numeros; i++) {
      numeros[i] = telcado.nextInt();
    }
    Arrays.sort(numeros);
    int menor = numeros[0];
    int maior = numeros[Numeros - 1];
    System.out.println("O menor número é: " + menor);
    System.out.println("O maior número é: " + maior);
  }
}