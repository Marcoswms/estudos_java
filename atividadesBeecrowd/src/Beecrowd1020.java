import java.util.Scanner;

/*Leia um valor inteiro correspondente à idade de uma pessoa em dias e informe-a em anos, meses e dias.
  Obs: Apenas para facilitar o cálculo, considere o ano com 365 dias e o mês com 30 dias.
  Nos casos de teste nunca haverá uma situação que permite 12 meses e alguns dias, como 360, 363 ou 364.
  Este é apenas um exercício com objetivo de testar raciocínio matemático simples.

 *Entrada
  O arquivo de entrada contém um valor inteiro.

 *Saída
  Imprima a saída conforme exemplo fornecido.*/

public class Beecrowd1020 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int entradaEmDias = scan.nextInt();
        scan.close();

        int ano = entradaEmDias / 365;
        int resto = entradaEmDias % 365;
        int mes = resto / 30;
        int dia = resto % 30;

        System.out.println(
                ano + " ano(s)\n" +
                        mes + " mes(es)\n" +
                        dia + " dia(s)");
    }
}