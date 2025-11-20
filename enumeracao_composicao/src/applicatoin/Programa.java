package applicatoin;

import entities.Pedido;
import entities.enums.StatusDeOrdem;

import java.util.Date;

public class Programa {

    public static void main(String[] args) {

        Pedido pedido = new Pedido(1080, new Date(), StatusDeOrdem.PAGAMENTO_PENDENTE);

        System.out.println(pedido);

        // CONVERSÃO DE STRING PARA ENUM

        StatusDeOrdem so1 = StatusDeOrdem.ENTREGUE;
        System.out.println(so1);

        /* valueOf - Converterá o dado recebido em formato 'String' para o formato 'Enum'
           Muito utilizado quando o usuário preencher algum formulário e o dado precisar retornar um 'Enum'
         */
        StatusDeOrdem so2 = StatusDeOrdem.valueOf("ENTREGUE");
        System.out.println(so2);
    }
}
