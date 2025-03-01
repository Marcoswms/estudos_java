import java.util.Scanner;
import java.util.Locale;

/*
Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades.
Depois, mostrar na tela o nome da pessoa mais velha.
 */
public class exPessoaMaisVelha {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        String nomeDoMaisVelho = "";
        int idadeDoMaisVelho = 0;

        System.out.printf("%nInforme em número quantas pessoas serão cadastradas: %n");
        int quandidadeDeCadastro = scan.nextInt();
        String[] vetorNomeCadastrado = new String[quandidadeDeCadastro];
        int[] vetorIdadeCadastrada = new int[quandidadeDeCadastro];

        for (int index = 0; index < quandidadeDeCadastro; index++) {
            System.out.printf("%nDigite o %dº nome para cadastro: %n", (index + 1));
            vetorNomeCadastrado[index] = scan.next();
            System.out.printf("%nQuantos anos %s possui(?): %n", vetorNomeCadastrado[index]);
            vetorIdadeCadastrada[index] = scan.nextInt();
            System.out.printf("%nCadastrado !%n");
        }
        for (int index = 0; index < quandidadeDeCadastro; index++) {
            if (vetorIdadeCadastrada[index] >= idadeDoMaisVelho) {
                idadeDoMaisVelho = vetorIdadeCadastrada[index];
                nomeDoMaisVelho = vetorNomeCadastrado[index];
            }
        }
        System.out.printf("%nNome do mais velho(a): %s e sua idade é: %d ano(s)", nomeDoMaisVelho, idadeDoMaisVelho);
        scan.close();
    }
}