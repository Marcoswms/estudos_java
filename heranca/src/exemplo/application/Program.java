package exemplo.application;

import exemplo.entities.BusinessAccount;

public class Program {
    public static void main(String[] args) {
        /*Como 'BusinessAccount' herda os comportamentos de 'Account', posso criar um objeto do
          tipo 'BusinessAccount' e ele terá todos os adicionais desta classe, incluindo os comportamentos herdados.
        */
        BusinessAccount account = new BusinessAccount();

    }
}