package br.com.designPattern.prototype;

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
	public String toString() {
		return "Hatch (Motor("+motor+"))";
				
	}

	
}
