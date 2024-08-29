package br.com.fiap.main;

import java.io.File;

public class ExcluiDiretorio {
    public static void main(String[] args) {

        try {
            // Cria um objeto File para representar o diretório "c:/loja"
            File dir = new File("c:/loja");
            String msg = " ";

            // Verifica se o caminho é um diretório
            if (dir.isDirectory()) {
                // Tenta excluir o diretório
                if (dir.delete()) {
                    msg = dir.getName() + " excluído com sucesso";
                } else {
                    // Se não conseguiu excluir, tenta excluir os arquivos e subdiretórios dentro dele
                    if (excluirFilhos(dir)) {
                        msg = "Diretório excluído com sucesso";
                    } else {
                        msg = "Falha ao excluir pasta " + dir.getName();
                    }
                }

                // Exibe a mensagem final
                System.out.println(msg);

            }

        } catch (Exception e) {
            // Captura e exibe qualquer exceção que ocorra durante a execução
            System.out.println(e.getMessage());

        }
    }

    // Método para excluir todos os arquivos e subdiretórios dentro de um diretório
    private static boolean excluirFilhos(File dir) {
        // Verifica se o arquivo é um diretório
        if (dir.isDirectory()) {
            // Lista todos os arquivos e subdiretórios
            String[] arquivos = dir.list();
            for (String item : arquivos) {
                // Recursivamente exclui cada item dentro do diretório
                boolean sucesso = excluirFilhos(new File(dir, item));
                if (sucesso) {
                    System.out.println("Excluído: " + item);
                } else {
                    System.out.println("Incapaz de excluir: " + item);
                    return false;
                }
            }
        }
        // Tenta excluir o próprio diretório após todos os seus filhos serem excluídos
        return dir.delete();
    }
}
