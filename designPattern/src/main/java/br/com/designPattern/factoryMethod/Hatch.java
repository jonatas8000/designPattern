package br.com.designPattern.factoryMethod;

public class Hatch extends AbstractCarro{

	private String motor;
	
	public Hatch(String motor) {
	    this.motor=motor;
		
	}
	
	@Override
	public String getMotor() {
		return motor;
	}

	@Override
	public Cor getCor() {
	   return cor;
	}

	@Override
	public String toString() {
		return "Hatch (Motor("+motor+"),"+cor.name()+")";
				
	}

	
}
