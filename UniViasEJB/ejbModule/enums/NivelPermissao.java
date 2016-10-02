package enums;

public enum NivelPermissao {
	
	ADMIN(1),
	ADMIN_TENANT(2),
	ATENDENTE(3),
	UNIVERSITARIO(4)
	;
	
	private int permissao;
	
	NivelPermissao(int permissao){
		this.permissao = permissao;
	}

	public int getPermissao(){
		return this.permissao;
	}
}
