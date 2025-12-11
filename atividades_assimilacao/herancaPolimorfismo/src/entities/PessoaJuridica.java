package entities;

public class PessoaJuridica extends TaxaPorPessoa {

    private Integer quantidadeFuncionarios;

    public PessoaJuridica() {
        super();
    }

    public PessoaJuridica(String nome, double rendaAnual, int quantidadeFuncionarios) {
        super(nome, rendaAnual);
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    @Override
    public double total() {
        double valor = getRendaAnual();
        if (quantidadeFuncionarios > 10) {
            valor *= 0.14;
        } else {
            valor *= 0.16;
        }
        return valor;
    }
}