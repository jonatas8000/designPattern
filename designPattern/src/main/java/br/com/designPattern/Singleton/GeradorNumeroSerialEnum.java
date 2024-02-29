package br.com.designPattern.Singleton;

public enum GeradorNumeroSerialEnum {
	
	VEICULO, MOTOR;
	
	private int count;
	
	
	public synchronized int getProximoSerial() {
		return ++count;
	}

}
