package br.com.camadas.excecao;

public class MinhaExcecao extends Exception{

	public static String tratar(Exception e) { // por ser um m�todo est�tico "Public static", desobriga instanciar a classe no momento da chamanda, ou seja, n�o � necess�rio escrever "Exception exception = new Exception".
		
		if (e instanceof NullPointerException) {
			return "H� um objeto Nulo !!";
		}else if (e instanceof NumberFormatException) {
			return "N�mero inv�lido";
		}else if (e instanceof ArrayIndexOutOfBoundsException) {
			return "Vetor estourou";
		}else {
			e.printStackTrace();
			return "Exce��o n�o conhecida";
		}
		
	}
	
	
	
	
}
