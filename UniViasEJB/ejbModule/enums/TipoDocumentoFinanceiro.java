package enums;

public enum TipoDocumentoFinanceiro {
	PAGAR('A')
	,RECEBER('I');
	
	private char tipo;
	
	TipoDocumentoFinanceiro(char tipo){
		this.tipo = tipo;
	}

	public char getTipoDocumentoFinanceiro() {
		return tipo;
	}
}
