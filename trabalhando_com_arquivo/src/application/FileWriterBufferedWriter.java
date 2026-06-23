/* FileWriter - é uma stream(sequência) para escrita de caracteres em arquivos onde podemos:
    - Criar/recriar um arquivo: new FileWriter(path) - se o arquivo já existir, será zerado.
    - Acrescentar o que você escrever a um arquivo já existente: new FileWriter(path, true)

 * BufferedReader - é instanciado a partir do FileWriter e implementa otimizações utilizando buffer de memória.*/
package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterBufferedWriter {
    public static void main(String[] args) {

        String[] lines = new String[]{"Bom mês !", "Bom semestre !", "Bom ano !"};
        String path = "C:\\Users\\Marcos\\Documents\\IntelliJ_Projetos\\Exercicios_Java\\trabalhando_com_arquivo\\src\\files\\create-text.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            for (String line : lines) {
                bw.write(line);
                bw.newLine();//Para adicionar a quebra de linha
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
