package exemplo.application;

import exemplo.entities.Account;
import exemplo.entities.BusinessAccount;
import exemplo.entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {
        /*Como 'BusinessAccount' herda os comportamentos de 'Account', posso criar um objeto do
          tipo 'BusinessAccount' e ele terá todos os adicionais desta classe, incluindo os comportamentos herdados.
          EX: BusinessAccount account = new BusinessAccount();
        */

        Account acc = new Account(1001, "Alex", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

        //UPCASTING - É um Objeto de Subclasse que pode ser atribuido para uma variável de Superclasse da qual deriva.
        Account acc1 = bacc;
        //Ou esse exemplo:
        Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
        //Essa operação da certo, pois a SubClasse 'BusinessAccount' também é uma 'Account'.
        Account acc3 = new SavingsAccount(1004, "Ana", 0.0, 0.01);

        //DOWNCASTING - É a conversão de um objeto da SuperClasse para a Subclasse, o processo inverso.
        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100.0);

        /*BusinessAccount acc5 = (BusinessAccount) acc3;
        Só daria problema na hora da Execução, pois trata-se da
        conversão de SubClasse para outra SubClasse (BusinessAccount para SavingsAccount).

        Para resolver essa situação, utilizamos a palavra 'instanceof' para verificar se acc3 é do tipo BusinessAccount
        ou SavingAccount, utilizando em conjunto uma estrutura condicional para o comparativo:
        */
        if(acc3 instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.0);
            System.out.println("Loan! ");
        }

        if (acc3 instanceof SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount)acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }
    }
}