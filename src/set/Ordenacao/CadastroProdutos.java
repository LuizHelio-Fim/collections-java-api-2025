package set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
	private Set<Produto> produtoSet;

	public CadastroProdutos() {
		this.produtoSet = new HashSet<>();
	}
	
	public void adicionarProduto(long cod, String nome, double preco, int quant) {
		produtoSet.add(new Produto(cod, nome, preco, quant));
	}
	
	public Set<Produto> exibirProdutoPorNome() {
		Set<Produto> produtoPorNome = new TreeSet<>(produtoSet);
		return produtoPorNome;
	}
	
	public Set<Produto> exibirPorPreco() {
		Set<Produto> produtoPorpreco = new TreeSet<>(new ComparatorPorPreco());
		produtoPorpreco.addAll(produtoSet);
		return produtoPorpreco;
	}
	
}
