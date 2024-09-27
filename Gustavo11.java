/*11. Faça um programa que leia a nota e o nome de N alunos na prova de algoritmos e imprima a maior e a menor nota computada e qual aluno tirou tais notas. Além disso, calcule e imprima também a soma e a média de todas as notas.

queria saber se dá para "juntar" valores de listas diferentes, o valor da lista1 está ligado ao valor da lista caso seus índices sejam iguais 1 para 1, 2 para 2 e segue. ex(Alunos[Rafael, Gustavo, Augusto] notas[10.4, 10.5, 10.6], a nota no indice 1 pertence ao aluno que está no mesmo indice de outra lista e se a organização de uma lista mudar, a organização da outra lista vai atrás)
  */


import java.util.Scanner;

public class Gustavo11{
  public static void main(String[]args){
    Scanner teclado = new Scanner(System.in);
    int i = 0;
    System.out.println("Quantos alunos fizeram a prova?");
    int Nalunos = teclado.nextInt();
    String[] Alunos = new String[Nalunos];
    Double[] notas = new Double[Nalunos];
    System.out.print("Digite o nome dos alunos em ordem, ");
    System.out.println("e digite a sua nota abaixo do nome: ");
    
    for(i = 0; i< Nalunos; i++){ 
      teclado.nextLine();
      Alunos[i] = teclado.nextLine();
      notas[i] = teclado.nextDouble();  
    }
    System.out.println("====================================");
    System.out.println("Alunos e suas notas: ");
    System.out.println("====================================");
    for(i = 0; i< Nalunos; i++){
      System.out.println("Aluno: "+Alunos[i]+" Nota: "+notas[i]);
      
    }
    System.out.println("====================================");
    
    double MaiorNota = notas[0];
    double MenorNota = notas[0];
    int IndiceMaiorNota = 0;
    int IndiceMenorNota = 0;
    for(i=0; i<Nalunos; i++){
      if(notas[i]>MaiorNota){
        MaiorNota = notas[i];
        IndiceMaiorNota = i;
      }
      if(notas[i]<MenorNota){
        MenorNota = notas[i];
        IndiceMenorNota = i;
      }
    }
    double Soma = 0;
    for(double nota : notas){
      Soma += nota;
    }
    double Media = Soma/Nalunos;
    System.out.println("======================================================");
    System.out.format("\nA quantidade de alunos que fizeram a prova é: %d",Nalunos);
    System.out.println("\nA maior nota é: "+MaiorNota+" do(a) aluno(a): " +Alunos[IndiceMaiorNota]);
    System.out.println("\nA menor nota é: "+MenorNota+" do(a) aluno(a): " +Alunos[IndiceMenorNota]);
    System.out.format("\nA soma de todas as notas é: %.2f",Soma);
    System.out.format("\nA média das notas é: %.2f", Media);
    System.out.println("\n======================================================");
  }
}