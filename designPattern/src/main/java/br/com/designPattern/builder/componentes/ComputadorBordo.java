package br.com.designPattern.builder.componentes;

import br.com.designPattern.builder.carros.Carro;

public class ComputadorBordo {

	private Carro carro;

    public void setCar(Carro carro) {
        this.carro = carro;
    }

    public void showFuelLevel() {
        System.out.println("Nível combustível: " + carro.getCombustivel());
    }

    public void mostrarStatus() {
        if (this.carro.getMotor().isStarted()) {
            System.out.println("Carro está ligado");
        } else {
            System.out.println("Carro está desligado");
        }
    }
}
