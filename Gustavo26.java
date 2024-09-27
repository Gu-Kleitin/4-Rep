/*
26. Implementar um algoritmo para calcular o sen(X). Sabe-se que o valor de X deverá ser fornecido pelo
usuário em graus. O valor do seno de X será calculado pela soma dos 15 primeiros termos da série a
seguir:
*/

import java.util.Scanner;

public class Gustavo26{
  public static void main(String[]args){
    Scanner teclado = new Scanner(System.in);
    int termo =1, i=1;
    long FatorialN = 1;
    int exp = 1;
    double N, SenX = 0;
    
    System.out.println("Digite o ângulo para calcularmos o seno: ");
    double Angulo = teclado.nextInt();
    double Rad = (Angulo*Math.PI)/180;
    
    for(int num = 2; num<5; num++){
      num = num+1; //base, e vou usar tbm pra ser a potência
      N = Math.pow(Rad, num); //denominador
      FatorialN = 1;
      for(i=1; i<=num; i++){
        FatorialN = FatorialN*i;
      }
      
      if(i%2 == 0){
        SenX -=N/FatorialN;
        System.out.println(SenX);
      }
      else{
        SenX +=N/FatorialN;
        System.out.println(SenX);
      }

    }
    System.out.format("Seno de %.0f é: %.2f", Angulo, SenX);
  }
}