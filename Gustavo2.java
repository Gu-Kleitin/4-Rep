/*
2. Escreva um programa que imprima os números pares de 0 à 50. Utilize a estrutura for.
*/

public class Gustavo2{
  public static void main(String[]args){
    for (int n = 1; n <= 50; n++) {
      if ((n%2) == 0) {
        System.out.println(n);
      }
    }
  }
}