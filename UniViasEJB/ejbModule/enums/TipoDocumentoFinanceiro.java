package enums;

public enum TipoDocumentoFinanceiro {
	PAGAR('P')
	,RECEBER('R');
	
	private char tipo;
	
	TipoDocumentoFinanceiro(char tipo){
		this.tipo = tipo;
	}

	public char getTipoDocumentoFinanceiro() {
		return tipo;
	}
}
