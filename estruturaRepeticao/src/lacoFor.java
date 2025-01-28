import java.util.Scanner;

/*
Leia um valor inteiro X (1 <= X <= 1000).
Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o X, se for o caso.
 */
public class lacoFor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Determine o tamanho do array: ");
        int x = scan.nextInt();
        int array[] = new int[x];

        for (int index = 0; index < x; index++) {
            System.out.println("Informe o número que será armazenado:");
            int y = scan.nextInt();
            array[index] = y;
        }

        /*Foreach - dentro da condição for, cria-se uma variável onde ela receberá os valores
        de cada posição do array informado após o sinal':'*/
        for (int recebePosicao : array) {
            System.out.println(recebePosicao);
        }
        scan.close();
    }
}