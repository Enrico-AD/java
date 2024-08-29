package br.com.fiap.bean;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;

public class Equipe {

    //Atributos da classe

    private String nome;
    private ArrayList<String> integrantes;

    //Construtor sem parâmetros

    public Equipe() {
    }

    //Construtor com parâmetros

    public Equipe(String nome, ArrayList<String> integrantes) {
        this.nome = nome;
        this.integrantes = integrantes;
    }

    //Getters e setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<String> getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(ArrayList<String> integrantes) {
        this.integrantes = integrantes;
    }

    public void listaEquipe(){
        String exibe = "Nome da equipe " + nome + "\n";
        Collections.sort(integrantes);
        int cont = 1;
        for (String i : integrantes){
            exibe += "Integrante " + cont + ": " + i + "\n";
            cont++;
        }
        JOptionPane.showMessageDialog(null, exibe);
    }
}
