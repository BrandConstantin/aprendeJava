package oop;

public final class Jefatura extends Empleado{ // con la palabra final delante ya no se pueden crear subclases para Jefatura
	public Jefatura(String nombre, double sueldo, int agno, int mes, int dia) {
		super(nombre, sueldo, agno, mes, dia);
	}
	
	public void setIncentivo(double d) {
		incentivo = d;
	}	
	
	public double getIncentivo() {
		return incentivo;
	}

	// m�todo que sobreescribe el metodo de la clase padre getSueldo()
	public double getSueldo() {
		double sueldoJefe = super.getSueldo();
		
		return sueldoJefe + incentivo;
	}
	
	private double incentivo;
	
	
}
