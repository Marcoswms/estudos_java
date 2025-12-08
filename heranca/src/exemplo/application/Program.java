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

        //Testando o comportamento do método SEM @Override:
        Account acc6 = new Account(1001, "Marcos", 1000.0);
        acc6.withdraw(200.0);
        System.out.println("Withdraw com a taxa de 5.0: " + acc6.getBalance());

        //Testando o comportamento do método COM @Override:
        Account acc7 = new SavingsAccount(1002, "Angela", 1000.0, 0.01);
        acc7.withdraw(200.0);
        System.out.println("Withdraw sem a taxa de 5.0: " + acc7.getBalance());

        //Testando o comportamentodo método COM @Override e usando o 'super' para adicionar a regra da SuperClasse.
        Account acc8 = new BusinessAccount(1003, "Mario", 1000.0, 500.0);
        acc8.withdraw(200.0);
        System.out.println("Withdraw com a taxa de 5.0 + taxa de 2.0: " + acc8.getBalance());

        /*Polomorfismo: São variáveis do MESMO TIPO que apontam para objetos diferentes, com padrões de comportamentos
          diferentes. Ex:

          TipoDeVar nomeDaVar = new Objeto01 (comportamento01)
          TipoDeVar nomeDaVar = new Objeto02 (comportamento01 e comportamento02)
         */
        Account x = new Account(1020, "José", 1000.0);
        Account y = new SavingsAccount(1023, "Maria", 1000.0, 0.01);
        x.withdraw(50.0);
        y.withdraw(50.0);
        System.out.println(x.getBalance() + ", e " + y.getBalance());

    }
}