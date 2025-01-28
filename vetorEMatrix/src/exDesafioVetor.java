import java.util.Scanner;
import java.util.Locale;

/*
Tem-se um conjunto de dados contendo a altura e o Gênero (M, F) de N pessoas.
Fazer um programa que calcule e escreva:

 a maior e a menor altura do grupo
 a média de altura das mulheres
 o número de homens
 */
public class exDesafioVetor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.printf("%nInforme em números quantas pessoas serão cadastradas: %n");
        int quantidadeParaCadastro = scan.nextInt();

        double[] vetorAltura = new double[quantidadeParaCadastro];
        String[] vetorGenero = new String[quantidadeParaCadastro];

        int contadorFeminino = 0;
        double recebeMediaAlturaFeminino = 0.0;
        int contadorMasculino = 0;

        for (int index = 0; index < quantidadeParaCadastro; index++) {
            System.out.printf("%nDigite a altura: %n");
            vetorAltura[index] = scan.nextDouble();
            System.out.printf("%nDigite (M) para Masculino ou (F) para Feminino: %n");
            vetorGenero[index] = scan.next();
            switch (vetorGenero[index]) {
                case "F":
                    contadorFeminino++;
                    recebeMediaAlturaFeminino = vetorAltura[index] + recebeMediaAlturaFeminino;
                    break;
                case "M":
                    contadorMasculino++;
                    break;
                default:
                    System.out.printf("%nSomente (F) Feminino ou (M) Masculino.%nRefaça o cadastro ! %n");
                    System.exit(0);
            }
            System.out.printf("%nCadastrado%n");
        }
        double recebeMenorAltura = vetorAltura[0];
        double recebeMaiorAltura = vetorAltura[0];
        for (int index = 0; index < quantidadeParaCadastro; index++) {
            if (vetorAltura[index] > recebeMaiorAltura) {
                recebeMaiorAltura = vetorAltura[index];
            }
        }
        for (int index = 0; index < quantidadeParaCadastro; index++) {
            if (vetorAltura[index] < recebeMenorAltura) {
                recebeMenorAltura = vetorAltura[index];
            }
        }
        System.out.printf("%nMaior altura do grupo: %.2f%nMenor altura do grupo: %.2f%nMédia da altura feminina: %.2f%nNúmero de homens: %d", recebeMaiorAltura, recebeMenorAltura, (recebeMediaAlturaFeminino / contadorFeminino), contadorMasculino);
        scan.close();
    }
}