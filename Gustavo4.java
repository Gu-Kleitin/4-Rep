/*
4. Escreva um algoritmo que receba números do usuário e imprima o triplo de cada número. O algoritmo deve encerrar ao ser digitado o número 999. Obs.: O triplo de -999 não deve ser exibido.
*/

import java.util.Scanner;

public class Gustavo4{
  public static void main(String[]args){
    Scanner teclado = new Scanner(System.in);
    int z = 0;
    while(z==0){
      System.out.println("Digite um número inteiro: ");
      int n = teclado.nextInt();
      if(n==999){
        System.out.println("Me mandaram encerrar por aqui");
        break;
      }
      else{
        while((n < 999) || (n >= -999)){
          if((n > 999) || (n <= -999)){
            System.out.println("O seu número não vai poder passar");
          }
          else{
            int triplo = n*3;
            System.out.format("O triplo do seu número é: %d\n",triplo);
          }
          break;
        }
      }
    }
  }
}