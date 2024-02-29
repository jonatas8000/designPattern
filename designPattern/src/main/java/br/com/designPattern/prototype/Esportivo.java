package br.com.designPattern.prototype;

public class Esportivo  extends AbstractCarro{

	public Esportivo(String motor) {
	    this.motor=motor;
		
	}
	
	@Override
	public String toString() {
		return "Esportivo (Motor("+motor+"))";
				
	}

}
