package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        double xA, xB, xC, yA, yB, yC;

        System.out.println("Insira a medida do triângulo X: ");
        xA = scan.nextDouble();
        xB = scan.nextDouble();
        xC = scan.nextDouble();
        System.out.println("Insira a medida do triângulo Y: ");
        yA = scan.nextDouble();
        yB = scan.nextDouble();
        yC = scan.nextDouble();

        double p = (xA + xB + xC) / 2.0;
        double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));

        p = (yA + yB + yC) / 2.0;
        double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));

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

