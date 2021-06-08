package br.com.camadas.bo;

import br.com.camadas.dao.CarroDAO;
import br.com.camadas.modelo.Carro;

public class CarroBO {

	// classes do BO n�o possuem atributos nenhum, apenas m�todos
	// estes metodos s�o criados para serem utilizados pelo Main e chamados pelo front end
	// Normalmente s�o criados com as mesmas caracteristicas dos metodos do DAO mas com nomes diferentes
	

	public static String apagarCarro(String modelo) {
		if(modelo.length()<2) {
			return "Modelo n�o encontrado!";
		}
		return new CarroDAO().deleteCarro(modelo.toUpperCase());
	}
	
	
	
	
	public static Carro pesquisarModelo(String modelo) {
		if(modelo.length()<2) {
			return new Carro();
		}
		return new CarroDAO().getCarro(modelo.toUpperCase());
	}
	
	
	public static String  exibirCarros() {
		return new CarroDAO().exibirTudo();
		//CarroDAO dao = new CarroDAO();
		//return dao.exibirTudo();
		/*
		 * os objetos acima s�o os mesmos, e 
		 */
	}

	
	
	public static boolean novo(Carro objeto) {
		if (objeto.getAno()<1970) {
			return false;
		}
		
		if (objeto.getValor()<=0) {
			return false;
		}
		
		objeto.setModelo(objeto.getModelo().toUpperCase());
		objeto.setCor(objeto.getCor().toUpperCase());
		
		CarroDAO dao = new CarroDAO();
		dao.gravar(objeto);
		return true;
		
	}
	
	
	
	
}
