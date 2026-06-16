package model;

public abstract class Avatar {
    private String nome;

    public Avatar() {
    }

    public abstract void habilidadeEspecial();

    public abstract void barraDeHabilidadeEspecial();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void barraDeVida() {
        System.out.println("100 pontos de Vida");
    }

    public void barraDeVigor() {
        System.out.println("100 pontos de Vigor");
    }
}