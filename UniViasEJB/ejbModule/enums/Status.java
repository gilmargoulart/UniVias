package enums;

public enum Status {
	
	ATIVO("A", "Ativo")
	,INATIVO("I", "Inativo");
	
	private String status;
	private String description;
	
	Status(String status, String description){
		this.status = status;
		this.description = description;
	}

	public String getStatus() {
		return status;
	}
	public String getDescription(){
		return this.description;
	}
}
