package application;

import java.util.InputMismatchException;
import java.util.Scanner;

/*Erros que não podem ser tratados:
* Error - OutOfMemoryError - Quando "estoura" a memória.
* Error - VirtualMachineError - Erro direto na máquina virtual do Java.

* Erros que podem ser tratados:
* Exceptions:
* IOException: Erro de entrada e saída de dados
* RuntimeException - Exceções em que seu progama não terá a obrigatoriedade de tratá-las, ex:
* IndexOutOfBoundsException: Quando tentamos acessar uma posição de um Array que não existe.
* NullPointerException: Quando tentamos acessar uma variável que está valendo "Nulo".

* Vantagens de se tratar uma Exceção:

* Exemplo: Sacar um valor em uma conta bancária será permitido apenas se a conta possuir um valor igual ou acima do
 valor do saque e se a conta não estiver com saldo negativo.

 * Em caso de saque fora dessas condições será lançado uma Exception;
 * Essa Exception terá de ser tratada pela classe "Conta" e não pelo Programa principal;
 * Trata de forma organizada e hierarquica Exceptions de tipos diferentes

* Estrutura try-catch
 * try - contém o código a ser executado caso uma exceção ocorra
 * catch - contém o código a ser executado caso uma exceção ocorra
 * deve ser especificado o tipo da exceção a ser tratada(upcasting é permitido)

 * PS: .split() - Método para dividir uma string em cada array de acordo com a condição dentro do parenteses
  * Dentro do parenteses:
   * Com espaço ou outro separador, o padrão será separar assim que atingir essa condição.
   * Sem o espaço, cada letra será armazenada em um array, pois não há um padrão

 * Ex: String frase = "Java é muito bom";
 *     String[] vetor = frase.split(" ");
 *     O resultado será: [[0]"Java" [1]"é" [2]"muito" [3]"bom"] */
public class Main {
    public static void main(String[] args) {
        method1();
    }

    public static void method1() {
        System.out.println("*****Method1 Start*****");
        method2();
        System.out.println("Fim do Programa!");
    }


    public static void method2() {
        Scanner scan = new Scanner(System.in);
        System.out.println("*****Method2 Start*****");

        try {
            System.out.println("Insira uma frase:");
            String[] vetor = scan.nextLine().split(" ");

            System.out.println("Insira a posição para ser impressa:");
            int posicao = scan.nextInt();

            System.out.println(vetor[posicao]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Posição inválida!");
            e.printStackTrace();//Mostrará no terminal onde ocorreu a exception, a chamada de métodos e linhas
        } catch (InputMismatchException e) {
            System.out.println("Apenas números!");
        } finally {
            System.out.println("Finally executa independente do 'catch'");
            scan.close();
        }
    }
}