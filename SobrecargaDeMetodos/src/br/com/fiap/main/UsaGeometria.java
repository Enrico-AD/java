package br.com.fiap.main;

import br.com.fiap.bean.Geometria;

import javax.swing.*;

public class UsaGeometria {
    public static void main(String[] args) {

        Geometria geo1 = new Geometria();
        String aux, escolha = "sim";
        int area;

        while (escolha.equalsIgnoreCase("sim")) {

            try {

                aux = JOptionPane.showInputDialog("""
                        Qual área deseja calcular?
                        1. Quadrado
                        2. Retângulo
                        3. Círculo""");
                area = Integer.parseInt(aux);

                switch (area) {

                    case 1:
                        aux = JOptionPane.showInputDialog("Digite o valor do lado: ");
                        float lado1 = Float.parseFloat(aux);
                        geo1.calculaArea(lado1);
                        break;

                    case 2:
                        aux = JOptionPane.showInputDialog("Digite o valor do lado: ");
                        float lado2 = Float.parseFloat(aux);
                        aux = JOptionPane.showInputDialog("Digite o valor da altura: ");
                        float altura = Float.parseFloat(aux);
                        geo1.calculaArea(lado2, altura);
                        break;

                    case 3:
                        aux = JOptionPane.showInputDialog("Digite o valor do raio: ");
                        double raio = Double.parseDouble(aux);
                        geo1.calculaArea(raio);
                        break;

                    default:
                        throw new Exception("Escolha inválida");


                }

                escolha = JOptionPane.showInputDialog("Deseja continuar? ('sim' ou 'não')");


            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro " + e.getMessage());

            }


        }

        JOptionPane.showMessageDialog(null, "Fim :)");


    }
}
