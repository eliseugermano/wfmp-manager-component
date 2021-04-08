package br.health.workflow.core.parser.antlr4;

public class DSLSymbol {
	
	private String id;
	private String type;
	
	public DSLSymbol(String id, String type) {
		super();
		this.id = id;
		this.type = type;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "DSLSymbol [id=" + id + ", type=" + type + "]\n";
	}
}
