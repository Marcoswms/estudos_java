import java.util.Scanner;
/*Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar*/

public class ex02ParOuImpar {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        int entradaDoNumero = scan.nextInt();

        if (entradaDoNumero % 2 == 0){
            System.out.println("PAR");
        }
        else System.out.println("IMPAR");

        scan.close();
    }
}