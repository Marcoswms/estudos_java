import java.util.Locale;
import java.util.Scanner;

public class Lanche1038 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        double cachorroQuente = 4.00;
        double xSalada = 4.50;
        double xBacon = 5.00;
        double torradaSimples = 2.00;
        double refrigerante = 1.50;
        double total = 0.0;

        int codigo = scan.nextInt();
        int quantidade = scan.nextInt();

        switch (codigo){
            case 1:
                total = quantidade * cachorroQuente;
                break;
            case 2:
                total = quantidade * xSalada;
                break;
            case 3:
                total = quantidade * xBacon;
                break;
            case 4:
                total = quantidade * torradaSimples;
                break;
            case 5:
                total = quantidade * refrigerante;
                break;
            default:
                break;
        }
        scan.close();
        System.out.printf("Total: R$ %.2f",  total);
    }
}
