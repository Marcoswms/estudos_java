package exemplo.entities;

//final: Evita que a classe seja 'Herdada' por outra classe, ou um método seja 'Sobrescrito'.
public final class SavingsAccount extends Account{
    private Double interestRate;

    public SavingsAccount(){
        super();
    }

    public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance(){
        balance += balance * interestRate;
    }

    //@Override é uma forma de Sobrescrita com a finalidade de alterar o comportamento de um método já existente.
    @Override
    public final void withdraw(double amount) {
        balance -= amount;
    }
}