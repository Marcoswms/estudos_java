/* Fazer um programa para ler o caminhode um arquivo .csv contendo os dados de itens vendidos.
   - Cada item possui um nome,preço unitário e quantidade, separados por vírgula.
   - Você deve gerar um novo arquivo chamado "summary.csv", localizado em uma subpasta chamada "out" a partir
da pasta original do arquivo de origem, contendo apenas o nome e o valor total para aquele item (preço unitário
multiplicado pela quantidade).

 * Dica: split() - separar strings ou palavras */
package application;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o caminho do arquivo: ");
        String caminho = scan.nextLine();

        File diretorio = new File(caminho);
        String pegaDiretorios = diretorio.getParent();

        boolean sucesso = new File(pegaDiretorios + "\\out").mkdir();
        if (sucesso != true) {
            System.out.println("Não foi possível criar um novo diretório.");
            System.exit(0);
        }
        diretorio = new File(pegaDiretorios + "\\out");
        System.out.println("Diretório 'out' criado com sucesso.");

        try (BufferedReader br = new BufferedReader(new FileReader(caminho));) {
            String linha = br.readLine();

            while (linha != null) {
                String[] guardaDados = linha.split(",");
                String pegaProduto = guardaDados[0];
                double pegaPreco = Double.parseDouble(guardaDados[1]);
                int pegaQuantidade = Integer.parseInt(guardaDados[2]);
                double totalPreco = pegaQuantidade * pegaPreco;
                String[] pegaProdTotal = new String[]{pegaProduto + "," + Double.toString(totalPreco)};

                try (BufferedWriter bw = new BufferedWriter(new FileWriter(diretorio + "\\summary.csv", true))) {
                    bw.write(Arrays.toString(pegaProdTotal));
                    bw.newLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                linha = br.readLine();
            }
            System.out.println("Arquivo 'summary.csv' criado com sucesso.");
            scan.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}