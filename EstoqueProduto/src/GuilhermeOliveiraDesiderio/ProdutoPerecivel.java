package GuilhermeOliveiraDesiderio;

import java.util.Date;

public class ProdutoPerecivel extends Produto {
	
	private Date validade;

	public ProdutoPerecivel(int codigo, String descricao, int estoqueMinimo, double lucro, Fornecedor nome,
			Date validade) {
		super(codigo, descricao, estoqueMinimo, lucro, nome);
		this.validade = validade;
	}

	public Date getValidade() {
		return validade;
	}

	public void setValidade(Date validade) {
		this.validade = validade;
	}
	
	public double venda(int quant) {
		if(estaVencido()) {
			return -1;
		}
		else {
			return super.venda(quant);
		}
	}
	
	public boolean estaVencido() {
		Date now = new Date();
		if(this.getValidade().before(now)) {
			return true;
		}
		return false;
	}
}