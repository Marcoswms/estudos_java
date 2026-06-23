package application;

import java.io.File;
import java.util.Scanner;

public class ManipularPastascomFile {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a folder path: ");
        String strPath = scan.nextLine();
        File path = new File(strPath);

        //.listFiles - para listar os arquivos
        //File::isDirectory - irá filtrar apenas o que for diretório (expressão lambda)
        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("FOLDERS: ");

        for (File folder : folders) {
            System.out.println(folder);
        }
        System.out.println();
        File[] files = path.listFiles(File::isFile);
        System.out.println("FILES: ");

        for (File file : files) {
            System.out.println(file);
        }
        //Cria uma sub-pasta a partir da pasta que estou apontando
        //File(variável que recebe o caminho do diretório + "nome da nova pasta").mkdir()
        //boolean - irá retornar se o novo diretório foi criado ou não (true/false)
        boolean success = new File(strPath + "\\nova-pasta-teste").mkdir();
        System.out.println("Directory created success: " + success);
        scan.close();
    }
}