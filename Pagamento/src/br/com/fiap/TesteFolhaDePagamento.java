package br.com.fiap;

public class TesteFolhaDePagamento {

	public static void main(String[] args) {
		
		FolhaDePagamento salario = new FolhaDePagamento();
		
		
		salario.descontoINSS = 10;
		salario.numeroDeDependentes = 2;
		salario.salarioBruto = 5000;
		salario.valorPlanoDeSaude = 100;
		
		double salarioLiquido = salario.calcularSalarioLiquido();
		
		
		
		System.out.println("O salário liquido é: " + salarioLiquido);
	}

}
