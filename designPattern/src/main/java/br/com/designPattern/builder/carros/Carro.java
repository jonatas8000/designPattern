package br.com.designPattern.builder.carros;

import br.com.designPattern.builder.componentes.Cambio;
import br.com.designPattern.builder.componentes.ComputadorBordo;
import br.com.designPattern.builder.componentes.GPS;
import br.com.designPattern.builder.componentes.Motor;

public class Carro {
	
	 private TipoCarro tipo;
	 private int bancos;
	 private Motor motor;
	 private Cambio cambio;
	 private ComputadorBordo computadorBordo;
	 private GPS gps;
	 private double combustivel=0;
	 
	 
	public Carro(TipoCarro tipo, int bancos,Motor motor, Cambio cambio,ComputadorBordo computadorBordo,
			GPS gps) {
		
		this.tipo = tipo;
		this.bancos = bancos;
		this.motor = motor;
		this.cambio = cambio;
		this.computadorBordo = computadorBordo;
		if (this.computadorBordo != null) {
            this.computadorBordo.setCar(this);
        }
		
		this.gps = gps;
	}


	public double getCombustivel() {
		return combustivel;
	}


	public void setCombustivel(double combustivel) {
		this.combustivel = combustivel;
	}


	public TipoCarro getTipo() {
		return tipo;
	}


	public int getBancos() {
		return bancos;
	}


	public Motor getMotor() {
		return motor;
	}


	public Cambio getCambio() {
		return cambio;
	}


	public ComputadorBordo getComputadorBordo() {
		return computadorBordo;
	}


	public GPS getGps() {
		return gps;
	}
	 
	 
	

}
