package br.com.fiap.main;

import br.com.fiap.bean.Quadrado;
import br.com.fiap.bean.Retangulo;
import br.com.fiap.bean.Triangulo;

import javax.swing.*;

public class CalculaArea {

    public static void main(String[] args) {

        String aux = " ", escolha = "sair";
        float area, lado, altura;
        int opcao;

        while (escolha.equalsIgnoreCase("sair")) {

            try {
                aux = JOptionPane.showInputDialog("""
                        Qual área deseja calcular?
                        1. Quadrado
                        2. Retangulo
                        3. Triangulo
                        4. Sair""");

                opcao = Integer.parseInt(aux);

                if (opcao == 4){
                    break;
                }

                switch (opcao) {

                    case 1:
                        aux = JOptionPane.showInputDialog("Digite o lado do Quadrado: ");
                        lado = Integer.parseInt(aux);

                        Quadrado quadrado = new Quadrado(lado);

                        area = quadrado.calcularArea();

                        JOptionPane.showMessageDialog(null, "A área do quadrado é: " + area);
                        break;

                    case 2:

                        aux = JOptionPane.showInputDialog("Digite o lado do retângulo: ");
                        lado = Float.parseFloat(aux);
                        aux = JOptionPane.showInputDialog("Digite a altura do retângulo: ");
                        altura = Float.parseFloat(aux);

                        Retangulo retangulo = new Retangulo(lado, altura);

                        area = retangulo.calcularArea();

                        JOptionPane.showMessageDialog(null, "A área do retângulo é: " + area);
                        break;
                    case 3:

                        aux = JOptionPane.showInputDialog("Digite a altura do Triângulo: ");
                        altura = Float.parseFloat(aux);
                        aux = JOptionPane.showInputDialog("Digite o lado do triângulo: ");
                        lado = Float.parseFloat(aux);

                        Triangulo triangulo = new Triangulo(lado, altura);
                        area = triangulo.calcularArea();

                        JOptionPane.showMessageDialog(null, "A área do triângulo é: " + area);
                        break;

                    default:
                        throw new Exception("Escolha incorreta");


                }

            } catch (Exception e) {

                JOptionPane.showMessageDialog(null, e.getMessage());

            }


        }

        JOptionPane.showMessageDialog(null, "Fim do programa :)");


    }
}
