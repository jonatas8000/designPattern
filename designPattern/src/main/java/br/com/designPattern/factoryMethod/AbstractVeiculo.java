package br.com.designPattern.factoryMethod;

public abstract class AbstractVeiculo  implements Veiculo{

	protected Cor cor;
	
	@Override
	public void pintar(Cor cor) {
		this.cor=cor;
		
	}
	
	

}
