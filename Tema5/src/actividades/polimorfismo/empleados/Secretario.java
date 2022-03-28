package actividades.polimorfismo.empleados;
/**
 * Clase final heredada de Empleado
 * @author amna
 * @version 1.0
 */
public final class Secretario extends Empleado {
	private int numDespacho;
	private int numFax;
	private final static int PORCENTAJE_INC = 5;
	
	@Override
	public void imprimir() {
		super.imprimir();
		System.out.println("Número de despacho: "+this.numDespacho+"\n"
				+"Número de fax: "+this.numFax+"\n"
				+"Puesto: Secretario");
	}
	@Override
	public void incSalario() {
		System.out.println("Salario sin el incremento aplicado: "+this.salario);
		this.salario=this.salario+(this.salario*Secretario.PORCENTAJE_INC) / 100;
		System.out.println("Salario incrementado: "+this.salario);
	}
	
	public Secretario(String nombre, String apellidos, String dni, String direccion, int aniosAntiguedad, int tlf,
			int salario, int numDespacho, int numFax) {
		super(nombre, apellidos, dni, direccion, aniosAntiguedad, tlf, salario);
		this.numDespacho = numDespacho;
		this.numFax = numFax;
	}
	public int getNumDespacho() {
		return numDespacho;
	}
	public void setNumDespacho(int numDespacho) {
		this.numDespacho = numDespacho;
	}
	public int getNumFax() {
		return numFax;
	}
	public void setNumFax(int numFax) {
		this.numFax = numFax;
	}
	public static int getPorcentajeInc() {
		return PORCENTAJE_INC;
	}

}
