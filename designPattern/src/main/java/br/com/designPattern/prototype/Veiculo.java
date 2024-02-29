package br.com.designPattern.prototype;

public interface Veiculo  extends Cloneable{
	
	public String getMotor();

	
	public Object clone();

}
