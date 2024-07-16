package br.com.fiap;

public class FolhaDePagamentoEmAula {
	
	
	public double salarioBruto = 5000;
	public int numeroDeDependentes = 3;
	public double descontoINSS = 0.1;
	public double valorPlanoDeSaude = 100;
	
	
	public double calcularSalarioLiquido() {
		
		double desconto1, desconto2, salLiquido;
		desconto1 = salarioBruto*(descontoINSS/100);
		desconto2 = valorPlanoDeSaude * (numeroDeDependentes + 1);
		salLiquido = salarioBruto - (desconto1 + desconto2);
		
		
		
		return salLiquido;
		
		
	}
	
	
	
	

}
