package application;

/*Fazer um programa para ler um número inteiro N e uma matriz de ordem N (N linhas e colunas) contendo números inteiros.
 *Em seguida, mostrar a diagonal principal e a quantidade de valores negativos da matriz.*/

import java.util.Scanner;

public class Matriz_Exemplo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe quantas linhas e colunas terá sua matriz: ");
        int tamanhoMatriz = scan.nextInt();
        int contagemNegativos = 0;
        scan.nextLine();

        int[][] matriz = new int[tamanhoMatriz][tamanhoMatriz];

        for (int linha = 0; linha < matriz.length; linha++) {
            System.out.printf("\n%dª linha: \n", linha + 1);

            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                //matriz[linha].length corresponde a quantidade de posições que a linha tem.

                System.out.printf("Informe o %dº valor: ", coluna + 1);
                matriz[linha][coluna] = scan.nextInt();
                if (matriz[linha][coluna] < 0) {
                    contagemNegativos++;
                }
            }
        }
        System.out.println("\nDiagonal principal: ");
        for (int posicao = 0; posicao < matriz.length; posicao++) {
            System.out.printf("%d ", matriz[posicao][posicao]);
        }
        System.out.printf("\nNúmeros Negativos = %d", contagemNegativos);
        scan.close();
    }
}