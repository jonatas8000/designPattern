package br.com.designPattern.adapter;

public abstract class AbstractMotor implements Motor {

	private int size;
	private boolean turbo;
	
	public AbstractMotor(int size, boolean turbo) {
		this.size = size;
		this.turbo = turbo;
	}

	@Override
	public int getSize() {
		return size;
	}

	@Override
	public boolean isTurbo() {
		return turbo;
	}
	
	@Override
	public String toString() {
		return getClass().getSimpleName() + "("+ size + ")";
	}
}
