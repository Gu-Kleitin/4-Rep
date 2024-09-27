/*
30. A companhia de teatro do IFMG Sabará deseja realizar uma série de espetáculos. A direção calcula que a despesa fixa do espetáculo é de R$200,00. Além disso, sabe-se que com os ingressos ao preço de R$5,00 serão vendidos 120 entradas. Em uma pesquisa de público estimou-se que a cada R$0,50 de diminuição no valor do ingresso espera-se um aumento de 26 ingressos nas vendas. Diante dessas informações, implemente um programa que calcule e imprima uma tabela contendo os valores dos lucros esperados em função do valor dos ingressos, fazendo uma variação nos ingressos de R$5,00 à R$1,00 de R$0,50 em R$0,50. Escreva ainda o lucro máximo esperado, o preço do ingresso e quantidade de ingressos vendidos para obtenção desse lucro máximo estimado.
*/

public class Gustavo30{
  public static void main(String[]args){
    int entrada, Qntdingresso = 120;
    double despesa = 200, Pingresso = 5.00, DescIngresso, Lucro = 0;

    System.out.println("Para o ingresso valendo R$5,00, serão vendidas 120 entradas, tendo um lucro de "+((5.00*120.00)-200)+" sobre o gasto de R$ 200,00");
    Lucro = 400;
    DescIngresso = 0.50;
    System.out.println("==============Lucro em função do valor do ingresso=============");
    for(Pingresso = 5.00; Pingresso>1.00;){
      Pingresso -= DescIngresso;
      Qntdingresso += 26;
      Lucro = (Pingresso*Qntdingresso)-despesa;
      
      System.out.println("==========================");
      
      System.out.println("\nSe o preço do ingresso for R$"+Pingresso+", venderemos "+Qntdingresso+" ingressos, e teremos um lucro de R$"+Lucro);
    }
  }
}