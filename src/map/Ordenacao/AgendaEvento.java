package map.Ordenacao;

import java.time.LocalDate;
import java.util.*;

public class AgendaEvento {
	private Map<LocalDate, Evento> eventosMap;
	
	public AgendaEvento() {
		this.eventosMap = new HashMap<>();
	}
	
	public void adicionarEvento(LocalDate data, String nome, String atracao) {
		Evento evento = new Evento(nome, atracao);
		eventosMap.put(data, evento);
	}
	
	public void exibirAgenda() {
		Map<LocalDate, Evento> eventrosTreeMap = new TreeMap<>(eventosMap);
		System.out.println(eventrosTreeMap);
	}
	
	public void obterProximoEvento() {
		//Set<LocalDate> dateSet = eventosMap.keySet();
		//Collection<Evento> values = eventosMap.values();
		LocalDate dataAtual = LocalDate.now();
		Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
		for(Map.Entry<LocalDate, Evento> entry : eventosMap.entrySet()) {
			if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
				System.out.println("O próximo evento: " + entry.getValue() + " acontecerá na data " + entry.getKey());
				break;
			}
		}
	}
}
