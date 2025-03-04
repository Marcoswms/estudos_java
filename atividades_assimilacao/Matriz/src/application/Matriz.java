package application;
/*O programa terá uma Matriz com 'M' linhas por 'N' colunas contendo números inteiros como entrada 'X'
  podendo ter repetições;
 * Após inserir os dados, escolher um número 'Y' para que seja revelado sua posição e mostrar os valores:
 * À esquerda, acima, a direita e abaixo de 'Y' quando houver.
 * PS: Posição e valores de TODAS as repetições de 'Y' cadastradas.
 */

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a quantidade de linhas: ");
        int quantidadeDeLinhas = scan.nextInt();

        System.out.println("Informe a quantidade de colunas: ");
        int quantidadeDeColunas = scan.nextInt();

        Integer[][] matriz = new Integer[quantidadeDeLinhas][quantidadeDeColunas];

        for (int linha = 0; linha < matriz.length; linha++) {
            System.out.println("\nLinha:");

            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                System.out.printf("Informe o %dº valor: ", coluna + 1);
                matriz[linha][coluna] = scan.nextInt();
            }
        }

        System.out.println("Escolha um número para verificar todas as posições e valores em que ele aparece: ");
        int recebeNumero = scan.nextInt();
        scan.nextLine();

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                if (recebeNumero == matriz[linha][coluna]) {
                    System.out.printf("Posição: %d, %d", linha, coluna);
                    if (coluna > 0) {
                        System.out.printf("\nEsquerda: %d", matriz[linha][coluna - 1]);
                    }
                    if (linha > 0) {
                        System.out.printf("\nAcima: %d", matriz[linha - 1][coluna]);
                    }
                    if (coluna < matriz[linha].length - 1) {
                        System.out.printf("\nDireita: %d", matriz[linha][coluna + 1]);
                    }
                    if (linha < matriz.length - 1) {
                        System.out.printf("\nAbaixo: %d", matriz[linha + 1][coluna]);
                    }
                }
            }
        }
        System.out.println();
        scan.close();
    }
}
