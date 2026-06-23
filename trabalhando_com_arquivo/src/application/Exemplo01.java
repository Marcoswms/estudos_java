package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


//FileReader - é um stream(sequencia) de leitura de caracteres a partir de um arquivo
//BufferedReader - é instanciado a partir do FileReader e implementa otimizações utilizando buffer de memória, tem a leitura mais rápida
public class Exemplo01 {
    public static void main(String[] args) {

        String path = "C:\\Users\\Marcos\\Documents\\IntelliJ_Projetos\\Exercicios_Java\\trabalhando_com_arquivo\\src\\files\\test.txt";
        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader(path);
            br = new BufferedReader(fr);

            String line = br.readLine();

            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            try {
                if (br != null) {
                    fr.close();
                }
                if (fr != null) {
                    fr.close();
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
