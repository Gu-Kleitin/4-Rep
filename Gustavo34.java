/* 34. Crie um programa em Java que realize a validação dos dados cadastrais de um usuário. O programa deve solicitar ao usuário que insira as seguintes informações:
Nome Completo: Deve ter no mínimo 3 caracteres e deve conter apenas letras e espaços.
Idade: Deve ser um número inteiro entre 08 e 120.
CPF: Deve seguir o formato XXX.XXX.XXX-XX, onde X é um dígito numérico. Além disso, o CPF deve ser válido, conforme realizado na versão anterior (você pode utilizar uma função de validação simples para verificar a validade do CPF).
Telefone: Deve seguir o formato (XX) XXXXX-XXXX, onde X é um dígito numérico.

O programa deve solicitar cada um desses dados ao usuário até que valores válidos sejam fornecidos. Utilize laços de repetição e condições para garantir que os dados inseridos respeitem os critérios estabelecidos. */

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Gustavo34{
  public static void main(String[]args){
    Scanner Cad = new Scanner(System.in);
    String CPF, Nome, Numero;
    System.out.println("Vamos fazer o seu cadastro");
    
    System.out.println("Digite seu nome completo: ");
    Nome = Cad.nextLine();
    while(validarNome(Nome)==false){
      System.out.println("Digite seu nome completo: ");
      Nome = Cad.nextLine();
    }

    System.out.println("Digite seu CPF(XXX.XXX.XXX-XX): ");
    CPF = Cad.nextLine();
    CPF = CPF.replaceAll("[.-]","");
    while(CPFvalido(CPF) == false){
      System.out.println("Digite seu CPF: ");
      CPF = Cad.nextLine();
      CPF = CPF.replaceAll("[.-]","");
    }
    
    System.out.println("Digite seu número ((XX) XXXXX-XXXX): ");
    Numero = Cad.nextLine();
    while(VerificNumero(Numero)==false){
      System.out.println("Digite seu número ((XX) XXXXX-XXXX): ");
      Numero = Cad.nextLine();
    }
  }
  //verificando se o nome é válido
  public static boolean validarNome(String nome) {
    String regex = "^[a-zA-Z\\sàáâãéêíóôõúüçÀÁÂÃÉÊÍÓÔÕÚÜÇ]{3,}$";
    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(nome);
    return matcher.matches();
  }
  //verificando se o CPF é válido
  public static boolean CPFvalido(String CPF){
    int v1, v2, Digito10, Digito11;;
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

    return Digito10 ==v1 && Digito11 == v2;
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
  //verificador de número no formato brasileiro
  public static boolean VerificNumero(String Numero){
    String regex = "^\\(\\d{2}\\) \\d{5}-\\d{4}$"; 
    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(Numero);
    return matcher.matches();
  }
}