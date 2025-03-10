
public class Main {
    public static void main(String[] args) {
        /*Chamar o método 'pedirSorvete'.
         Toda vez que passar como valor uma opção cadastrada no Enum 'SaboresDeSorvete.' ele passará este dado para
         o parâmetro 'sabor' e retornará o print.*/
        pedirSorvete(SaboresDeSorvete.CHOCOLATE);

    }

    //Neste método, adicionamos como Tipo de dado o Enum 'SaboresDeSorvete' referente ao parâmetro 'sabor'
    public static void pedirSorvete(SaboresDeSorvete sabor) {
        System.out.println("Você escolheu o sabor: " + sabor);
    }
}