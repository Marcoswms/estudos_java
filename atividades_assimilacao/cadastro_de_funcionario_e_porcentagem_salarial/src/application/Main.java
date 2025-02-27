package application;

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

        for (int index = 0; index < armazenaCadastro.length; index++) {
            System.out.printf("Funcionário #%d:\n", (index + 1));

            System.out.printf("Informe o ID:\n");
            int id = scan.nextInt();

            System.out.printf("Informe o Nome:\n");
            scan.nextLine();
            String nome = scan.nextLine();

            System.out.printf("Informe o Salário:\n");
            double salario = scan.nextDouble();
            armazenaCadastro[index] = new Funcionarios(id, nome, salario);
        }

        System.out.println("Informe o ID do funcionário que terá aumento salarial: ");
        int id = scan.nextInt();
        System.out.println("Informe a porcentagem aplicada: ");
        double porcentagem = scan.nextDouble();

        Funcionarios armazenaCadastro = new Funcionarios(id, porcentagem);

        System.out.println("Lista de funcionários: ");
        for (Funcionarios exibirCadastro : armazenaCadastro) {
            System.out.println(exibirCadastro);
        }
        scan.close();
    }
}