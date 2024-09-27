/*
31. Em uma eleição presidencial existem quatro candidatos. Os votos são informados através de códigos. Os dados utilizados para a contagem dos votos obedecem à seguinte codificação:
- 1, 2, 3, 4: voto para os respectivos candidatos;
- 5: voto em branco;
- Outros valores: voto nulo.
Elabore um algoritmo que leia o código do candidato em um voto. Calcule e escreva:
- total de votos para cada candidato;
- total de votos nulos;
- total de votos em branco;
Como finalizador do conjunto de votos, tem-se o valor de código igual à 0.
*/

import java.util.Scanner;

public class Gustavo31{
  public static void main(String[]args){
    Scanner urna = new Scanner(System.in);

    int voto, cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0, cont5 = 0, cont = 0;
    System.out.println("Números dos candidatos:");
    System.out.println("Candidato José Vermelho: 1");
    System.out.println("Candidato Sarg.Fagundes: 2");
    System.out.println("Candidato Borrachão: 3");
    System.out.println("Candidato Euzébio: 4");
    System.out.println("Nulo: 5");
    System.out.println("Finalizar: 0");
    System.out.println("");
    while(true){
      System.out.println("Já pode votar: ");
      voto = urna.nextInt();
      System.out.println();
      if(voto<=5){
        if(voto == 1){
          cont1 = cont1+1;
        }
        if(voto == 2){
          cont2=cont2+1;
        }
        if(voto == 3){
          cont3=cont3+1;
        }
        if(voto == 4){
          cont4=cont4+1;
        }
        if(voto==5){
          cont5 = cont5+1;
        }
        if(voto== 0){
          break;
        }
      }
      if(voto>5){
        cont = cont+1;
      }
    }
    System.out.println("A quantidade de votos para o candidato José Vermelho foi: "+cont1);
    System.out.println("\nA quantidade de votos para o candidato Sarg.Fagundes foi: "+cont2);
    System.out.println("\nA quantidade de votos para o candidato Borrachão foi: "+cont3);
    System.out.println("\nA quantidade de votos para o candidato Euzébio foi: "+cont4);
    System.out.println("\nA quantidade de votos em branco foi: "+cont5);
    System.out.println("\nA quantidade de votos nulos foi: "+cont);
  }
}