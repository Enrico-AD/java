package br.com.fiap.main;

// Importando a classe ArrayList da biblioteca java.util para poder utilizar listas dinâmicas
import java.util.ArrayList;

public class ArrayListDev {
    public static void main(String[] args) {

        /*
            Abaixo temos um exemplo de um array estático (Array).
            Arrays em Java possuem um tamanho fixo definido no momento da criação.
            Uma vez criado, o tamanho do array não pode ser alterado.

            Exemplo 1: Definindo um array de strings com 5 posições, onde cada posição armazenará um nome de fruta.

         */
            String[] nomes = new String[5];

            // Adicionando elementos ao array, utilizando índices de 0 a 4.
            nomes[0] = "Banana";
            nomes[1] = "Morango";
            nomes[2] = "Melancia";
            nomes[3] = "Abacate";
            nomes[4] = "Uva";

            // Podemos percorrer o array estático usando um loop for.
            // Aqui, iteramos através de cada posição do array, usando o índice para acessar cada elemento.

            for (int i = 0; i < nomes.length; i++) {
                System.out.println("Elemento no índice " + i + ": " + nomes[i]);
            }

            // Alternativamente, podemos inicializar o array diretamente com os valores, sem especificar o tamanho explicitamente.
            //Exemplo 2:
            String[] nomex = new String[] {"Banana", "Morango", "Melancia", "Abacate", "Uva"};

            // Da mesma forma, podemos usar um loop for para percorrer este array.
            for (int i = 0; i < nomex.length; i++) {
                System.out.println("Elemento no índice " + i + ": " + nomex[i]);
            }



        // Agora vamos utilizar um ArrayList, que é uma estrutura de dados dinâmica.
        // Diferente de arrays estáticos, o ArrayList permite adicionar e remover elementos dinamicamente, sem precisar definir um tamanho fixo.
        // Sintaxe: ArrayList<Tipo> nomeVariável = new ArrayList<Tipo>();
        ArrayList<String> nom = new ArrayList<String>();

        // Adicionando elementos ao ArrayList. Cada elemento é adicionado ao final da lista.
        // No caso, estamos adicionando nomes de frutas.
        nom.add("Banana"); // índice 0
        nom.add("Morango"); // índice 1
        nom.add("Melancia"); // índice 2
        nom.add("Abacate"); // índice 3
        nom.add("Uva"); // índice 4

        // Primeiro loop for: Usando um loop for clássico para percorrer o ArrayList.
        // O loop inicia no índice 0 e vai até o último índice da lista (nome.size() - 1).
        // O método .size() retorna o número total de elementos na lista, equivalente ao comprimento do ArrayList.
        for (int indice = 0; indice < nom.size(); indice++) {
            // .get(indice) retorna o elemento na posição especificada.
            // Estamos imprimindo cada elemento da lista usando seu índice.
            System.out.println(nom.get(indice));
        }

        // Segundo loop for: Usando um loop for-each, que é uma forma mais concisa e legível de percorrer coleções como ArrayLists.
        // Neste loop, cada elemento da lista é atribuído à variável "nomis" em cada iteração.
        for (String nomis : nom) {
            // Aqui, estamos imprimindo diretamente o valor de "nomis", que contém o elemento atual do ArrayList.
            System.out.println(nomis);
        }
    }
}
