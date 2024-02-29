package br.com.designPattern.builder.builders;

import br.com.designPattern.builder.carros.Carro;
import br.com.designPattern.builder.carros.TipoCarro;
import br.com.designPattern.builder.componentes.Cambio;
import br.com.designPattern.builder.componentes.ComputadorBordo;
import br.com.designPattern.builder.componentes.GPS;
import br.com.designPattern.builder.componentes.Motor;

public class CarroBuilder implements Builder {

	 private TipoCarro tipo;
	 private int bancos;
	 private Motor motor;
	 private Cambio cambio;
	 private ComputadorBordo computadorBordo;
	 private GPS gps;
	
	
	@Override
	public void setTipoCarro(TipoCarro tipo) {
		this.tipo=tipo;
		
	}

	@Override
	public void setBancos(int bancos) {
		this.bancos=bancos;
		
	}

	@Override
	public void setMotor(Motor motor) {
		this.motor=motor;
		
	}

	@Override
	public void setCambio(Cambio cambio) {
		this.cambio=cambio;
		
	}

	@Override
	public void setComputadorBordo(ComputadorBordo computadorBordo) {
		this.computadorBordo=computadorBordo;
		
	}

	@Override
	public void setGPS(GPS gps) {
		this.gps=gps;
		
	}
	
	 public Carro getResultado() {
	    return new Carro(tipo, bancos, motor, cambio, computadorBordo, gps);
	 }

}
