import java.util.Scanner;

public class switchCaseEx01DiaDaSemana {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numeroDoDia = scan.nextInt();
        String diaDaSemana;

        switch (numeroDoDia) {
            case 1:
                diaDaSemana = "Domingo";
                break;
            case 2:
                diaDaSemana = "Segunda";
                break;
            case 3:
                diaDaSemana = "Terça";
                break;
            case 4:
                diaDaSemana = "Quarta";
                break;
            case 5:
                diaDaSemana = "Quinta";
                break;
            case 6:
                diaDaSemana = "Sexta";
                break;
            case 7:
                diaDaSemana = "Sábado";
                break;
            default:
                diaDaSemana = "Valor Inválido!";
        }
        System.out.println("Dia da Semana: " + diaDaSemana);
    }
}