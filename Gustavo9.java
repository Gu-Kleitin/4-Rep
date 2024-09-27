/*
9. Faça um programa que calcule e imprima a soma e a média de N números digitados pelo usuário. O valor de N deve ser fornecido pelo usuário.
*/

import java.util.Scanner;

public class Gustavo9{
  public static void main(String[]args){
    Scanner teclado = new Scanner(System.in);
    System.out.println("quantos números deseja escrever?: ");
    int Numeros = teclado.nextInt();
    int[] numeros = new int[Numeros];
    int somatorio = 0;
    for (int i = 0; i < Numeros; i++) {
      System.out.println("Digite um número: ");
      numeros[i] = teclado.nextInt();
      somatorio += numeros[i];
    }
    double media = (double) somatorio / Numeros;
    System.out.format("A soma dos seus %d números é: %d \nE a média deles é: %.1f\n", Numeros ,somatorio, media);
  }
}