package br.com.fiap.bean;

public class Retangulo extends Quadrado { //comando <extends> significa Retangulo (é filho de) Quadrado
	
	private float altura;
	
	
	public Retangulo() {}
	
	
	public Retangulo(float lado, float altura) {
		
		super.setLado(lado); //super faz acesso a classe pai
		
		this.altura = altura;
	}


	public float getAltura() {
		return altura;
	}


	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	public float calcularArea() { //overwrited é o triangulo verde, quando o nome do método é igual ao método da classe pai.
		
		return super.getLado()*altura;
	}

}
