package br.com.camadas.interfaces;

public interface PadraoDAO<T> { // Entre os sinais de "<>" poderia ser qualquer texto, mas o mais comum é "T"

	public boolean gravar (T objeto);
	public String exibirTudo();
	
}
