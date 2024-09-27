/*
17. Escreva um algoritmo que calcule o m.d.c. (máximo divisor comum) entre A e B (número inteiros e positivos). Esses dois valores são passados pelo usuário através do teclado. Utilize a lógica do algoritmo de Euclides.
*/

import java.util.Scanner;

public class Gustavo17{
  public static void main(String[]args){
    Scanner ixcan = new Scanner(System.in);

    System.out.println("Digite um número: ");
    int N1 = ixcan.nextInt();
    System.out.println("Digite mais um número: ");
    int N2 = ixcan.nextInt();

    int N1R = N1;
    int N2R = N2;

    int Resto = 0;

    while(N2R != 0){
      Resto = N1R-N2R;
      N1R = N2R;
      N2R = Resto;
    }
    System.out.println("Resultado: ");
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