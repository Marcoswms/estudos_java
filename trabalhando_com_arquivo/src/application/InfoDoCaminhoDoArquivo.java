package application;

import java.io.File;
import java.util.Scanner;

public class InfoDoCaminhoDoArquivo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a file path: ");
        String strPath = scan.nextLine();

        File path = new File(strPath);
        //.getName() - Pega somente o nome do arquivo ou do diretório, descartando o caminho
        System.out.println("getName: " + path.getName());
        //.getParent() - Pega somente o caminho, descartando o arquivo ou diretório
        System.out.println("getParent: " + path.getParent());
        //.getPath() - Pega o caminho completo, incluindo o arquivo
        System.out.println("getPath: " + path.getPath());

        scan.close();
    }
}
