package GuilhermeOliveiraDesiderio.estoque;

/** 
@author  Guilherme Oliveira Desidério
@since   02.08.2022
*/

public class Fornecedor {

	private int cnpj;
	private String nome;
	
	public Fornecedor(int cnpj, String nome) {
		super();
		this.cnpj = cnpj;
		this.nome = nome;
	}

	public int getCnpj() {
		return cnpj;
	}

	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
