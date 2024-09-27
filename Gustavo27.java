/*
27. Implemente um programa que solicite um valor inteiro positivo (N) ao usuário. Após isso, imprima a
tabuada dos números de 1 à N.
*/
import java.util.Scanner;

public class Gustavo27{
  public static void main(String[]args){
    Scanner teclado = new Scanner(System.in);

    System.out.println("Digite um número: ");
    double num = teclado.nextDouble();
    double mult = 1;
    System.out.println("Os Resultados da tabuada do seu número: ");
    for(int i = 0; i <= num; i++){
      mult = i*num;
      System.out.println(i+" * "+num+" = "+mult);
    }
  }
}