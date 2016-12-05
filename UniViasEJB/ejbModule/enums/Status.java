package enums;

public enum Status {
	
	INATIVO('I', "Inativo") //0
	,ATIVO('A', "Ativo"); //1
	
	private char status;
	private String description;
	
	Status(char status, String description){
		this.status = status;
		this.description = description;
	}

	public char getStatus() {
		return status;
	}
	
	public String getDescription(){
		return this.description;
	}
}
