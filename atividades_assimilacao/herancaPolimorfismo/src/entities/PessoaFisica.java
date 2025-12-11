package entities;

public class PessoaFisica extends TaxaPorPessoa {
    private Double despesaSaude;

    public PessoaFisica() {
        super();
    }

    public PessoaFisica(String nome, double rendaAnual, double despesaSaude) {
        super(nome, rendaAnual);
        this.despesaSaude = despesaSaude;
    }

    @Override
    public double total() {
        double valor = getRendaAnual();
        if (valor < 20000.00) {
            valor *= 0.15;
        } else {
            valor *= 0.25;
        }
        if (despesaSaude > 0.0) {
            valor -= despesaSaude * 0.50;
        }
        return valor;
    }
}