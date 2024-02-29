package br.com.designPattern.factoryMethod;

public class Sedan extends AbstractCarro {
	
	
	public Sedan(String motor) {
	    this.motor=motor;
		
	}
	
	@Override
	public String toString() {
		return "Sedan (Motor("+motor+"),"+cor.name()+")";
				
	}

}
