import java.util.Scanner;

/*
Fazer um programa para ler duas matrizes de números inteiros A e B, contendo de M linhas e N colunas cada.
Gerar uma terceira matriz C onde cada elemento desta é a soma dos elementos correspondentes das matrizes originais.

Entrada:
A entrada contém os valores de M e N, depois os valores da primeira matriz A, depois os valores da segunda matriz B,
Saída:
A saída contém os valores da matriz gerada C.
 */

public class exSomarDuasMatrizes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.printf("%nInforme a quantidade de Linhas de sua lista: ");
        int numeroDeLinhas = scan.nextInt();
        System.out.printf("Informe a quantidade de Colunas de sua lista: ");
        int numeroDeColunas = scan.nextInt();
        int[][] matrizA = new int[numeroDeLinhas][numeroDeColunas];
        int[][] matrizB = new int[numeroDeLinhas][numeroDeColunas];
        int[][] matrizC = new int[numeroDeLinhas][numeroDeColunas];

        for (int linha = 0; linha < numeroDeLinhas; linha++) {
            System.out.printf("%nAtenção - Linha %d:%n", linha + 1);
            for (int coluna = 0; coluna < numeroDeColunas; coluna++) {
                System.out.printf("Lista A - Digite o %dº valor da %dª linha: ", coluna + 1, linha + 1);
                matrizA[linha][coluna] = scan.nextInt();
            }
            System.out.println();
            for (int coluna = 0; coluna < numeroDeColunas; coluna++) {
                System.out.printf("Lista B - Digite o %dº valor da %dª linha: ", coluna + 1, linha + 1);
                matrizB[linha][coluna] = scan.nextInt();
                matrizC[linha][coluna] = matrizA[linha][coluna] + matrizB[linha][coluna];
            }
        }
        System.out.printf("%nA soma de cada elemento correspondente as mesmas posições das matrizes A e B, foram armazenadas na Matriz C: %n");
        for (int linha = 0; linha < numeroDeLinhas; linha++) {
            System.out.printf("Linha %d - ", linha + 1);
            for (int coluna = 0; coluna < numeroDeColunas; coluna++) {
                System.out.printf(matrizC[linha][coluna] + " ");
            }
            System.out.println();
        }
        scan.close();
    }
}