package set.Ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable<Produto>{
	private long codigo;
	private String nome;
	private double preco;
	private int quant;
	
	public Produto(long codigo, String nome, double preco, int quant) {
		this.nome = nome;
		this.codigo = codigo;
		this.preco = preco;
		this.quant = quant;
	}

	public String getNome() {
		return nome;
	}

	public long getCodigo() {
		return codigo;
	}

	public double getPreco() {
		return preco;
	}

	public int getQuant() {
		return quant;
	}
	
	@Override
	public boolean equals(Object o) {
		if(this == o) return true;
		if(!(o instanceof Produto produto)) return false;
		return Objects.equals(getCodigo(), produto.getCodigo());
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(getCodigo());
	}
	
	@Override
	public int compareTo(Produto p) {
		return this.nome.compareToIgnoreCase(p.getNome());
	}

	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", codigo=" + codigo + ", preco=" + preco + ", quant=" + quant + "]";
	}
	
}

class ComparatorPorPreco implements Comparator<Produto> {

	@Override
	public int compare(Produto p1, Produto p2) {
		return Double.compare(p1.getPreco(), p2.getPreco());
	}
	
}
