package application;

import java.util.Locale;
import java.util.Scanner;

public class Vetor_01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o tamanho do vetor: ");
        int tamanhoVetor = scan.nextInt();
        double[] vetor = new double[tamanhoVetor];

        //'Index' para acessar cada posição do vetor atravéz do for.
        for (int index = 0; index < tamanhoVetor; index++) {
            System.out.printf("Digite o valor da " + (index + 1) + "ª posição: ");
            vetor[index] = scan.nextDouble();
        }
        double soma = 0.0;
        for (int index = 0; index < tamanhoVetor; index++) {
            soma += vetor[index];// 'soma' inicia com 0.0 + o valor da posição 'index' do vetor.
        }
        double media = soma / tamanhoVetor;

        System.out.printf("\nAltura média: %.2f", media);
        scan.close();
    }
}