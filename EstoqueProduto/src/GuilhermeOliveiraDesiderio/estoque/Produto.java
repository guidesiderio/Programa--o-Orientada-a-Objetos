package GuilhermeOliveiraDesiderio.estoque;

/** 
@author  Guilherme Oliveira Desidério
@since   12.07.2022
*/

/*
 * Classe Produto representa itens que podem estar a venda em um supermercado.
 * Produtos possuem atributos e métodos
 */

public class Produto {
	private int codigo;
	private String descricao;
	private double precoCompra;
	private double precoVenda;
	private int quantidade;
	private int estoqueMinimo;
	private int cnpj;
	private String fornecedor;
	
	public Produto() {
		this.setCodigo(0);
		this.setDescricao(null);
		this.setPrecoCompra(0);
		this.setPrecoVenda(0);
		this.setQuantidade(0);
		this.setEstoqueMinimo(0);
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPrecoCompra() {
		return precoCompra;
	}

	public void setPrecoCompra(double d) {
		this.precoCompra = d;
	}

	public double getPrecoVenda() {
		return precoVenda;
	}

	public void setPrecoVenda(double precoVenda) {
		this.precoVenda = precoVenda;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public int getEstoqueMinimo() {
		return estoqueMinimo;
	}

	public void setEstoqueMinimo(int estoqueMinimo) {
		this.estoqueMinimo = estoqueMinimo;
	}

	public int getCnpj() {
		return cnpj;
	}

	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}

	public String getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}
	
	public void compra(int quant, double val) {
		val = this.getPrecoCompra() * quant;
		this.setQuantidade(this.getQuantidade() + quant);
		this.setPrecoCompra(val / quant);
	}
	
	public double venda(int quant) {
		if(this.getQuantidade() >= quant) {
			this.setQuantidade(this.getQuantidade() - quant);
			return this.getPrecoVenda() * quant;
		}
		else {
			return 0;
		}
	}
}	
