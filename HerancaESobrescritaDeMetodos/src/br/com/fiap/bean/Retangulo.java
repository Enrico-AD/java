package br.com.fiap.bean;

public class Retangulo extends Quadrado{

    private float altura;

    public Retangulo() {
    }

    public Retangulo(float lado, float altura) {
        super.setLado(lado);
        this.altura = altura;

    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float calcularArea(){
        float area = super.getLado() * altura;

        return area;
    }
}
