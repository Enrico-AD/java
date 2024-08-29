package br.com.fiap.main;

import javax.swing.*;
import java.io.File;

public class ListaDiretorio {

    public static void main(String[] args) {

        // Laço de repetição que permite continuar listando diretórios até que o usuário escolha sair
        do {
            try {
                // Solicita ao usuário que digite o caminho do diretório
                String path = JOptionPane.showInputDialog("Digite o caminho da pasta (utilize / entre as pastas): ");
                File dir = new File(path);

                // Verifica se o caminho informado é um diretório
                if (dir.isDirectory()) {
                    // Exibe o caminho da pasta
                    System.out.println("Conteúdo da pasta: " + path);
                    // Lista os arquivos e diretórios dentro do diretório
                    String[] lista = dir.list();
                    if (lista != null) {
                        // Itera sobre os itens e os exibe
                        for (String item : lista) {
                            System.out.println(item);
                        }
                    }
                } else {
                    // Mensagem de erro caso o caminho informado não seja um diretório
                    System.out.println("Caminho informado incorreto");
                }

            } catch (Exception e) {
                // Captura e exibe qualquer exceção que ocorra durante a execução
                System.out.println(e.getMessage());

            }

            // Pergunta ao usuário se deseja continuar, e o loop continua se a resposta for "Sim"
        } while (JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);
    }
}
