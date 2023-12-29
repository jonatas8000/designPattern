package br.com.designPattern.factoryMethod;

public class MicroOnibus extends AbstractVan{
	
	@Override
	public String toString() {
		return "Micro-ônibus (Motor("+motor+"),"+cor.name()+")";
				
	}

}
