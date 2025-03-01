import java.util.Scanner;
import java.util.Locale;

/*
Faça um programa que leia N números reais e armazene-os em um vetor.
Em seguida, mostrar na tela o maior número do vetor (supor não haver empates).
Mostrar também a posição do maior elemento.
 */

public class vetorMaiorNumeroEPosicao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.printf("%nInforme a quantidade de números para o comparativo: %n");
        int quantidadeDeNumeros = scan.nextInt();
        double[] vetor = new double[quantidadeDeNumeros];
        double maiorNumero = 0;
        int posicaoDoMaiorNumero = 0;

        for (int index = 0; index < quantidadeDeNumeros; index++) {
            System.out.printf("%nDigite o número desejado: %n");
            double entradaNumero = scan.nextDouble();
            vetor[index] = entradaNumero;
        }
        for (int index = 0; index < quantidadeDeNumeros; index++) {
            if (vetor[index] >= maiorNumero) {
                maiorNumero = vetor[index];
                posicaoDoMaiorNumero = index;
            }
        }
        System.out.printf("%nResultado: %.2f na posição: %d", maiorNumero, posicaoDoMaiorNumero);
        scan.close();
    }
}