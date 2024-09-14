package br.com.designPattern.adapter;

public class SuperMotorVerdeAdapter extends AbstractMotor {

	public SuperMotorVerdeAdapter(SuperMotorVerde superGreenEngine) {
		super(superGreenEngine.getSize(),false);
	}

}
