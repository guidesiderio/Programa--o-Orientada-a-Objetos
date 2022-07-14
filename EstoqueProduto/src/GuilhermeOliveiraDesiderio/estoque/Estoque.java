package GuilhermeOliveiraDesiderio.estoque;

/** 
@author  Guilherme Oliveira Desidério
@since   12.07.2022
*/

/*
 * Classe Estoque invoca os métodos da classe Produto
 */

public class Estoque {

	public static void main(String[] args) {
		
		Produto sabonete = new Produto();
		
		System.out.println("------------------------------------------------------");
		System.out.println("CODIGO: " + sabonete.getCodigo());
		System.out.println("DESCRICAO: " + sabonete.getDescricao());
		System.out.println("PRECO DE COMPRA: R$ " + sabonete.getPrecoCompra());
		System.out.println("PRECO DE VENDA: R$ " + sabonete.getPrecoVenda());
		System.out.println("QUANTIDADE: " + sabonete.getQuantidade());
		System.out.println("ESTOQUE MINIMO: " + sabonete.getEstoqueMinimo());
		
		sabonete.setCodigo(43512);
		sabonete.setDescricao("Sabonete");
		sabonete.setPrecoCompra(2);
		sabonete.setPrecoVenda(5);
		sabonete.setQuantidade(10);
		sabonete.setEstoqueMinimo(2);
		
		System.out.println("------------------------------------------------------");
		System.out.println("CODIGO: " + sabonete.getCodigo());
		System.out.println("DESCRICAO: " + sabonete.getDescricao());
		System.out.println("PRECO DE COMPRA: R$ " + sabonete.getPrecoCompra());
		System.out.println("PRECO DE VENDA: R$ " + sabonete.getPrecoVenda());
		System.out.println("QUANTIDADE: " + sabonete.getQuantidade());
		System.out.println("ESTOQUE MINIMO: " + sabonete.getEstoqueMinimo());
		
		sabonete.compra(10, 20);
		
		System.out.println("------------------------------------------------------");
		System.out.println("CODIGO: " + sabonete.getCodigo());
		System.out.println("DESCRICAO: " + sabonete.getDescricao());
		System.out.println("PRECO DE COMPRA: R$ " + sabonete.getPrecoCompra());
		System.out.println("PRECO DE VENDA: R$ " + sabonete.getPrecoVenda());
		System.out.println("QUANTIDADE: " + sabonete.getQuantidade());
		System.out.println("ESTOQUE MINIMO: " + sabonete.getEstoqueMinimo());
		
		sabonete.venda(5);
		
		System.out.println("------------------------------------------------------");
		System.out.println("CODIGO: " + sabonete.getCodigo());
		System.out.println("DESCRICAO: " + sabonete.getDescricao());
		System.out.println("PRECO DE COMPRA: R$ " + sabonete.getPrecoCompra());
		System.out.println("PRECO DE VENDA: R$ " + sabonete.getPrecoVenda());
		System.out.println("QUANTIDADE: " + sabonete.getQuantidade());
		System.out.println("ESTOQUE MINIMO: " + sabonete.getEstoqueMinimo());
		
	}

}
