public class FibonacciF1151 {
    public static void main(String[] args) {
        /*Fibonacci simples: 0 1 1 2 3 5 8 13 21 */

        int n = 9; // Receberá a quantidade de numeros que farão o resultado da fibonacci

        int nAnterior = 0;
        int nAtual = 1;
        int proximoN = 0;

        for (int index = 0; index < n; index++) {
            System.out.print(nAnterior);
            if (index < n - 1) {
                System.out.print(" ");
            }
            proximoN = nAnterior + nAtual;
            nAnterior = nAtual;
            nAtual = proximoN;
        }
    }
}