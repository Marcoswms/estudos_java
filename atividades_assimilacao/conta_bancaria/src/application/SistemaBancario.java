package application;

import java.util.Scanner;
import java.util.Locale;

import entities.Conta;

public class SistemaBancario {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        Conta conta;//declarando o objeto para instanciá-lo dentro de uma validação.

        System.out.println("Entre com o número da conta: ");
        int numeroDaConta = scan.nextInt();

        System.out.println("Entre com o nome do titular da conta: ");
        scan.nextLine();
        String nomeDoTitular = scan.nextLine();

        System.out.println("Deseja realizar um depósito inicial? (s/n): ");
        char validaAcao = scan.next().charAt(0);

        if (validaAcao == 's') {
            System.out.println("Entre com um depósito inicial: ");
            double depositoInicial = scan.nextDouble();
            conta = new Conta(numeroDaConta, nomeDoTitular, depositoInicial);
        } else {
            conta = new Conta(numeroDaConta, nomeDoTitular);
        } //Esta ação trata-se de uma 'Sobrecarga'.

        System.out.println(conta);

        System.out.println("Entre com um valor de depósito: ");
        double atualizaSaldo = scan.nextDouble();
        conta.adicionaSaldo(atualizaSaldo);

        System.out.println("Atualizando dados da conta: ");
        System.out.println(conta);

        System.out.println("Entre com um valor para saque: ");
        atualizaSaldo = scan.nextDouble();
        conta.removeSaldo(atualizaSaldo);

        System.out.println("Atualizando dados da conta: ");
        System.out.println(conta);
        scan.close();
    }
}