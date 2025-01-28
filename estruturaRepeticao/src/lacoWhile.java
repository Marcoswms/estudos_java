import java. util.Scanner;

public class lacoWhile {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int somaDasEntradas = 0;
        int entradaDeNumero = scan.nextInt();

        while (entradaDeNumero != 0){
            somaDasEntradas += entradaDeNumero;
            entradaDeNumero = scan.nextInt();
        }
        System.out.println(somaDasEntradas);
    }
}