import java.util.Scanner;

/*
Escreva um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.
Gasolina 3.Diesel 4.Fim).
Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
que seja válido). O programa será encerrado quando o código informado for o número 4.
Deve ser escrito a mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível.
*/
public class ex03WhiledadosDoPosto {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int tipoAlcool = 0;
        int tipoGasolina = 0;
        int tipoDiesel = 0;
        int iniciaPrograma = 0;
        int ENCERRAPROGRAMA = 4;

        while (iniciaPrograma != ENCERRAPROGRAMA) {
            System.out.printf("%nInforme um comando numérico da lista abaixo:%n1 - Álcool / 2 - Gasolina / 3 - Diesel / 4 - Fim%nSua escolha:  ");
            int entradaDoComando = scan.nextInt();
            switch (entradaDoComando) {
                case 1:
                    tipoAlcool += 1;
                    break;
                case 2:
                    tipoGasolina += 1;
                    break;
                case 3:
                    tipoDiesel += 1;
                    break;
                case 4:
                    iniciaPrograma = ENCERRAPROGRAMA;
                default:
                    System.out.printf("Valor inválido, digite novamente!%n");
                    break;
            }
        }
        System.out.printf("%nMuito Obrigado%nÁlcool: %d%nGasolina: %d%nDiesel: %d", tipoAlcool, tipoGasolina, tipoDiesel);
        scan.close();
    }
}