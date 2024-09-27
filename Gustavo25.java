/*
25. O valor aproximado de PI pode ser calculado usando os 51 primeiros termos da seguinte série:
    S= 1-1/3³+1/5³-1/7³+1/9³...
Sendo PI = Raíz cúbica de S*32. Sabendo disso, implemente um algoritmo que calcule e imprima o valor de PI utilizando a série apresentada.
for(int num = 2; num<51; num++){
    num = num+1;
    System.out.println(num);
    PI=PI+(termo)*1.0/Math.pow(num, 3);
    termo =-termo;
}
*/

public class Gustavo25{
    public static void main(String[]args){
        double S = 0;
        int termo = 0;
        double PI = 0;
        int num = 1;
        while(num <= 51){
            termo++;
            num = num+2;
            if(termo%2==0){
                PI=PI+(termo)*1.0/Math.pow(num, 3);
            }
            if(termo%2!=0){
                PI=PI-(termo)*1.0/Math.pow(num, 3);
            }
        }
        S = PI+1;
        PI = Math.cbrt(S*32);
        System.out.println(PI);
    }
}