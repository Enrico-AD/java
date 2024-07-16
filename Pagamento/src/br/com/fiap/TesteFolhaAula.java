package br.com.fiap;

public class TesteFolhaAula {

	public static void main(String[] args) {
		
		FolhaDePagamentoEmAula folha = new FolhaDePagamentoEmAula();
		
		folha.salarioBruto = 5000;
		folha.numeroDeDependentes = 2;
		folha.descontoINSS = 10;
		folha.valorPlanoDeSaude = 100;
		
		double 	salarioLiquido = folha.calcularSalarioLiquido();
		
		System.out.println("Seu salário final é: " + salarioLiquido);
		
		
		
		

	}

}
