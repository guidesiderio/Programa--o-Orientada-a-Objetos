package GuilhermeOliveiraDesiderio.estoque;

public class TestaProjeto {

	public static void main(String[] args) {

		Fornecedor fornecedor1 = new Fornecedor(9769486, "Guilherme");
		
		Produto produto1 = new Produto(12345, "Sabonete", 10, 50, fornecedor1);
		
		Estoque estoque1 = new Estoque();
	}
}
