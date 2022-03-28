package actividades.polimorfismo.empleados;

import java.util.ArrayList;
/**
 * Clase final heredada de Empleado
 * @author amna
 *
 */
public final class Vendedor extends Empleado{
	private String matriculaCoche;
	private String marcaCoche;
	private String modeloCoche;
	private String areaVenta;
	private ArrayList<String> listaClientes = new ArrayList<>();
	private final static int PORCENTAJE_INC = 10;

	public Vendedor(String nombre, String apellidos, String dni, String direccion, int aniosAntiguedad, int tlf,
			int salario, String matriculaCoche, String marcaCoche, String modeloCoche, String areaVenta) {
		super(nombre, apellidos, dni, direccion, aniosAntiguedad, tlf, salario);		
		this.matriculaCoche = matriculaCoche;
		this.marcaCoche = marcaCoche;
		this.modeloCoche = modeloCoche;
		this.areaVenta = areaVenta;
	}
	public void cambiarCoche(String nuevaMatriculaCoche, String nuevaMarcaCoche, String nuevoModeloCoche) {
		this.matriculaCoche=nuevaMatriculaCoche;
		this.marcaCoche=nuevaMarcaCoche;
		this.modeloCoche=nuevoModeloCoche;
	}
	public void altaCliente(String nuevoCliente) {
		this.listaClientes.add(nuevoCliente);
	}
	public void bajaCliente(String elimCliente) {
		this.listaClientes.remove(elimCliente);
	}
	@Override
	public void incSalario() {
		System.out.println("Salario sin el incremento aplicado: "+this.salario);
		this.salario=this.salario+(this.salario*Vendedor.PORCENTAJE_INC) / 100;
		System.out.println("Salario incrementado: "+this.salario);

	}

	@Override
	public void imprimir() {
		super.imprimir();
		System.out.println("Matrícula coche: "+this.matriculaCoche+"\n"
				+"Marca de coche: "+this.marcaCoche+"\n"
				+"Modelo del coche: "+this.modeloCoche+"\n"
				+"Área de venta: "+this.areaVenta+"\n"
				+"Puesto: Vendedor");

	}

	public String getMatriculaCoche() {
		return matriculaCoche;
	}



	public void setMatriculaCoche(String matriculaCoche) {
		this.matriculaCoche = matriculaCoche;
	}



	public String getMarcaCoche() {
		return marcaCoche;
	}



	public void setMarcaCoche(String marcaCoche) {
		this.marcaCoche = marcaCoche;
	}



	public String getModeloCoche() {
		return modeloCoche;
	}



	public void setModeloCoche(String modeloCoche) {
		this.modeloCoche = modeloCoche;
	}



	public String getAreaVenta() {
		return areaVenta;
	}



	public void setAreaVenta(String areaVenta) {
		this.areaVenta = areaVenta;
	}

}
