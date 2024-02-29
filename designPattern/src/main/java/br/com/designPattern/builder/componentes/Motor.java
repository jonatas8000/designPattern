package br.com.designPattern.builder.componentes;

public class Motor {
	 
	private double volume;
	private double quilometragem;
	private boolean started;
	
	public Motor(double volume, double quilometragem) {
		this.volume = volume;
		this.quilometragem = quilometragem;
	}
	
	public void ligar() {
	    started = true;
	}

	public void desligar() {
	    started = false;
	}

	public boolean isStarted() {
	        return started;
    }
	
	 public void ir(double quilometragem) {
	        if (started) {
	            this.quilometragem += quilometragem;
	        } else {
	            System.err.println("Não pode ir(), você deve ligar o motor primeiro!");
	        }
	  }

	public double getVolume() {
		return volume;
	}

	public double getQuilometragem() {
		return quilometragem;
	}
	 
	 
	
	
	

}
