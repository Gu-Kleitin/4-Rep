/*
6. Faça um programa que calcule e imprima a soma e a média dos N primeiros números positivos. Soma = 1 + 2 + 3 + ... + N
*/

import java.util.Scanner;

public class Gustavo6{
  public static void main(String[]args){
    Scanner teclado = new Scanner(System.in);
    System.out.println("Digite um número inteiro: ");
    int n = teclado.nextInt();
    int n2 = n+1;
    int Num[]= new int[n2];
    int somatorio = 0;
    for(int i = 0; i<n2; i++){
      Num[i]=n2;
      somatorio += i; 
    }
    double media = (double) somatorio/n;
    System.out.format("A soma dos seus %d números é: %d \nE a média deles é: %.1f\n", n,somatorio, media);
    
  }
}