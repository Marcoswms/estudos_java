import java.util.Scanner;

public class becrowdIfElse1049 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String tipo01 = scanner.next();
        String tipo02 = scanner.next();
        String tipo03 = scanner.next();

        String animal = "";

        if (tipo01.equals("vertebrado")) {
            if (tipo02.equals("ave")) {
                if (tipo03.equals("carnivoro")) {
                    animal = "aguia";
                } else if (tipo03.equals("onivoro")) {
                    animal = "pomba";
                }
            } else if (tipo02.equals("mamifero")) {
                if (tipo03.equals("onivoro")) {
                    animal = "homem";
                } else if (tipo03.equals("herbivoro")) {
                    animal = "vaca";
                }
            }
        } else if (tipo01.equals("invertebrado")) {
            if (tipo02.equals("inseto")) {
                if (tipo03.equals("hematofago")) {
                    animal = "pulga";
                } else if (tipo03.equals("herbivoro")) {
                    animal = "lagarta";
                }
            } else if (tipo02.equals("anelideo")) {
                if (tipo03.equals("hematofago")) {
                    animal = "sanguessuga";
                } else if (tipo03.equals("onivoro")) {
                    animal = "minhoca";
                }
            }
        }
        System.out.println(animal);
        scanner.close();
    }
}