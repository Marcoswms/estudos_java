package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a quantidade de produtos para se cadastrar: ");
        int quantidadeDeElementos = scan.nextInt();
        //Cada posição deste vetor será uma referência para um objeto instanciado.
        Product[] vetor = new Product[quantidadeDeElementos];

        for (int index = 0; index < quantidadeDeElementos; index++) {
            scan.nextLine();
            System.out.println("Digite o nome do produto: ");
            String nome = scan.nextLine();
            System.out.println("Informe um preço: ");
            double preco = scan.nextDouble();
            vetor[index] = new Product(nome, preco);
        }
        double soma = 0.0;
        //.length - Conta a quantidade de elementos dentro do vetor, o mesmo que usar a var 'quantidadeDeElementos'.
        //.length é o mais recomendável, pois não dependerá de uma var. para fornecer o tamanho do vetor.
        for (int index = 0; index < vetor.length; index++) {
            soma += vetor[index].getPreco();
        }
        double media = soma / quantidadeDeElementos;
        System.out.printf("Preço médio: %.2f", media);
        scan.close();
    }
}