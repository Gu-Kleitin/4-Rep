/*
22. Sabe-se que um país A possui 500000 habitantes e uma taxa de natalidade de 3% ao ano, já o país B possui 700000 habitantes e uma taxa de natalidade de 2% ao ano. Escreva um algoritmo, sabendo que estamos no ano de 2015, que calcule em que ano a população do país A ultrapassará a população de B.
*/

import java.util.Scanner;

public class Gustavo22{
  public static void main(String[]args){
    Scanner TecTec = new Scanner(System.in);

    double PopulacaoA = 500000;
    double PopulacaoB = 700000;

    double TaxaNatalidadeA = 0.03;
    double TaxaNatalidadeB = 0.02;

    int Ano = 2015;
    while (PopulacaoA < PopulacaoB){
      PopulacaoA += PopulacaoA * TaxaNatalidadeA;
      PopulacaoB += PopulacaoB * TaxaNatalidadeB;
      Ano++;
    }
    System.out.format("A População do país A superou a População do país B no ano de: %d com a população de: %.2f, enquanto a população do país B está terá %.2f habitantes\n", Ano, PopulacaoA, PopulacaoB);
  }
}