package br.com.designPattern.prototype;

public class VeiculoManager {
	
	private Veiculo hatch,sedan,esportivo,furgao,microOnibus;
	
	public VeiculoManager() {
		hatch=new Hatch("128CV");
		sedan=new Sedan("150CV");
		esportivo=new Esportivo("252CV");
		furgao=new Furgao();
		microOnibus=new MicroOnibus();
	}
	
	public Veiculo criarHatch() {
		return (Veiculo) hatch.clone();
	}

	public Veiculo criarSedan() {
		return (Veiculo) sedan.clone();
	}
	
	public Veiculo criarEsportivo() {
		return (Veiculo) esportivo.clone();
	}

	public Veiculo criarFurgao() {
		return (Veiculo) furgao.clone();
	}
	
	public Veiculo criarMicroOnibus() {
		return (Veiculo) microOnibus.clone();
	}


}
