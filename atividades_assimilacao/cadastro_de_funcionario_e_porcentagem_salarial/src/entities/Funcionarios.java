package entities;

public class Funcionarios {
    private Integer id;
    private String nome;
    private Double salario;

    public Funcionarios(int id, String nome, double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public Funcionarios(int id, double salario) {
        this.id = id;
        this.nome = getNome();
        aumentoSalarial(id, salario);
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
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

    public void aumentoSalarial(int id, double porcentagem) {
        if (id == this.id) {
            this.salario *= porcentagem;
        }
    }
    @Override
    public String toString() {
        return id + ", " + nome + ", " + String.format("%.2f", salario);
    }
}
