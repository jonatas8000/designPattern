package br.com.designPattern.Singleton;

public class GeradorNumeroSerial {
	
	private int count;

	private static GeradorNumeroSerial instance;
	
	private GeradorNumeroSerial () {}
	
	public synchronized static GeradorNumeroSerial getInstance() {
		if(instance==null) 
			instance=new GeradorNumeroSerial();
		
		return instance;
	}
	
	public synchronized int getProximoSerial() {
		return ++count;
	}
}
