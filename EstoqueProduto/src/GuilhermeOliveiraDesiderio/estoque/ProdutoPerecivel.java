package GuilhermeOliveiraDesiderio.estoque;

/** 
@author  Guilherme Oliveira Desidério
@since   02.08.2022
*/

import java.util.ArrayList;
import java.util.Date;

public class ProdutoPerecivel extends Produto {
	
	private Date valor;

	public Date getValor() {
		return valor;
	}

	public void setValor(Date valor) {
		this.valor = valor;
	}

	public ProdutoPerecivel(int codigo, String descricao, int estoqueMinimo, double lucro, Fornecedor nome, Date valor) {
		super(codigo, descricao, estoqueMinimo, lucro, nome);
		this.valor = valor;
	}
	
	ArrayList<Produto> array = new ArrayList<>();
	public double vender(int cod, int quant) {
			for(Produto produto: array) {
				 if(produto.getCodigo() == cod) {
					 return produto.venda(quant);
				 }
			}
		return -1;
	}
}