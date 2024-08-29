package br.com.fiap.bean;

import javax.swing.*;

public class Equipe {

    // Atributos da classe
    private String nome; // Nome da equipe
    private String[] integrantes; // Lista de integrantes da equipe

    // Construtor Vazio
    // Cria um objeto Equipe sem definir os atributos iniciais
    public Equipe() {
    }

    // Construtor com passagens de parâmetros
    // Inicializa a equipe com um nome e uma lista de integrantes
    public Equipe(String nome, String[] integrantes) {
        this.nome = nome;
        this.integrantes = integrantes;
    }

    // Getter para o nome da equipe
    public String getNome() {
        return nome;
    }

    // Setter para o nome da equipe
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter para a lista de integrantes
    public String[] getIntegrantes() {
        return integrantes;
    }

    // Setter para a lista de integrantes
    public void setIntegrantes(String[] integrantes) {
        this.integrantes = integrantes;
    }

    // Método para listar os membros da equipe
    public void listaEquipe() {
        String exibe = "Nome da equipe: " + nome + "\n"; // Inicializa a string com o nome da equipe
        int cont = 1; // Contador para numerar os integrantes

        // Itera sobre a lista de integrantes
        for (String i : integrantes) {
            exibe += "Integrante " + cont + ": " + i + "\n"; // Adiciona cada integrante à string
            cont++; // Incrementa o contador
        }

        // Exibe a lista de integrantes em uma caixa de diálogo
        JOptionPane.showMessageDialog(null, exibe);
    }
}
