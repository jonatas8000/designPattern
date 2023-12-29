package br.com.designPattern.builder.builders;

import br.com.designPattern.builder.carros.TipoCarro;
import br.com.designPattern.builder.componentes.Cambio;
import br.com.designPattern.builder.componentes.ComputadorBordo;
import br.com.designPattern.builder.componentes.GPS;
import br.com.designPattern.builder.componentes.Motor;

public interface Builder {
	
	void setTipoCarro(TipoCarro tipo);
    void setBancos(int bancos);
    void setMotor(Motor motor);
    void setCambio(Cambio cambio);
    void setComputadorBordo(ComputadorBordo computadorBordo);
    void setGPS(GPS gps);

}
