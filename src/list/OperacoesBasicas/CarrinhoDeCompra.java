package list.OperacoesBasicas;
import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompra {
	private List<Item> carrinho;
	
	public CarrinhoDeCompra () {
		this.carrinho = new ArrayList<>();
	}
	
	public void adicionarItem(String nome, double preco, int quant) {
		Item item = new Item(nome, preco, quant);
		this.carrinho.add(item);
	}
	
	public void removerItem(String nome) {
		List<Item> itensParaRemover = new ArrayList<>();
		for(Item i : carrinho) {
			if(i.getNome().equalsIgnoreCase(nome)) {
				itensParaRemover.add(i);
			}
		}
		this.carrinho.removeAll(itensParaRemover);
	}
	
	public double calcularValorTotal() {
		double valorTotal = 0.00;
		for(Item i : carrinho) {
			valorTotal += (i.getPreco()*i.getQuant());
		}
		return valorTotal;
	}
	
	public void exibirItens() {
		System.out.println(carrinho);
	}
	
	
}
