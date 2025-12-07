package exemplo.entities;

/*extends: Define que a classe 'BusinessAccount' terá todos os dados e comportamentos da classe 'Account'*/
public class BusinessAccount extends Account{
    private Double loanLimit;

    public BusinessAccount() {
        super();//Caso tenha alguma lógica quardada no construtor da SuperClasse
    }

    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
    /*O 'super' servirá como um 'this.' acessando os atributos da SuperClasse 'Account' e
    adicionando valor, através dos atributos deste construtor.*/
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(double amount) {
        if (amount <= loanLimit) {
            balance += amount - 10.0;
        }
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount);//Usando o 'super' para chamar o 'withdraw' com a regra da SuperClasse
        balance -= 2.0;
    }
}