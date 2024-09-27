/*
20. Construa um algoritmo para calcular a média de valores PARES e ÍMPARES, que serão digitados pelo usuário. Ao final, o algoritmo deve mostrar estas duas médias bem como o maior número PAR e o menor número ÍMPAR digitado. O algoritmo finaliza quando o usuário digitar um valor negativo. 
*/

import java.util.Scanner;
import java.util.ArrayList;

public class Gustavo20{
  public static void main(String[]args){
    Scanner scanin = new Scanner(System.in);
    ArrayList<Integer> Par = new ArrayList<Integer>();
    ArrayList<Integer> Impar = new ArrayList<Integer>();

    double SomaP = 0;
    double MediaP = 0;
    double SomaI = 0;
    double MediaI = 0;

    System.out.println("Você vai digitar números, se quiser parar digite um número negativo:  ");
    int Num;
    double NPar = 0;
    double MPar = 0;
    double mImpar = 1.79769313486231570E+308;
    //não consegui pensar em outra forma além de pegar o maior valor double para a aplicar
    do{
      Num = scanin.nextInt();
      NPar = Num%2;

      if (NPar == 0){
        if(Num>0){
          Par.add(Num);
          SomaP += Num;
          if(Num>MPar){
            MPar=Num;
          }
        }
        else{
          System.out.println("Preparando relatório...");
        }
      }
      else{
        if(Num>0){
          Impar.add(Num);
          SomaI += Num;
          if(mImpar>Num){
            mImpar = Num;
            
          }      
        }
        else{
          System.out.println("Preparando relatório...");
        }
      }
    }while(Num>=0);
    if(Par.size()>0){
      MediaP = SomaP / Par.size();
      System.out.format("A soma dos números pares é: %.2f, e a média deles é de: %.2f\n", SomaP, MediaP);
      System.out.println("Maior par: "+MPar);
    }
    if(Impar.size()>0){
      MediaI = SomaI/Impar.size();
      System.out.format("A soma dos números ímpares é: %.2f, e a média deles é de: %.2f\n", SomaI, MediaI);
      System.out.println("Menor número ímpar digitado: "+mImpar);
    }
  }
}