import java.util.Scanner;

/*
Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir.
Cada caso de teste consiste de 3 valores reais, cada um deles com uma casa decimal.
Apresente a média ponderada para cada um destes conjuntos de 3 valores, sendo que o primeiro valor tem peso 2,
o segundo valor tem peso 3 e o terceiro valor tem peso 5.
 */

public class exForUri1079MediaPonderada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int peso01 = 2;
        int peso02 = 3;
        int peso03 = 5;

        System.out.printf("%nInforme quantas vezes o programa terá de executar: %n");
        int numeroDeCasosTeste = scan.nextInt();

        for (int index = 1; index <= numeroDeCasosTeste; index++) {
            System.out.printf("%nDigite o primeiro valor: %n");
            double entradaDoValor01 = scan.nextDouble();
            System.out.printf("%nDigite o segundo valor: %n");
            double entradaDoValor02 = scan.nextDouble();
            System.out.printf("%nDigite o terceiro valor: %n");
            double entradaDoValor03 = scan.nextDouble();

            double mediaPonderada = (entradaDoValor01 * peso01 + entradaDoValor02 * peso02 + entradaDoValor03 * peso03) / (peso01 + peso02 + peso03);
            System.out.printf("%n%.1f%n", mediaPonderada);
        }
        scan.close();
    }
}
