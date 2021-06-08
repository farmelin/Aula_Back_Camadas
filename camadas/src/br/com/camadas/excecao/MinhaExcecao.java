package br.com.camadas.excecao;

public class MinhaExcecao extends Exception{

	public static String tratar(Exception e) { // por ser um método estático "Public static", desobriga instanciar a classe no momento da chamanda, ou seja, não é necessário escrever "Exception exception = new Exception".
		
		if (e instanceof NullPointerException) {
			return "Há um objeto Nulo !!";
		}else if (e instanceof NumberFormatException) {
			return "Número inválido";
		}else if (e instanceof ArrayIndexOutOfBoundsException) {
			return "Vetor estourou";
		}else {
			e.printStackTrace();
			return "Exceção não conhecida";
		}
		
	}
	
	
	
	
}
