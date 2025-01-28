import java.util.Scanner;

/*
Ler um inteiro N e uma matriz quadrada de ordem N e mostrar qual o maior elemento de cada linha.
Suponha não haver empates.

Entrada:
A entrada contém o número N, depois os dados da matriz.
Saída:
A saída contém os números representando o maior elemento de cada linha da matriz
 */

public class exMatrizMaioresValores {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Determine a mesma quantidade de linhas e colunas: ");
        int tamanhoMatrix = scan.nextInt();
        int[][] matriz = new int[tamanhoMatrix][tamanhoMatrix];

        for (int linha = 0; linha < tamanhoMatrix; linha++) {
            for (int coluna = 0; coluna < tamanhoMatrix; coluna++) {
                System.out.printf("Informe o %dº número da %dª linha: %n", coluna + 1, linha + 1);
                matriz[linha][coluna] = scan.nextInt();
            }
        }
        System.out.printf("%nTodos os números salvos nesta Matriz em suas linhas e colunas: %n");
        for (int linha = 0; linha < tamanhoMatrix; linha++) {
            for (int coluna = 0; coluna < tamanhoMatrix; coluna++) {
                System.out.printf(matriz[linha][coluna] + " ");
            }
            System.out.printf("%n");
        }
        System.out.printf("%n");
        for (int linha = 0; linha < tamanhoMatrix; linha++) {
            int maiorDaLinha = matriz[linha][0];
            for (int coluna = 0; coluna < tamanhoMatrix; coluna++) {
                if (matriz[linha][coluna] > maiorDaLinha) {
                    maiorDaLinha = matriz[linha][coluna];
                }
            }
            System.out.printf("O maior número da %dª linha é: %d%n", linha +1, maiorDaLinha);
        }
        scan.close();
    }
}