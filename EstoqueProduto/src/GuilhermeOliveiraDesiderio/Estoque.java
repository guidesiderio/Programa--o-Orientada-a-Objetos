package GuilhermeOliveiraDesiderio;

import java.util.ArrayList;

public class Estoque {

	ArrayList<Produto> produtos = new ArrayList<>();
	
	public void incluir(Produto produto) {
		Produto novo = pesquisar(produto.getCodigo());
		if (novo != null) {
			System.out.println("Produto já cadastrado.");
		} else {
		  produtos.add(produto);
		}
	}
	
	public Produto pesquisar(int num){
		for (Produto produto : produtos) {
			if (produto.getCodigo() == num) {
				return produto;
			}		
		}
		return null;
	}
	  
	  public void comprar(int cod, int quant, double preco) {
		  if(quant < 0 || preco < 0) {
			  System.out.println("Erro");
		  }
		  else {
			  for(Produto produto: produtos) {
				  if(produto.getCodigo() == cod) {
					  produto.compra(quant, preco);
					  break;
				  }
			  }
		  }
	  }
	  
	  public double vender(int cod, int quant) {
		  for(Produto produto: produtos) {
				 if(produto.getCodigo() == cod) {
					 return produto.venda(quant);
				 }
			 }
			return -1;
	  }

	  ArrayList<Produto> estoqueAbaixoDoMinimo = new ArrayList<>();
	  
	  public ArrayList<Produto> estoqueAbaixoDoMinimo() {
		  for(Produto produto: produtos) {
			  if(produto.getQuantidade() < produto.getEstoqueMinimo()) {
				  estoqueAbaixoDoMinimo.add(produto);
			  }
		  }
		  return  estoqueAbaixoDoMinimo;
	  }
	}