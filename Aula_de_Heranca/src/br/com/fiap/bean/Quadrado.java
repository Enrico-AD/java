package br.com.fiap.bean;

public class Quadrado {
	
	//Atributos
	private float lado;
	//Cnatrutor vazio
	public Quadrado() {
		
	}
	//Constutor com parâmetros
	public Quadrado(float lado) {
		
		this.setLado(lado);
		
	}
	
	//métodos getters e setters
	public float getLado() {
		return lado;
	}
	public void setLado(float lado) {
		this.lado = lado;
	}
	
	//métodos da classe
	
	public float calcularArea() {
		
		return lado*lado;
	}
	

}
