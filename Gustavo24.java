/*
24. Uma Empresa de fornecimento de energia elétrica faz a leitura mensal dos medidores de consumo. Para cada consumidor, são digitados os seguintes dados:
- Número do consumidor; 
- Quantidade de kWh consumidos durante o mês;
- Tipo (código) do consumidor.
1 – residencial, preço em reais por kWh = 0,3
2 – comercial, preço em reais por kWh = 0,5
3 – industrial, preço em reais por kWh = 0,7

Os dados devem ser lidos até que seja encontrado um consumidor com Número 0 (zero). Escreva um programa que calcule e imprima:
- O custo total para cada consumidor;
- O total de consumo para os três tipos de consumidor;
- A média de consumo dos tipos 1 e 2.

*/

import java.util.Scanner;

public class Gustavo24{
  public static void main(String[]args){
    Scanner teclado = new Scanner(System.in);
    int NConsumidor, CodConsumidor, QntdC1=0, QntdC2=0;
    
    double CustoConsumidor=0, TT1=0, TT2=0, TT3=0, Media1, Media2,  QtdkWh;
    
    System.out.println("Digite um número para se identificar(sem pontos ou vírgula): ");
    NConsumidor = teclado.nextInt();

    while(NConsumidor!=0){
      System.out.println("\n================================");
      System.out.println("Códigos de consumo:");
      System.out.println("1-Residencial \n2-Comercial \n3-Industrial");
      System.out.println("================================\n");

      System.out.println("Digite o código que representa seu consumo: ");
      CodConsumidor = teclado.nextInt();

      System.out.println("\nDigite agora a quantidade de kilowatts-hora que é gasto ao mês: ");
      QtdkWh = teclado.nextDouble();

      if(NConsumidor!=0){
        if(CodConsumidor==1){
          CustoConsumidor = QtdkWh*0.3;
          QntdC1 = QntdC1+1;
          TT1 = TT1+QtdkWh;
        }
          
        else if(CodConsumidor==2){
          CustoConsumidor = QtdkWh*0.5;
          QntdC2 = QntdC2+1;
          TT2 = TT2+QtdkWh;
        }
        
        else if(CodConsumidor==3){
          CustoConsumidor = QtdkWh*0.7;
          TT3 = TT3+QtdkWh;
        }
      }
      
      System.out.println("\n================================================");
      System.out.format("\nO Custo do consumidor %d é de: %.2f",NConsumidor, CustoConsumidor);
      System.out.println("\n================================================");
      
      System.out.println("\n\nDigite um número para se identificar(sem pontos ou vírgula): ");
      NConsumidor = teclado.nextInt();
    }
    System.out.format("\nO total do consumo para os consumidores do Tipo 1-Residencial é de: R$%.2f\n", TT1);
    
    System.out.format("\nO total do consumo para os consumidores do Tipo 2-Comercial é de: R$%.2f\n", TT2);
    
    System.out.format("\nO total do consumo para os consumidores do Tipo 3-Industrial é de: R$%.2f\n", TT3);

    Media1 = TT1/QntdC1;
    Media2 = TT2/QntdC2;
    
    System.out.format("\nA média do consumo do tipo 1-Residencial é de: %.2f kWh\n", Media1);
    System.out.format("\nA média do consumo do tipo 2-Comercial é de: %.2f kWh \n", Media2);

  }
}