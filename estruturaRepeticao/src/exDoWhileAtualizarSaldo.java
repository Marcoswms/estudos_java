import java.util.Scanner;
import java.util.Locale;
/*
Escreva um programa que apresente quatro opções:
(a) consulta saldo;
(b) saque;
(c) depósito;
(d) sair.
O saldo deve iniciar em R$ 0,00. A cada saque ou depósito o valor do saldo deve ser atualizado
 */

public class exDoWhileAtualizarSaldo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        String opcaoDoUsuario = "";
        double saldoTotal = 0.00;

        do {
            Scanner scan = new Scanner(System.in);
            System.out.printf("%n(a)Consulta Saldo%n(b)Saque%n(c)Depósito%n(d)Sair%n");
            System.out.printf("%nInforme uma das alternativas acima: %n");
            opcaoDoUsuario = scan.next();

            switch (opcaoDoUsuario) {
                case "a":
                    System.out.printf("%nR$ %.2f%n", saldoTotal);
                    break;
                case "b":
                    System.out.printf("%nValor para saque: %n");
                    double saque = scan.nextDouble();
                    saldoTotal = saldoTotal - saque;
                    break;
                case "c":
                    System.out.printf("%nValor para depósito: %n");
                    double deposito = scan.nextDouble();
                    saldoTotal = saldoTotal + deposito;
                    break;
                case "d":
                    System.out.printf("%nObrigado !%n");
                    opcaoDoUsuario = "d";
                    scan.close();
                    break;
                default:
                    System.out.printf("%nAlternativa inválida, escolha novamente.%n");
                    break;
            }
        } while (opcaoDoUsuario != "d");
    }
}