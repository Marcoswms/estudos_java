package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {
    public static void main(String[] args) {
        /*Listas
            * Apenas dados do mesmo tipo;
            * Ordenada (Elemento acessado por meio de posição);
            * Inicia vazia e seus elementos são alocados sob demanda;
            * Cada elemento ocupa um nó (ou nodo) da lista (nodo é a sequência que a lista percorrerá até algo apontar
              seu término);

        * Tipo (interface): List (Listas são tipo interface e não poderá ser instanciada)
        * No caso acima, 'List' pode ser instanciada com Classes que implementam interfaces: ArrayList, LinkedList, etc.

        * Vantagens:
            * Tamanho variável - (Um Vetor é necessário informar quantas posições possuirá,a Lista não tem essa
              necessidade, ela poderá ser preenchida de acordo com sua necessidade);
            * Facilidade para se realizar inserções e deleções;

        * Desvantagens:
            * Acesso sequencial aos elementos - (Para acessar a posição 10, terá de percorrer da 1ª até a 10ª posição
              porém existe a possibilidade de 'otimizar' esse acesso com o ArrayList (um hibrido entre List e Vetor));

        * Demonstração de alguns comandos:
            * Tamanho da Lista: size();
            * Inserir Elementos: add(obj), add(int, obj);
            * Remover da Lista: remove(obj), remove(int), removeIf(Predicate);
            * Encontrar posição de elemento: indexOf(obj), lastIndexOf(obj);
            * Importar lista : List<TipoDedado> nomeDaColeção; (Lista só aceita Wrapper Class)
            * Filtrar lista com base em predicato:
                List<Interger> result = list.stream().filter(x -> x > 4).collect(Collectors.toList());
            * Encontrar primeira ocorrência com base em Predicato:
                Integer result = list.stream().folter(x -> x > 4).findFirst().orElse(null);
        */
        List<String> lista = new ArrayList<>();

        lista.add("Maria");
        lista.add("Alex");
        lista.add("Bob");
        lista.add("Anna");
        lista.add(2, "Marco");//Adicionando um novo elemento na posição 2 (nºposição, novoDado)

        System.out.println(lista.size());

        for (String list : lista) {
            System.out.println(list);
        }
        System.out.println("--------------------------");
        //lista.remove("Anna");//Remove a partir da comparação de dados.
        //lista.remove(1);//Também pode remover por posição.

        /*Lambda - É uma função anônima que permite escrever código de forma mais concisa e legível.
            Sintaxe: (argumento) -> (corpo).
         */
        lista.removeIf(list -> list.charAt(0) == 'M');//Função Lambida (Predicado - expressão que retorna 'V' ou 'F')
        for (String list : lista) {
            System.out.println(list);
        }
        System.out.println("--------------------------");
        System.out.println("Index of Bob: " + lista.indexOf("Bob"));
        System.out.println("--------------------------");

        //.stream() - É um tipo especial do Java que aceita operações com expressões lambida
        //.filter() - Recebe o Predicado
        //.collect(Collectors.toList) - Converte uma coleção para o tipo List.
        List<String> resultado = lista.stream().filter(list -> list.charAt(0) == 'A').collect(Collectors.toList());
        for (String list : resultado) {
            System.out.println(list);
        }
        //.findFirst() - Pega o primeiro elemento do .stream() e retorna um 'Optional<String>'.
        //.orElse(null) - Caso não existir um primeiro elemento para o findFirst(), orElse retornará 'Nulo'.
        System.out.println("--------------------------");
        String nome = lista.stream().filter(list -> list.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(nome);
    }
}