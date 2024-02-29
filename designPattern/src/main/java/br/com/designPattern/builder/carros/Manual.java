package br.com.designPattern.builder.carros;

import br.com.designPattern.builder.componentes.Cambio;
import br.com.designPattern.builder.componentes.ComputadorBordo;
import br.com.designPattern.builder.componentes.GPS;
import br.com.designPattern.builder.componentes.Motor;

public class Manual {
	 private TipoCarro tipo;
	 private int bancos;
	 private Motor motor;
	 private Cambio cambio;
	 private ComputadorBordo computadorBordo;
	 private GPS gps;
	 
	 public Manual(TipoCarro tipo, int bancos,Motor motor, Cambio cambio,ComputadorBordo computadorBordo,
				GPS gps) {
			
			this.tipo = tipo;
			this.bancos = bancos;
			this.motor = motor;
			this.cambio = cambio;
			this.computadorBordo = computadorBordo;
			this.gps = gps;
		}

	@Override
	public String toString() {
		 String info = "";
	        info += "Tipo de carro: " + tipo + "\n";
	        info += "Quantidade de bancos: " + bancos + "\n";
	        info += "Motor: volume - " + motor.getVolume() + "; mileage - " + motor.getQuilometragem() + "\n";
	        info += "Cambio: " + cambio + "\n";
	        if (this.computadorBordo != null) {
	            info += "Computador de bordo: Funcional" + "\n";
	        } else {
	            info += "Computador de bordo: N/A" + "\n";
	        }
	        if (this.gps != null) {
	            info += "GPS: Funcional" + "\n";
	        } else {
	            info += "GPS: N/A" + "\n";
	        }
	        return info;
	}
	 
	 


}
