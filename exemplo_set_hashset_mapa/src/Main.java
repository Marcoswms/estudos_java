/*
 * Sets - Conjuntos que não podem ter elementos iguais.
 * HashSet - Lista que não pode ter elementos iguais.

 * HashMap - Lista de elementos que guarde 'chave(única) e 'valor'.
 - Sintaxe: HashMap<TipoChave, Valor> nomeLista = new HashMap<>();
 - .put(chave , valor) - adiciona itens dentro de uma lista HashMap */

import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        HashSet<String> listaDeCompras = new HashSet<>();
        listaDeCompras.add("laranja");
        listaDeCompras.add("Banana");
        listaDeCompras.add("Massa");
        listaDeCompras.add("Banana");

        //Print 'Banana' uma unica vez.
        System.out.println(listaDeCompras);

        System.out.println();
        System.out.println("************* HashMap *************");
        System.out.println();

        HashMap<String, Integer> novaLista = new HashMap<>();
        novaLista.put("Laranja", 5);
        novaLista.put("Banana", 3);
        novaLista.put("Massa", 1);
        novaLista.put("Molho de Tomate", 2);
        novaLista.put("Laranja", 4);//Printa essa 'laranja', pois o map pega a ultima vez que adicionamos a mesma chave.

        System.out.println(novaLista);
        
    }
}