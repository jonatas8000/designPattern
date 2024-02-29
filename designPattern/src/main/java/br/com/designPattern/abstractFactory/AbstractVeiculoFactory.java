package br.com.designPattern.abstractFactory;

import br.com.designPattern.abstractFactory.carcaca.Carcaca;
import br.com.designPattern.abstractFactory.chassis.Chassis;
import br.com.designPattern.abstractFactory.janela.Janela;

public abstract class AbstractVeiculoFactory {
	
	public abstract Carcaca criarCarcaca();
	public abstract Chassis criarChassis();
	public abstract Janela  criarJanela();

}
