package br.com.designPattern.abstractFactory;

import br.com.designPattern.abstractFactory.carcaca.Carcaca;
import br.com.designPattern.abstractFactory.carcaca.VanCarcaca;
import br.com.designPattern.abstractFactory.chassis.Chassis;
import br.com.designPattern.abstractFactory.chassis.VanChassis;
import br.com.designPattern.abstractFactory.janela.Janela;
import br.com.designPattern.abstractFactory.janela.VanJanela;

public class VanFactory extends AbstractVeiculoFactory{

	@Override
	public Carcaca criarCarcaca() {
		return new VanCarcaca();
	}

	@Override
	public Chassis criarChassis() {
		return new VanChassis();
	}

	@Override
	public Janela criarJanela() {
		return new VanJanela();
	}

}
