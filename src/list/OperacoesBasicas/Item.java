package list.OperacoesBasicas;

public class Item {
	private String nome;
	private double preco;
	private int quant;
	
	public Item(String nome, double preco, int quant) {
		this.nome = nome;
		this.preco = preco;
		this.quant = quant;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getQuant() {
		return quant;
	}
	public void setQuant(int quant) {
		this.quant = quant;
	}
	
	@Override
	public String toString() {
		return "Itens: \n"
				+ "Nome: " + this.nome
				+ "\nPreço: R$" + this.preco
				+ "\nQuantidade: " + this.quant + "\n\n";
	}
	
	
}
