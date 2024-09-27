/*12. No último ano foi realizada um estudo estatístico sobre acidentes de trânsito em 5 cidades brasileiras.
Para isso os seguintes dados foram coletados:
a) Nome da cidade (String ou char).
b) Número de veículos
c) Número de acidentes de trânsito
Com esses dados deseja-se saber:
a) O maior e o menor índice de acidentes e o nome da cidade a que pertencem
b) A razão entre quantidade de acidentes por quantidade de veículos nas 5 cidades analisadas
c) A média de veículos nas cinco cidades
d) A média de acidentes de trânsito nas cidades com menos de 200 veículos
*/

import java.util.Scanner;

public class Gustavo12{
  public static void main(String[]args){
    Scanner telcado = new Scanner(System.in);
    int i = 0;
    String[] Cidades = new String[5];
    Integer[] Veiculos = new Integer[5];
    Integer[] Acidentes = new Integer[5];
    Integer[] AcidentesAnt = new Integer[5];
    
    System.out.println("Vou precisar que digite o nome da cidade.");
    System.out.println("O número de veículos que ela tem.");
    System.out.println("O número de acidentes que ela teve no último ano.");
    System.out.println("E o número de acidentes no ano anterior: \n");

    for(i = 0; i<5; i++){
      Cidades[i] = telcado.nextLine();
      Veiculos[i] = telcado.nextInt();
      Acidentes[i] = telcado.nextInt();
      AcidentesAnt[i] = telcado.nextInt();
      telcado.nextLine();
    }
    
    int IndiceMaior = 0;
    int IndiceMenor = 0;
    // a fórmula original era essa, mas não consegui usando ela, então tive que ir na tentativa pra ver oq q dava. (double)((Acidentes[0]/AcidentesAnt[0])-1)*100;
    
    double MaiorIndice = (double)(Acidentes[0]-AcidentesAnt[0])/AcidentesAnt[0];
    double MenorIndice = (double)(Acidentes[0]-AcidentesAnt[0])/AcidentesAnt[0];
    for(i=0; i<5; i++){
      double IndiceAtual = (double)(Acidentes[i]-AcidentesAnt[i])/AcidentesAnt[i];
      if(IndiceAtual>MaiorIndice){
        MaiorIndice = IndiceAtual;
        IndiceMaior = i;
      }
      if (IndiceAtual<MenorIndice){
        MenorIndice=IndiceAtual;
        IndiceMenor=i;
      }
    }
    System.out.println("\n==========================Índice de acidentes===================================\n");
    System.out.format("O maior índice de acidentes é: %.2f", MaiorIndice*100);
    System.out.println("% na cidade de " +Cidades[IndiceMaior]);
    System.out.format("O menor índice de acidentes é: %.2f", MenorIndice*100);
    System.out.println("% na cidade de "+Cidades[IndiceMenor]);

    System.out.println("\n===================================Razão de Acidentes============================\n");

    double[] RazaoAcidentesVeiculos = new double[5];
    for(i = 0; i<5; i++){
      RazaoAcidentesVeiculos[i] = (double)Acidentes[i]/Veiculos[i];
    }
    
    for(i=0; i<5; i++){
      System.out.format(Cidades[i] + ": %f ",  RazaoAcidentesVeiculos[i]);
      System.out.println();
    }
    
    System.out.println();
    System.out.println("===============================Média de Veículos==================================\n");
    int SomaVeiculos = 0;
    for(i=0; i<5; i++){
      SomaVeiculos += Veiculos[i];
    }
    double MediaVeiculos = (double)SomaVeiculos/5;
    System.out.format("A média de veículos nas 5 cidades é: %.2f \n", MediaVeiculos);


    int SomaCidadesPequenas = 0;
    int ContadorCidadesPequenas = 0;
    for (i = 0; i < 5; i++) {
      if (Veiculos[i] < 200) {
        SomaCidadesPequenas += Acidentes[i];
        ContadorCidadesPequenas++;
      }
    }
    double MediaCidadesPequenas = (double) SomaCidadesPequenas / ContadorCidadesPequenas; 
    if(MediaCidadesPequenas >=1){
      System.out.println("==============================Média nas Cidades Pequenas===========================");
      System.out.format("Média de acidentes nas cidades com menos de 200 veículos: %.2f" , MediaCidadesPequenas);
      System.out.println("\n==================================================================================\n");
    }
    else{
      System.out.println("\n==================================================================================\n");
    }
  }
}