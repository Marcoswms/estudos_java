package application;

/* Fazer um programa para ler um número inteiro (que definirá o tamanho do vetor) e depois os dados (id, nome e salário)
   de um funcionários cadastrados.
 * Em seguida, efetuar o aumento de X por cento no salário de um determinado funcionário.

 * O programa deverá ler um ID e o valor X por cento e ao final, mostrar a listagem atualizada dos funcionários.
 * Caso o ID informado não existir, mostrar uma mensagem e abortar a operação mostrando apenas a lista de funcionários.
 */

import entities.Funcionarios;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("Quantos funcionários serão cadastrados? ");
        int quantidadeDeCadastro = scan.nextInt();
        Funcionarios[] armazenaCadastro = new Funcionarios[quantidadeDeCadastro];

        for (int index = 0; index < quantidadeDeCadastro; index++) {
            System.out.println();
            System.out.printf("Funcionário #%d:\n", (index + 1));
            System.out.printf("Informe o ID:\n");
            int id = scan.nextInt();

            while (idSeRepetido(armazenaCadastro, id) == true) {
                System.out.println("Este ID já consta cadastrado, insira outro ID: ");
                id = scan.nextInt();
            }
            System.out.printf("Informe o Nome:\n");
            scan.nextLine();
            String nome = scan.nextLine();

            System.out.printf("Informe o Salário:\n");
            double salario = scan.nextDouble();
            Funcionarios funcionario = new Funcionarios(id, nome, salario);
            armazenaCadastro[index] = funcionario;//Guarda o objeto 'funcionario' na posição index do vetor
        }
        System.out.println();
        System.out.println("Informe o ID do funcionário que terá aumento salarial: ");
        int id = scan.nextInt();
        scan.nextLine();
        Integer posicaoId = idSeNulo(armazenaCadastro, id);

        if (posicaoId == null) {
            System.out.println("Este ID não existe!");
        } else {
            System.out.println("Informe a porcentagem aplicada: ");
            double porcentagem = scan.nextDouble();
            armazenaCadastro[posicaoId].aumentoSalarial(porcentagem);
        }
        System.out.println();
        System.out.println("Lista de funcionários: ");
        for (Funcionarios exibirCadastro : armazenaCadastro) {
            System.out.println(exibirCadastro);
        }
        scan.close();
    }

    //WrapperClass 'Integer' para retornar valor 'null' caso não localizar o 'ID'.
    public static Integer idSeNulo(Funcionarios[] armazenaCadastro, int id) {
        for (int index = 0; index < armazenaCadastro.length; index++) {
            if (armazenaCadastro[index].getId().equals(id)) {
                return index;
            }
        }
        return null;
    }

    public static Boolean idSeRepetido(Funcionarios[] armazenaCadastro, Integer id) {
        for (Funcionarios comparaId : armazenaCadastro) {
            if (comparaId != null && comparaId.getId().equals(id)) {
                return true;
            }
        }
        return false;
    }
}