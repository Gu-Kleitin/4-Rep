/*
21. Implemente um programa que receba de entrada um número inteiro qualquer, após isso verifique se o número inserido é ou não um PALÍNDROMO, ou seja, o número é o mesmo tanto de visto da direita para esquerda quanto da esquerda para a direita. Ex: 121, 1441, 34643, etc. Não utilize funções pré-definidas no JAVA.

boolean Palindromo = true;
int length = Num.length();

for(int i = 0; i < length / 2; i++){
  if(Num.charAt(i) != Num.charAt(length - 1 - i)){
    Palindromo = false;
    break;
  }
}
if(Palindromo){
  System.out.println("seu número é um palíndromo");
}
else {
  System.out.println("seu número não é um palíndromo");
}
*/

import java.util.Scanner;

public class Gustavo21{
  public static void main(String[] args) {
    Scanner Escaner = new Scanner(System.in);
    System.out.println("Digite seu número: ");
    int Num = Escaner.nextInt();
    int Num2 = Num;
    int Dig = 0;
    int palindromo = 0;
    while(Num!=0){
      Dig = Num%10;
      Num = Num/10;
      palindromo = palindromo*10+Dig;
    }
    if(palindromo == Num2){
      System.out.println("Seu número é um palíndromo. "+palindromo);
    }
    if(palindromo != Num2){
      System.out.println("Seu número não é palindromo: "+palindromo);
    }
  }
}
