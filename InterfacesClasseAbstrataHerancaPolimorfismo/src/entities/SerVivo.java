package entities;

//Esta é uma CLASSE ABSTRATA, NÃO podemos instanciá-la e diferente de uma interface, podemos adicionar 'Implementação'.
//'SerVivo agora é uma Super Classe (ou classe 'Mãe'), pois o método 'dormir' já está implementado nela.'
public abstract class SerVivo {
    protected int idade;

    public SerVivo(int idade) {
        this.idade = idade;
    }

    public abstract void respirar();

    public void dormir() {
        System.out.println("Dormindo...");
    }
}