package br.com.fiap.main;

import java.io.File;

public class CriaDiretorio {
    public static void main(String[] args) {
        try {
            // Cria um objeto File para representar o diretório "c:/loja"
            File dir = new File("c:/loja");

            // Verifica se o diretório "c:/loja" não existe
            if (!dir.exists()) {
                // Cria o diretório "c:/loja"
                dir.mkdir();
            }

            // Cria um objeto File para representar o diretório "c:/loja/site"
            dir = new File("c:/loja/site");

            // Verifica se o diretório "c:/loja/site" não existe
            if (!dir.exists()) {
                // Cria o diretório "c:/loja/site"
                dir.mkdir();
            }

            // Cria um objeto File para representar o diretório "c:/loja/site/imagens"
            dir = new File("c:/loja/site/imagens");

            // Verifica se o diretório "c:/loja/site/imagens" não existe
            if (!dir.exists()) {
                // Cria o diretório "c:/loja/site/imagens"
                dir.mkdir();
            }

            // Cria um objeto File para representar o diretório "c:/loja/site/videos"
            dir = new File("c:/loja/site/videos");

            // Verifica se o diretório "c:/loja/site/videos" não existe
            if (!dir.exists()) {
                // Cria o diretório "c:/loja/site/videos"
                dir.mkdir();
            }

            // Cria um objeto File para representar o diretório "c:/loja/site/sons"
            dir = new File("c:/loja/site/sons");

            // Verifica se o diretório "c:/loja/site/sons" não existe
            if (!dir.exists()) {
                // Cria o diretório "c:/loja/site/sons"
                dir.mkdir();
            }

            // Mensagem de sucesso indicando que todos os diretórios foram criados
            System.out.println("Pasta Criada com Sucesso!");

        } catch (Exception e) {
            // Captura e exibe qualquer exceção que ocorra durante a execução
            System.out.println(e.getMessage());
        }
    }
}
