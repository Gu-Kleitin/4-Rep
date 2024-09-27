/*
23. Considere uma linha ferroviária entre São Paulo e Curitiba. Suponha que uma locomotiva (trem) A parte de São Paulo para Curitiba com velocidade de 30 m/s enquanto que uma outra locomotiva B parte de Curitiba para São Paulo no mesmo instante com velocidade de 40 m/s. Considere a distância entre São Paulo e Curitiba de 400 Km. Considere também que as linhas férreas são paralelas. Implemente um algoritmo que calcule iterativamente o tempo em que as locomotivas se cruzarão no caminho. O algoritmo deve calcular também a distância que as locomotivas devem percorrer até o momento do cruzamento.
*/

import java.util.Scanner;

public class Gustavo23{
  public static void main(String[]args){
    Scanner tecrado = new Scanner(System.in);

    System.out.println("Digite a hora em que as duas locomotivas saíram(7.20): ");
    double HSaida = tecrado.nextDouble();

    int DA = 0;
    int DB = 400000;

    double H = Math.floor(HSaida);
    double M = HSaida-H;
    M = M*100;
    M = Math.round(M); //tive que procurar esse arredondamento pois quando eu ia extrair a parte decimal ela ficava com um centésimo a menos(ex:15.18, era pros minutos virarem 0.18 para que eu fizesse o resto, mas acontecia isso: 0.17999999999999972, então pesquisei sobre arredondamento pra ficar direito)
    
    int Hora = (int)H;  
    int Min = (int)M;
    int PemS = (Hora*3600) + (Min*60);

    int T = 0;
    while(DA < DB){
      DA = DA + 30;
      DB = DB - 40;
      T = T+1;
    }
    double DistA = (double)DA;
    double DistB = (double)DB;
    
    int HEncontroS = PemS + T;
    int MinEn = HEncontroS/60;
    double Encontro = (double)MinEn/60;
    double Encontro2 = Math.floor(Encontro);
    double minutoE = Encontro- Encontro2;
    minutoE = Math.round(minutoE*100);
    minutoE = minutoE/100;
    minutoE = 60*minutoE;
    minutoE = Math.round(minutoE);
    
    int Hcruzamento = (int)Encontro2;
    int Mcruzamento = (int)minutoE;

    System.out.println("==========Informativo sobre as viagens paralelas==========");
    System.out.println("\nAs Locomotivas saíram as: "+Hora+":"+Min);
    System.out.println("Se encontraram as: "+Hcruzamento+":"+Mcruzamento);
    System.out.format("Tendo a locomotiva A percorrendo %.2f Km e a locomotiva B percorrendo %.2f Km até elas se encontrarem.\n \n", DistA/1000, DistB/1000);
  }
}
