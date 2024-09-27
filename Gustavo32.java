/*
32. Escrever um algoritmo que gera e escreve os 5 primeiros números perfeitos. Um número perfeito é aquele que é igual a soma dos seus divisores. (Ex.: 6 = 1+2+3; 28= 1+2+4+7+14 etc).
*/

import java.util.Scanner;

public class Gustavo32{
  public static void main(String[]args){
    Scanner teclado = new Scanner(System.in);
    long numero, SomaDiv = 0, contPerfeito = 0;
    numero = 1;
    while(contPerfeito<5){
      SomaDiv = 0;
      for(long i = 1; i<= numero/2; i++){
        if (numero%i==0){
          SomaDiv = SomaDiv+i;
        }
      }
      if(SomaDiv == numero){
        System.out.println(numero+" é Perfeito");
        contPerfeito++;
      }
      numero++;
    }
  }
}