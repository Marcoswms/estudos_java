package application;

import entities.Conta;
import java.util.Scanner;

public class SistemaLogin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Conta conta = new Conta();
        System.out.println("Cadastre um nome de usuário: ");
        String entradaUsuario = scan.next();
        conta.setUsuario(entradaUsuario);

        System.out.println("Cadastre uma senha: ");
        String entradaSenha = scan.next();
        conta.setSenha(entradaSenha);

        System.out.println("Cadastrado com sucesso! ");
        System.out.println("Nome de usuário: " + conta.getUsuario() + " -- Senha: " + conta.getSenha());

        System.out.println();
        System.out.println("Digite seu nome de usuário para se logar: ");
        entradaUsuario = scan.next();

        System.out.println("Agora digite sua senha: ");
        entradaSenha = scan.next();

        conta.validaDados(entradaUsuario, entradaSenha);
        System.out.println(conta);

        scan.close();
    }
}