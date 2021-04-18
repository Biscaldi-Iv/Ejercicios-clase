package ejercicios_5;

public class Vendedor extends Empleado {
	private float porcenComision;
	private float totalVtas;
	
	

	public float getPorcenComision() {
		return porcenComision;
	}



	public void setPorcenComision(float porcenComision) {
		this.porcenComision = porcenComision;
	}



	public float getTotalVtas() {
		return totalVtas;
	}



	public void setTotalVtas(float totalVtas) {
		this.totalVtas = totalVtas;
	}



	public float getSueldo(){
		return (float)( this.getSueldoBase() + (porcenComision*totalVtas/100));
		
	}
}
