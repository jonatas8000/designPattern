package br.com.designPattern.factoryMethod;



public abstract class VeiculoFactory {
	
	
	
	public static Veiculo fazer(Categoria categoria,TipoVeiculo tipoVeiculo, Cor cor) {
		VeiculoFactory factory =null;
		
		if(categoria == Categoria.CARRO)
			factory = new CarroFactory();
		else
			factory = new VanFactory();
		
		return factory.construir(tipoVeiculo, cor);
	}
	
	
	protected abstract Veiculo selecionarVeiculo(TipoVeiculo tipoVeiculo);
	
	private  Veiculo construir(TipoVeiculo tipoVeiculo, Cor cor) {
		Veiculo v = selecionarVeiculo(tipoVeiculo);
		v.pintar(cor);
		
		return v;
	}
	

}
