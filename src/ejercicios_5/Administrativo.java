package ejercicios_5;

public class Administrativo extends Empleado {
	private float hsExtra;
	private float hsMes;
	
	
	public float getHsExtra() {
		return hsExtra;
	}
	public void setHsExtra(float hsExtra) {
		this.hsExtra = hsExtra;
	}
	
	
	public float getHsMes() {
		return hsMes;
	}
	public void setHsMes(float hsMes) {
		this.hsMes = hsMes;
	}
	
	public float getSueldo() {
		return (float)(this.getSueldoBase()*( (this.hsExtra*1.5) +this.hsMes)/this.hsMes);
	}
	
}
