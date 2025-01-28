import java.util.Scanner;
/*Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.*/

public class ex01NumeroNegativo {
    public static void main (String[]  args){
        Scanner scan = new Scanner(System.in);

        int entradaDoNumero = scan.nextInt();

        if (entradaDoNumero < 0 ) {
            System.out.print("NEGATIVO");
        }
        else System.out.print("NAO NEGATIVO");

        scan.close();
    }
}