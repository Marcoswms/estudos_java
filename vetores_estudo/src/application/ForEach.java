package application;

public class ForEach {
    public static void main(String[] args) {
        /*For Each - laço para percorrer coleções:
         *Sintaxe:
            for (TipoDeDado apelido : coleção) {
                <comando 01>
                <comando 02>
            }*/
        String[] vetor = new String[]{"Maria", "Bob", "Alex"};
        // Laço 'For' comum:
        for (int index = 0; index < vetor.length; index++) {
            System.out.println(vetor[index]);
        }
        System.out.println("---------------------");
        // Laço 'For Each leitura - Para cada objeto 'obj' contido na coleção 'vetor', faça:
        for (String obj : vetor) {
            System.out.println(obj);
        }
    }
}