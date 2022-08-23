package GuilhermeOliveiraDesiderio;

public class Produto {

	private int codigo;
	private String descricao;
	private double precoDeCompra;
	private double precoDeVenda;
	private double lucro;
	private int quantidade;
	private int estoqueMinimo;
	private Fornecedor nome;

	public Produto(int codigo, String descricao, int estoqueMinimo, double lucro, Fornecedor nome) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.lucro = lucro;
		this.estoqueMinimo = estoqueMinimo;
		this.nome = nome;
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

	public double getPrecoDeCompra() {
		return precoDeCompra;
	}

	public void setPrecoDeCompra(double d) {
		this.precoDeCompra = d;
	}

	public double getPrecoDeVenda() {
		return precoDeVenda;
	}

	public void setPrecoDeVenda(double precoDeVenda) {
		this.precoDeVenda = precoDeVenda;
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

	public double getLucro() {
		return lucro;
	}

	public void setLucro(double lucro) {
		this.lucro = lucro;
	}

	public Fornecedor getNome() {
		return nome;
	}

	public void setNome(Fornecedor nome) {
		this.nome = nome;
	}

	public void compra(int quant, double val) {
		this.setPrecoDeCompra(
				(this.getQuantidade() * this.getPrecoDeCompra() + quant * val) / (this.getQuantidade() + quant));
		this.setQuantidade(this.getQuantidade() + quant);

		this.setPrecoDeVenda(this.getPrecoDeCompra() * (this.getLucro() + 1));

	}

	public double venda(int quant) {
		if (this.getQuantidade() < quant || quant < 0) {
			return -1;
		} else {
			this.setQuantidade(this.getQuantidade() - quant);
			return this.getPrecoDeVenda() * quant;
		}
	}
}
