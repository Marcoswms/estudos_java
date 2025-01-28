import java.util.Scanner;

/*Escreva um programa que repita a leitura de uma senha até que ela seja válida.
Para cada leitura de senha incorreta informada, escrever a mensagem "Senha Invalida".
Quando a senha for informada corretamente imprimir a mensagem "Acesso Permitido" e o algoritmo encerrado.
Considere que a senha correta é o valor 2002.
*/
public class ex01WhileSenhaCorreta {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int senha = 2002;
        int entradaSenha = scan.nextInt();
        while(entradaSenha != senha){
            System.out.println("Senha Inválida");
            entradaSenha = scan.nextInt();
        }
        System.out.print("Acesso Permitido");
        scan.close();
    }
}