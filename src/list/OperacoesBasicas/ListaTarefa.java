package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
	//atributo
	private List<Tarefa> tarefalist;

	public ListaTarefa() {
		this.tarefalist = new ArrayList<>();
	}
	
	public void adicionarTarefa(String desc) {
		tarefalist.add(new Tarefa(desc));
	}
	
	public void removerTarefa(String desc) {
		List<Tarefa> tarefasParaRemover = new ArrayList<>();
		for(Tarefa t : tarefalist) {
			if(t.getDesc().equalsIgnoreCase(desc)) {
				tarefasParaRemover.add(t);
			}
		}
		tarefalist.removeAll(tarefasParaRemover);
	}
	
	public int obterNumeroTotalTarefas() {
		return tarefalist.size();
	}
	
	public void obterDescTarefas() {
		System.out.println(tarefalist);
	}
}
