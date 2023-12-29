package br.com.designPattern.factoryMethod;

public abstract class AbstractVan extends AbstractVeiculo{
	
	protected String motor;

	public AbstractVan () {
		motor="120CV";
	}
	
	@Override
	public String getMotor() {
		return motor;
	}

	@Override
	public Cor getCor() {
	   return cor;
	}

}
