package br.com.designPattern.builder.director;

import br.com.designPattern.builder.builders.Builder;
import br.com.designPattern.builder.carros.TipoCarro;
import br.com.designPattern.builder.componentes.Cambio;
import br.com.designPattern.builder.componentes.ComputadorBordo;
import br.com.designPattern.builder.componentes.GPS;
import br.com.designPattern.builder.componentes.Motor;

public class Director {

	public void construirCarroSport(Builder builder) {
        builder.setTipoCarro(TipoCarro.CARRO_SPORT);
        builder.setBancos(2);
        builder.setMotor(new Motor(3.0, 0));
        builder.setCambio(Cambio.SEMI_AUTOMATICO);
        builder.setComputadorBordo(new ComputadorBordo());
        builder.setGPS(new GPS());
    }

    public void construirCarroCidade(Builder builder) {
    	builder.setTipoCarro(TipoCarro.CARRO_CIDADE);
        builder.setBancos(2);
        builder.setMotor(new Motor(1.2, 0));
        builder.setCambio(Cambio.AUTOMATICO);
        builder.setComputadorBordo(new ComputadorBordo());
        builder.setGPS(new GPS());
    }

    public void construirSUV(Builder builder) {
        builder.setTipoCarro(TipoCarro.SUV);
        builder.setBancos(4);
        builder.setMotor(new Motor(2.5, 0));
        builder.setCambio(Cambio.MANUAL);
        builder.setGPS(new GPS());
    }
}
