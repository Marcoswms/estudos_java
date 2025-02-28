package entities;

public class Funcionarios {
    private Integer id;
    private String nome;
    private Double salario;

    public Funcionarios() {

    }

    public Funcionarios(Integer id, String nome, Double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public void aumentoSalarial(Double porcentagem) {
        salario += salario * porcentagem / 100.0;
    }

    @Override
    public String toString() {
        return id + ", " + nome + ", " + String.format("%.2f", salario);
    }
}
