package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
	private List<Livro> livrosList;

	public CatalogoLivros() {
		this.livrosList = new ArrayList<>();
	}
	
	public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
		this.livrosList.add(new Livro(titulo, autor, anoPublicacao));
	}
	
	public List<Livro> pesquisarAutor(String autor){
		List<Livro> livrosAutor = new ArrayList<>();
		if(!this.livrosList.isEmpty()) {
			for(Livro l : livrosList) {
				if(l.getAutor().equalsIgnoreCase(autor)) {
					livrosAutor.add(l);
				}
			}
		}
		return livrosAutor;
	}
	
	public List<Livro> pesquisaIntervaloAnos(int anoInicial, int anoFinal) {
		List<Livro> livrosIntervalo = new ArrayList<>();
		if(!livrosList.isEmpty()) {
			for(Livro l : livrosList) {
				if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
					livrosIntervalo.add(l);
				}
			}
		}
		return livrosIntervalo;
	}
	
	public Livro pesquisaLivro(String titulo) {
		Livro livro = null;
		if(!livrosList.isEmpty()) {
			for(Livro l : livrosList) {
				if(l.getTitulo().equalsIgnoreCase(titulo)) {
					livro = l;
					break;
				}
			}
		}
		return livro;
	}
	
}
