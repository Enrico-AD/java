package br.com.fiap.main;

import br.com.fiap.bean.Circulo;
import br.com.fiap.bean.Quadrado;

public class UsaGeometria {
    public static void main(String[] args) {

        Circulo circulo = new Circulo(2);
        System.out.println(circulo.calcularArea());

        Quadrado quadrado = new Quadrado(5);
        System.out.println(quadrado.calcularArea());
    }
}
