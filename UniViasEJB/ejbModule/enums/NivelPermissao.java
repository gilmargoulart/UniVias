package enums;

public enum NivelPermissao {
	
	ADMIN(1, "Admin"),
	ADMIN_TENANT(2, "Admin Tenant"),
	ATENDENTE(3, "Atendente"),
	UNIVERSITARIO(4, "Universitário")
	;
	
	private int permissao;
	private String description;
	
	NivelPermissao(int permissao, String description){
		this.permissao = permissao;
		this.description = description;
	}
	
	public int getPermissao(){
		return this.permissao;
	}
	
	public String getDescription(){
		return this.description;
	}
}
