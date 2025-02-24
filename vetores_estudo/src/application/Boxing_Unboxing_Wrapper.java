package application;

public class Boxing_Unboxing_Wrapper {
    public static void main(String[] args) {
        //Tipo Primitivo: tipo de dado contido em uma variável;

        //Boxing - É o proceso de conversão de um Objeto tipo Valor para um Objeto tipo Referência compativel
        int x = 20; //var ficará armazenada no modelo Stack (Tipo Valor)
        Object objeto = x;//A var 'objeto' apontará para um objeto contendo o valor 20 no modelo Heap (Tipo Referência)
        System.out.println(objeto);

        //Unboxing - É o processo de conversão de um Objeto tipo Referência para um Objeto tipo Valor compatível
        int y = (int) objeto;/*O Objeto que contêm o valor 20 será convertido para a var.'y' e será tipo Valor
        (compatível), armazenado no modelo stack */
        System.out.println(y);

        System.out.println("Explicando sobre Wrapper Class:");
        /*Wrapper Classes
        * Trata Tipos Primitivos como Classes;
        * Boxing e Unboxing é natural na linguagem;
        * Uso comum: Campos de entidades em sistemas de informação, pois tipos Referência (Classes) aceitam valor 'null'
          e usufruem dos recursos O.O*/

        /*Para cada Tipo Primitivo existe um tipo classe compatível: (Wrapper Class)
         * Object é a classe 'Mãe' de todas a classes no Java;
         * Classes para tipo primitivo: Number, Boolean e Character;
         * Tipo Number possui subclasses: Byte, Short, Integer, Long, Float e Double


         *Em um Objeto, o tipo de seu atributo será uma Wrapper Class, pois ele naturalmente aceita o valor 'nulo' caso
          tenha a necessidade de um atributo não conter nenhum valor (Tipo primitivo não aceita valor nulo);
         *Exemplo: Quando uma data de nascimento não é obrigatória, utilizar uma Wrapper Class em seu atributo;*/

        int z = 30;
        Integer object = z;//'object' declarado com a classe de acordo com seu tipo primitivo;
        System.out.println(object);

        int v = object;/*'object' foi declarado como Integer, não tem a necessidade de usar casting (Casting converte
        tipos de dados, exemplo: int para double ou o oposto)*/
        System.out.println(v);
    }
}
