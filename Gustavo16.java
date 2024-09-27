/*
16. Elabore um algoritmo que faça a conversão de um número binário de N bits digitados pelo usuário para o número na base octal, base decimal e base hexadecimal. Valide se o valor informado na entrada só possui 0’s ou 1’s, ou seja, se é mesmo um número binário. Não utilize funções pré-definidas no JAVA.
*/

import java.util.Scanner;

public class Gustavo16{
  public static void main(String[]args){
    Scanner teclado = new Scanner(System.in);
    int i = 0;
    System.out.println("Quantos bits você vai digitar? ");
    int NumB = teclado.nextInt();
    int ListB[] = new int[NumB];
    int Decimal = 0; 
    int Octal = 0;
     
    System.out.println("Agora você irá digitar os bits: ");
    for( i = 0; i < NumB; i++){
      System.out.println("Digite um bit: ");
      ListB[i] = teclado.nextInt();
    }
    
    if (ListB[i-1] != 0 && ListB[i-1] != 1) {
      System.out.println("Não é válido nesse código");
    }
    
    else {
      System.out.println("Binário");
      
      int Potencia = 0;
      for (i = NumB - 1; i >= 0; i--) {
        if (ListB[i] == 1) {
          Decimal += Math.pow(2, Potencia);
        }
        Potencia++;
      }

      System.out.format("Seu número em binário em decimal é: %d \n", Decimal);
      int Decimal2 = Decimal;

      int mult=1, resto;
      while(Decimal > 0){
        resto = Decimal%8;
        Decimal = Decimal/8;
        Octal = Octal + mult*resto;
        mult = mult*10;  
      }
      System.out.format("Seu número em Octal é: %d \n", Octal);

      String HexStr = "";
      int RestoDiv, Posicao = 0;
      String Restodiv2 = "";
      while(Decimal2>0){
        RestoDiv = Decimal2%16;

        Restodiv2 = Integer.toString(RestoDiv);
        switch(RestoDiv){
          case 10:
            Restodiv2 = "A";
            break;
          case 11:
            Restodiv2 = "B";
            break;
          case 12:
            Restodiv2 = "C";
            break;
          case 13:
            Restodiv2 = "D";
            break;
          case 14:
            Restodiv2 = "E";
            break;
          case 15:
            Restodiv2 = "F";
            break;
        }

        char[] hexChars = new char[HexStr.length() +1];
        for(i = 0; i < Posicao; i++){
          hexChars[i] = HexStr.charAt(i);
        }
        hexChars[Posicao] = Restodiv2.charAt(0);
        for(i = Posicao +1; i< hexChars.length; i++){
          hexChars[i] = HexStr.charAt(i-1);
        }
        HexStr = new String(hexChars);

        Posicao ++;
        Decimal2 = Decimal2/16;
      }

      System.out.println("Hexadecimal: " + HexStr);
    }
  }
}