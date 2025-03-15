package list.OperacoesBasicas;

public class Tarefa {
	//atributo
	private String desc;
	
	public Tarefa(String desc) {
		this.desc = desc;
	}

	public String getDesc() {
		return desc;
	}

	@Override
	public String toString() {
		return "Tarefa: " + desc;
	}
	
	
}
