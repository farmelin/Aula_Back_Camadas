package br.com.camadas.implementacao;

import javax.swing.JOptionPane;

import br.com.camadas.bo.CarroBO;
import br.com.camadas.excecao.MinhaExcecao;
import br.com.camadas.lib.Magica;
import br.com.camadas.modelo.Carro;

public class ImplementarCarro {

	/*
	 * MVC:
	 * Model => tudo menos a controller 
	 * View => tela do usu�rio - endpoint
	 * Controller => porta de saida do back end (onde tem o Main() - no standalone)
	 */
		
	public static void main(String[] args) {
		try {
		//CarroDAO dao = new CarroDAO();
		while (JOptionPane.showInputDialog("Digite S").toUpperCase().equals("S")) {
			Carro carro = new Carro();
			carro.setAll(
					Magica.s("Modelo"),
					Magica.f("Valor"),
					Magica.s("Cor"),
					Magica.i("Ano"));
			//dao.gravar(carro);
			CarroBO.novo(carro); // dado que estamos chamando agora o metodo do BO, o metodo anterior n�o � mais necess�rio 
			
		}
	//System.out.println(dao.exibirTudo()); // Dado a mudan�a no m�todo BO, este sysout n�o � mais v�lido
	System.out.println(CarroBO.exibirCarros());
	
	String modelo = JOptionPane.showInputDialog("Digite o modelo").toUpperCase();
	Carro resposta = CarroBO.pesquisarModelo(modelo);
	System.out.println("Resposta: " + resposta.toString());
	
	System.out.println(CarroBO.apagarCarro(modelo));
	System.out.println("Ap�s apagar:\n" + CarroBO.exibirCarros());
	}catch(Exception e) {
		System.out.println(MinhaExcecao.tratar(e));
	}
			

	}

}
