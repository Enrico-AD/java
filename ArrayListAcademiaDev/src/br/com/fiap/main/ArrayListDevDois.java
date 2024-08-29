package br.com.fiap.main;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDevDois {
    public static void main(String[] args) {
        // Cria um ArrayList para armazenar Strings, neste caso, nomes de filmes.
        ArrayList<String> filmes = new ArrayList<String>();

        // Adiciona o filme "Avatar" ao ArrayList de filmes.
        filmes.add("Avatar");
        // Exemplo adicional de adição de mais filmes ao ArrayList.
        filmes.add("Motoqueiro Fantasma");
        filmes.add("The Matrix");
        filmes.add("Interstellar");
        filmes.add("Homem aranha");
        filmes.add("Friends");
        filmes.add("Billions");
        filmes.add("Carros");
        filmes.add("ZOrro");



        // Cria um ArrayList para armazenar números inteiros (horas).
        ArrayList<Integer> horas = new ArrayList<Integer>();

        // Adiciona várias horas ao ArrayList de horas. O ArrayList é dinâmico, então ele cresce conforme você adiciona elementos.
        horas.add(3);
        horas.add(15);
        horas.add(17);
        horas.add(1000);
        horas.add(-1);
        horas.add(85);
        horas.add(0);

        // Ordena os valores do ArrayList de horas em ordem crescente.
        Collections.sort(horas);

        // Exemplo de iteração sobre o ArrayList de horas para imprimir os valores ordenados.
        for (int ordem : horas) {
            System.out.println(ordem); // Imprime cada valor do ArrayList na ordem ordenada.
        }


        //Imprime os nomes dos filmes em ordem alfabética
        Collections.sort(filmes);

        // Exemplo de iteração sobre o ArrayList de filmes para imprimir cada filme adicionado.
        for (String filme : filmes) {
            System.out.println(filme); // Imprime o nome de cada filme armazenado no ArrayList.
        }
    }
}
