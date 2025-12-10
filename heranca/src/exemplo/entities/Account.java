package exemplo.entities;

/* Abstract: Usado para garantir que a SuperClasse NÃO seja Instanciada, somente seus derivados poderão ser instancados.
 * Outro motivo de criarmos uma classe abstrata é o reuso de código e Polimorfismo: permitir outros comportamentos
   para Subclasses, colocar todos os tipos de contas (como nesta atividade) em uma mesma coleção de lista.

 */
public  abstract class Account {
    private Integer number;
    private String holder;
    protected Double balance;
/*Caso o atributo da SuperClasse precisar ser 'modificado' pela SubClasse, definí-lo como 'protected'*/

    public Account() {

    }

    public Account(Integer number, String holder, Double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public Integer getNumber() {
        return number;
    }
    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void withdraw(double amount) {
        balance -= amount + 5.0;
    }

    public void deposit(double amount) {
        balance += amount;
    }
}