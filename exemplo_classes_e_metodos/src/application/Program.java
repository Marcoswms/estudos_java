package application;

import entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        //Objeto: São instâncias da classe, receberá os atributos da classe.
        //Instanciando o objeto, neste caso 'x' e 'y'.
        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Insira a medida do triângulo X: ");
        x.a = scan.nextDouble();//Acessando e armazenando valores nos atributos do objeto.
        x.b = scan.nextDouble();
        x.c = scan.nextDouble();
        System.out.println("Insira a medida do triângulo Y: ");
        y.a = scan.nextDouble();//Acessando e armazenando valores nos atributos do objeto.
        y.b = scan.nextDouble();
        y.c = scan.nextDouble();


        double areaX = x.area();//Chamando o método 'area' dentro do objeto 'x'.

        double areaY = y.area();

        System.out.printf("Triangulo X área: %.4f\n", areaX);
        System.out.printf("Triangulo Y área: %.4f\n", areaY);

        if (areaX > areaY) {
            System.out.println("Maior área: X");
        } else {
            System.out.println("Maior área: Y");
        }
        scan.close();
    }
}

