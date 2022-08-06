package GuilhermeOliveiraDesiderio.estoque;

/** 
@author  Guilherme Oliveira Desidério
@since   02.08.2022
*/

import java.util.ArrayList;
import java.util.LinkedList;

public class Estoque {

	LinkedList<Produto> linkedlist = new LinkedList<>();
	
	public void incluir(Produto produto) {
		Produto novo = pesquisar(produto.getCodigo());
		if (novo != null) {
			System.out.println("Produto já cadastrada.");
		} else {
		  linkedlist.addLast(produto);
		}
	}
	
	public Produto pesquisar(int num){
		for (Produto produto : linkedlist) {
			if (produto.getCodigo() == num) {
				return produto;
			}		
		}
		return null;
	}
	  
	  public void comprar(int cod, int quant, double preco) {
		  if(quant < 0 && preco < 0) {
			  System.out.println("Erro!");
		  }
		  else {
			  for(Produto produto: linkedlist) {
				  if(produto.getCodigo() == cod) {
					  produto.compra(quant, preco);
					  break;
				  }
			  }
		  }
	  }

	  public double vender(int cod, int quant) {
			 for(Produto produto: linkedlist) {
				 if(produto.getCodigo() == cod) {
					 return produto.venda(quant);
				 }
			 }
			return -1;
	  }

	  ArrayList<Produto> estoqueAbaixoDoMinimo = new ArrayList<>();
	  
	  public ArrayList<Produto> estoqueAbaixoDoMinimo() {
		  
		  for(Produto produto: linkedlist) {
			  if(produto.getQuantidade() < produto.getEstoqueMinimo()) {
				  estoqueAbaixoDoMinimo.add(produto);
			  }
		  }
		  return  estoqueAbaixoDoMinimo;
	  }
	}