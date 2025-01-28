import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class forEfuncao {
    //Void: método que não retorna valor, ou seja, só executa alguma ação sem resultado específico.
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("\nEscolha o número para a tabuada: ");
        int entradaDados = scan.nextInt();
        int fimTabuada = 11;
        int vetorDeResultados[] = new int[fimTabuada];
        System.out.printf("\nA tabuada do número %d é: ", entradaDados);

        for (int index = 0; index < fimTabuada; index++) {
            vetorDeResultados[index] = entradaDados * index;

            System.out.printf("\n%d X %d = %d", entradaDados, index, vetorDeResultados[index]);

        }
        int valorA = vetorDeResultados[8];
        int valorB = vetorDeResultados[9];
        int valorC = vetorDeResultados[10];

        int tresValores = maiorValor(valorA, valorB, valorC);//Chamando a função 'maiorValor'.
        mostrarResultado(tresValores);//Chamando a função 'mostrarResultado'.
        scan.close();//Fechando Scanner.
    }

    /*Criando a Função 'maiorValor' e deverá ser criada fora do escopo de 'main', que também é uma função*/
    public static int maiorValor(int x, int y, int z) {
        /*Os parâmetros 'x','y','z' receberá os valores de 'tresValores' */
        int retornaMaiorValor;
        if (x > y && x > z) {
            retornaMaiorValor = x;
        } else if (y > z) {
            retornaMaiorValor = y;
        } else {
            retornaMaiorValor = z;
        }
        return retornaMaiorValor;
    }

    public static void mostrarResultado(int resultado) {
        /*O parâmetro 'resultado' receberá o valor de variável 'tresValores' */
        System.out.printf("\nImprimindo o maior valor do vetor: %d", resultado);
    }
}

