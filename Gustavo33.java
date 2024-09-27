/*
33. O número de inscrição no CPF é composto de onze dígitos decimais, sendo os oito primeiros aleatoriamente designados no momento da inscrição. Já o nono (antepenúltimo) dígito indica a região fiscal responsável pela inscrição (MG é a região 6, portanto em todos CPF’s emitidos em MG o nono digito é 6. Por fim, o décimo e o décimo primeiro são dígitos verificadores calculados de acordo com um algoritmo definido pela Receita Federal e publicamente conhecido.
*/

import java.util.Scanner;

public class Gustavo33{
  public static void main(String[]args){
    Scanner teclado = new Scanner(System.in);
    int v1, v2, Digito10, Digito11;;
    String CPF;
    
    //Como eu poderia colocar uma máscara quando o usuário digita o cpf?
    System.out.println("digite o seu cpf sem espaços: ");
    CPF = teclado.nextLine();

    int [] Os9Digitos = new int[9];
    for(int i=0; i<9; i++){
      Os9Digitos[i] = Integer.parseInt(String.valueOf(CPF.charAt(i)));
    }

    //estou extraindo os dois ultimos digitos verificadores  03194567682
    int[] DigVerificad = new int[2];
    DigVerificad[0] = Integer.parseInt(String.valueOf(CPF.charAt(9)));
    v1 = DigVerificad[0];
    DigVerificad[1] = Integer.parseInt(String.valueOf(CPF.charAt(10)));
    v2 = DigVerificad[1];
   
    Digito10 = VerificadorDeDigitos(Os9Digitos);

    //verificação para o próximo digito
    int[] Os10Digitos = new int[10];
    for(int i =0; i<9; i++){
      Os10Digitos[i]=  Os9Digitos[i];
    }
    Os10Digitos[9] = Digito10;
    
    Digito11 = VerificadorDeDigitos2(Os10Digitos);
    if(Digito10 == v1 && Digito11 == v2){
      System.out.format("Os dígitos verificadores %d e %d estão corretos\n", v1, v2);
    }
    else{
      System.out.format("Um dos dígitos verificadores %d e %d estão errados\n", v1, v2);
    }
  }
  
  //meus métodos pra verificar os digitos
  public static int VerificadorDeDigitos(int[] Os9Digitos) {
    int somatorio = 0; 
    for (int i = 0; i < 9; i++) {      
      somatorio += Os9Digitos[i] * (10 - i);
    }   
    int resto = 11-(somatorio % 11);
    return (resto >= 10 )? 0 : resto;
  }
  //segundo verificador
  public static int VerificadorDeDigitos2(int[] Os9Digitos) {
    int somatorio = 0; 
    for (int i = 0; i < 10; i++) {
      somatorio += Os9Digitos[i] * (11 - i);
    }   
    int resto = 11-(somatorio % 11);
    return (resto >= 10)? 0 :  resto;
  }
}