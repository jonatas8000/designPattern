package br.com.designPattern.abstractFactory;

import br.com.designPattern.abstractFactory.carcaca.Carcaca;
import br.com.designPattern.abstractFactory.carcaca.CarroCarcaca;
import br.com.designPattern.abstractFactory.chassis.CarroChassis;
import br.com.designPattern.abstractFactory.chassis.Chassis;
import br.com.designPattern.abstractFactory.janela.CarroJanela;
import br.com.designPattern.abstractFactory.janela.Janela;

public class CarroFactory extends AbstractVeiculoFactory{

	@Override
	public Carcaca criarCarcaca() {
		return new CarroCarcaca();
	}

	@Override
	public Chassis criarChassis() {
		return new CarroChassis();
	}

	@Override
	public Janela criarJanela() {
		return new CarroJanela();
	}

}
