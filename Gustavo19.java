/*
19. Faça um programa que deve solicitar números para o usuário até que seja digitado -1. Quando o usuário digitar -1, o programa termina e imprime a média de todos os números positivos digitados.
  */

import java.util.ArrayList;
import java.util.Scanner;

public class Gustavo19 {
  public static void main(String[] args) {
    Scanner EquisCan = new Scanner(System.in);
    ArrayList<Double> numeros = new ArrayList<Double>();
    
    double Soma = 0;
    double Media = 0;
    
    System.out.println("TU vai digitar eternamente, ou até digitar -1");
    System.out.println("Digite um número:" );
    double Numero;
    
    do {
      Numero = EquisCan.nextDouble();
      if (Numero != -1) {
        numeros.add(Numero);
        Soma += Numero;
      }
    }
    while (Numero != -1);
    if (numeros.size() > 0) {
      Media = Soma / numeros.size();
      System.out.format("Soma dos números: %.2f \n",Soma);
      System.out.format("Média dos números: %.2f \n", Media);
    }
    else {
      System.out.println("Nenhum número foi digitado.");
    }
  }
}