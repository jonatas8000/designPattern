package br.com.designPattern.factoryMethod;

public class CarroFactory extends VeiculoFactory {

	@Override
	protected Veiculo selecionarVeiculo(TipoVeiculo tipoVeiculo) {
		
		if(tipoVeiculo == TipoVeiculo.HATCH)
			return new Hatch("128CV");
		else if(tipoVeiculo == TipoVeiculo.SEDAN)
			return new Sedan("150CV");
		else
			return new Esportivo("252CV");
		
	}

}
