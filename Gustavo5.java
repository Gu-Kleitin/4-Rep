/*
5. Faça um programa que calcule e imprima a soma e a média dos 10 primeiros números positivos. Soma = 1 + 2 + 3 + ... + 10
*/



public class Gustavo5{
  public static void main(String[]args){
    int somatorio = 0;
    for(int i = 0; i < 11; i++){
      somatorio +=i;      
    }
    double media = (double)somatorio/10;
    System.out.println(media);
  }
}