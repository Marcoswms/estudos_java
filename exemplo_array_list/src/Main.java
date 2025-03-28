import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //String[] nome = new String[3];Dentro dos colchetes define o tamanho do vetor

        //Ou podemos definir seu tamanho já inserindo dados nas posições através do {}.
        String[] nome = new String[]{"José", "Maria", "Pedro"};

        //Forma de acessar um dado de uma posição do vetor:
        String jose = nome[0];

        for (int index = 0; index < nome.length; index++) {
            System.out.println(nome[index]);
        }

        System.out.println();
        System.out.println("************ ArrayList ************");
        System.out.println();

        //Declara o tipo de dado e instanciar a var com ArrayList<>.
        ArrayList<String> nomes = new ArrayList<>();

        /*.add() - É um método já existente da Classe 'ArrayList<>'.
         . addAll() - Adiciona coleções inteiras dentro de uma lista.
         .remove() - Remove um elemento de uma posição específica.
         .clear() -  Remove TODOS os elementos de uma lista */

        nomes.add("Marcos");
        nomes.add("Wesley");
        nomes.add("Lucas");

        /*.size - Tem a mesma função do .length porém para percorrer um ArrayList.
        - Para retornar um resultado dentro de 'for', chamamos o objeto seguido do método get().
        - Sintaxe: objeto.get(posicaoDoDado); */
        for (int index = 0; index < nomes.size(); index++) {
            System.out.println(nomes.get(index));
        }
    }
}