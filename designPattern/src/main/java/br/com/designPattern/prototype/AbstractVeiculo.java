package br.com.designPattern.prototype;

public abstract class AbstractVeiculo  implements Veiculo{

	@Override
	public String getMotor() {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	public Object clone() {
		Object obj=null;
		
		try {
			obj = super.clone();
		}catch(CloneNotSupportedException x) {
			
		}
		return obj;
	}

	
	

}
