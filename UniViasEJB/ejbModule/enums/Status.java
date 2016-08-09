package enums;

public enum Status {
	
	ATIVO('A')
	,INATIVO('I');
	
	private char status;
	
	Status(char status){
		this.status = status;
	}

	public char getStatus() {
		return status;
	}
}
