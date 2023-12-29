package br.com.designPattern.factoryMethod;

public abstract class AbstractCarro extends AbstractVeiculo{
	
	protected String motor;

	@Override
	public String getMotor() {
		return motor;
	}

	@Override
	public Cor getCor() {
	   return cor;
	}


}
