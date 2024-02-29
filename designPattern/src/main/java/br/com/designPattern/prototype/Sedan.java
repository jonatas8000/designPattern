package br.com.designPattern.prototype;

public class Sedan extends AbstractCarro {
	
	
	public Sedan(String motor) {
	    this.motor=motor;
		
	}
	
	@Override
	public String toString() {
		return "Sedan (Motor("+motor+"))";
				
	}

}
