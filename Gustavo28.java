/*
28. Escreva um programa em JAVA que imprima o triângulo abaixo, em que a altura do triângulo (número de
linhas) é fornecido pelo usuário.
#
##
###
####
#####
######
*/

import java.util.Scanner;

public class Gustavo28{
  public static void main(String[]args){
    Scanner tec = new Scanner(System.in);

    System.out.println("Vamos fazer um triangulo com #");
    System.out.println("Digite quantas linhas você quer fazer: ");
    int linha = tec.nextInt();
    String hash = "";
    for(int i = 1; i<= linha; i++){
      hash += "#";
      System.out.println(hash);
    }
  }
}

//esse código pode ser usado em uma função pra fazer menus no terminal