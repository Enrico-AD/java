package br.com.fiap;

public class FolhaDePagamento {

	public double salarioBruto;
	public int numeroDeDependentes; //não podemos atribuir valores na classe java bin. ARRUMAR
	public double descontoINSS;
	public double valorPlanoDeSaude;
	
	
	public double calcularSalarioLiquido() {
		
		Double desconto1, desconto2, salarioLiquido;
		
		desconto1 = salarioBruto*(descontoINSS/100);
		desconto2 = valorPlanoDeSaude * (numeroDeDependentes + 1);
		salarioLiquido = salarioBruto - (desconto1 + desconto2);
		
		
		
		return salarioLiquido;
		
		
	}
	
	
	
}
