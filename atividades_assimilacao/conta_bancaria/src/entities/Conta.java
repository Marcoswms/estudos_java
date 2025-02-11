package entities;

public class Conta {
    private int numeroDaConta;
    private String nomeDoTitular;
    private double saldoDaConta;

    public Conta(int numeroDaConta, String nomeDoTitular, double depositoInicial) {
        this.numeroDaConta = numeroDaConta;
        this.nomeDoTitular = nomeDoTitular;
        adicionaSaldo(depositoInicial);//Encapsulando a regrade negócio "adicionaSaldo" dentro do construtor
    }
    public Conta(int numeroDaConta, String nomeDoTitular) {
        this.numeroDaConta = numeroDaConta;
        this.nomeDoTitular = nomeDoTitular;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public String getNomeDoTitular() {
        return nomeDoTitular;
    }

    public double getValorDaConta() {
        return saldoDaConta;
    }

    public void adicionaSaldo(double atualizaSaldo) {
        this.saldoDaConta += atualizaSaldo;
    }

    public void removeSaldo(double atualizaSaldo) {
        this.saldoDaConta -= atualizaSaldo + 5.00;
    }

    @Override
    public String toString() {
        return "\nDados da conta: " +
                "\nConta: " + numeroDaConta +
                "\nNome do Titular: " + nomeDoTitular +
                "\nSaldo: " + String.format("%.2f", saldoDaConta) + "\n";
    }
}

