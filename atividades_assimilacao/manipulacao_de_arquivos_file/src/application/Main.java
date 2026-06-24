/* Fazer um programa para ler o caminhode um arquivo .csv contendo os dados de itens vendidos.
   - Cada item possui um nome,preço unitário e quantidade, separados por vírgula.
   - Você deve gerar um novo arquivo chamado "summary.csv", localizado em uma subpasta chamada "out" a partir
      da pasta original do arquivo de origem, contendo apenas o nome e o valor total para aquele item (preço unitário
      multiplicado pela quantidade).

      split(); separar strings ou palavras
 */

package application;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String path = ("C:\\Users\\Marcos\\Documents\\IntelliJ_Projetos\\Exercicios_Java\\atividades_assimilacao\\manipulacao_de_arquivos_file\\src\\files\\produtos.csv");

        try (BufferedReader br = new BufferedReader(new FileReader(path));) {
            System.out.println("Lendo os dados do arquivo: ");
            String leitorDaLinha = br.readLine();

            while (leitorDaLinha != null) {
                System.out.println(leitorDaLinha);
                leitorDaLinha = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}