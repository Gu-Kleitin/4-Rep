/*
29. Suponha que JAVA possua somente as operações de soma e subtração. Dados dois números inteiros
positivos A e B, determine o quociente e o resto da divisão de A por B.
*/

import java.util.Scanner;

public class Gustavo29{
  public static void main(String[]args){
    Scanner ixcan = new Scanner(System.in);

    System.out.println("Digite um número: ");
    int N1 = ixcan.nextInt();
    System.out.println("Digite mais um número: ");
    int N2 = ixcan.nextInt();

    int N1R = N1;
    int N2R = N2;

    int Resto = 0;
    int quociente = 0;
    while(N1R >= N2R){
      N1R = N1R-N2R;
      quociente++;
    }
    System.out.println("O quociente é: "+quociente);
    System.out.println("O resto da divisão é: ");
    if(N1 == 0){
      System.out.println(0);
    }
    else if(N2 == 0){
      System.out.println(0);
    }
    else{
      System.out.println(N1R);
    }
  }
}