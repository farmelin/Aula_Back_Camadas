package br.com.camadas.dao;
/*
 * DAO => Data Access Object é um pattern que segustiona armazenar o CRUD em uma única classe.
 * C Create (insert)
 * R Read (select)
 * U Update (update)
 * D Delete (delete)
 */

import java.util.ArrayList;
import java.util.List;

import br.com.camadas.interfaces.PadraoDAO;
import br.com.camadas.modelo.Carro;

public class CarroDAO implements PadraoDAO<Carro>{
	
	// Static no atritubo : o valor fica valento para todos os objetos que forem instanciados
	private static List<Carro> carros = new ArrayList<Carro>();	
	
	public String deleteCarro(String modelo) {
		for(Carro objeto : carros) {
			if (objeto.getModelo().equals(modelo)) {
				carros.remove(objeto);
				return "Removido com sucesso";
			}
		}
		return "Modelo não encontrado!";
	}
	
	
	
	
	public Carro getCarro(String modelo) {
		for (Carro objeto : carros ) {// utilizando o for each para fazer a pesquisa na lista "carros"
			if (objeto.getModelo().equals(modelo)) {
				return objeto;
			}
		}
		
		return new Carro();
	}
	
	
	public boolean gravar(Carro objeto) {  // faz as funções de Create
		carros.add(objeto);
		return true;
	}
	
	public String exibirTudo () { // faz as funções de Read
		return carros.toString();
	}
	
	
	
	
	
	
	
}
