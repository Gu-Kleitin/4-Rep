/*
18. Faça um algoritmo que simule o funcionamento de uma calculadora que contenha as operações aritméticas básicas com dois números digitados pelo usuário. O programa implementado deve mostrar seguinte menu ao usuário. Não se esqueça de verificar se as operações podem ser realizadas.
=========================
Calculadora de Fulano
=========================
Opções:
1 - Soma
2 - Subtração
3 - Multiplicação
4 - Divisão
5 – Sair
=========================
*/

import java.util.Scanner;

public class Gustavo18{
  public static void main(String[]args){
    Scanner teclado = new Scanner(System.in);
    
    while (true){
      System.out.println("=========================");
      System.out.println("Calculadora de Fulano");
      System.out.println("=========================");
      System.out.println("Opções:");
      System.out.println("1-Soma \n2-Subtração \n3-Multiplicação \n4-Divisão \n5-Sair \n");
      int Operacao = teclado.nextInt();
      
      if(Operacao == 5){
        System.out.println("Voce escolheu sair, thau");
        break;
      }
      else if((Operacao <= 0) || (Operacao >5)){
        System.out.println("Não é uma opção válida");
        break;
      }
      
      System.out.println("Digite um número: ");
      double Num1 = teclado.nextDouble();
      System.out.println("\nDigite mais um número: ");
      double Num2 = teclado.nextDouble();

      double Soma = 0;
      double Subtracao = 0;
      double Multiplicacao = 1;
      double Divisao = 1;
      
      if(Operacao == 1){
       Soma = Num1 + Num2;
        System.out.println(Soma);
        System.out.println();
      }
      else if(Operacao == 2){
        Subtracao = Num1 - Num2;
        System.out.println(Subtracao);
       System.out.println();
      }
      else if(Operacao == 3){
        Multiplicacao = Num1*Num2;
        System.out.println(Multiplicacao);
        System.out.println();
      }
      else if(Operacao == 4){
        if(Num2==0){
          System.out.println("Divisão por 0 não pode\n");
        }
        else{
          Divisao = Num1/Num2;
          System.out.println(Divisao);
          System.out.println();
        }
      } 
    }

  }
}
