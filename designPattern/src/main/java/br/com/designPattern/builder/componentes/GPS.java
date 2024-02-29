package br.com.designPattern.builder.componentes;

public class GPS {
	
	private String rota;
	
	

	public GPS() {
		rota="Rua: Origem 333, cidade - sp para Rua:Destino 333, cidade -sp";
	}

	public GPS(String rota) {
		this.rota = rota;
	}

	public String getRota() {
		return rota;
	}
	
	
	
	

}
