package br.com.designPattern.factoryMethod;

public class VanFactory extends VeiculoFactory {

	@Override
	protected Veiculo selecionarVeiculo(TipoVeiculo tipoVeiculo) {
		if(tipoVeiculo == TipoVeiculo.FURGAO)
		   return new Furgao();
		else
		   return new MicroOnibus();
		
	}

}
