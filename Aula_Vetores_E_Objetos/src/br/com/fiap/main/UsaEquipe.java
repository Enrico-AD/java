package br.com.fiap.main;

import br.com.fiap.bean.Equipe;

import javax.swing.*;

public class UsaEquipe {
    public static void main(String[] args) {
        Equipe grupo; // Declara uma variável para armazenar um objeto Equipe
        String aux, nome, escolha = "sim"; // Variáveis para armazenar dados temporários
        String[] integrantes; // Array para armazenar os integrantes da equipe
        int qtde; // Variável para armazenar a quantidade de integrantes

        // Loop principal que permite adicionar várias equipes
        while (escolha.equalsIgnoreCase("sim")) {
            try {
                // Solicita o nome da equipe ao usuário
                nome = JOptionPane.showInputDialog("Digite o nome da equipe: ");

                // Solicita a quantidade de integrantes e converte para inteiro
                aux = JOptionPane.showInputDialog("Digite a quantidade de integrantes: ");
                qtde = Integer.parseInt(aux);

                // Inicializa o array de integrantes com a quantidade fornecida
                integrantes = new String[qtde];

                // Preenche o array de integrantes com os nomes fornecidos pelo usuário
                for (int i = 0; i < integrantes.length; i++) {
                    integrantes[i] = JOptionPane.showInputDialog("Integrante " + (i+1));
                }

                // Cria um objeto Equipe com o nome e os integrantes fornecidos
                grupo = new Equipe(nome, integrantes);

                // Chama o método listaEquipe para exibir a equipe
                grupo.listaEquipe();

                // Pergunta ao usuário se deseja continuar e armazena a resposta
                escolha = JOptionPane.showInputDialog("Deseja continuar (sim) (não)");

            } catch (Exception e) {
                // Exibe uma mensagem de erro se ocorrer uma exceção
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }

        // Exibe uma mensagem final ao usuário indicando o fim do programa
        JOptionPane.showMessageDialog(null, "Fim de programa!");
    }
}
