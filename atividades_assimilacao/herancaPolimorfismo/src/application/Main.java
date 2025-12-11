/* Fazer um programa para ler os dados de N contribuintes (N fornecido pelo usuário), os quais podem ser pessoas física
    ou pessoa jurídica, e depois mostrar o valor do imposto pago por cada um, bem como o total de imposto arrecadado.

 . Pessoa Física: Se a renda for abaixo de 20000.00 pagam 15% de imposto. Pessoas com renda de 20000.00 em diante pagam
    25% de imposto. Se a pessoa teve gastos com saúde, 50% destes gastos são abatidos no imposto.

 . Pesso Jurídica: Pagam 16% de imposto, porém, se a empresa possuir mais de 10 funcionários, ela pagara 14% de imposto.
 */
package application;

import entities.PessoaFisica;
import entities.PessoaJuridica;
import entities.TaxaPorPessoa;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        List<TaxaPorPessoa> listaDePessoa = new ArrayList<>();

        System.out.print("Insira o número de contribuintes: ");
        int n = scan.nextInt();
        scan.nextLine();

        for (int index = 1; index <= n; index++) {
            System.out.println("\nDados do contribuinte nº" + index);

            System.out.print("Pessoa física ou jurídica (p/j)? ");
            char tipoPessoa = scan.next().charAt(0);
            scan.nextLine();
            System.out.print("Nome: ");
            String nome = scan.nextLine();
            System.out.print("Renda anual: ");
            double rendaAnual = scan.nextDouble();

            if (tipoPessoa == 'p') {
                System.out.print("Despesas com saúde: ");
                double despesaSaude = scan.nextDouble();
                listaDePessoa.add(new PessoaFisica(nome, rendaAnual, despesaSaude));
            } else {
                System.out.print("Número de funcionários: ");
                int quantidadeFuncionarios = scan.nextInt();
                listaDePessoa.add(new PessoaJuridica(nome, rendaAnual, quantidadeFuncionarios));
            }
        }
        double totalImposto = 0.0;
        System.out.println("\nIMPOSTOS PAGOS:");
        for (TaxaPorPessoa lista : listaDePessoa) {
            System.out.printf("%s: $ %.2f\n", lista.getNome(), lista.total());
            totalImposto += lista.total();
        }
        System.out.printf("\nTOTAL DE IMPOSTOS: $ %.2f", totalImposto);
        scan.close();
    }
}