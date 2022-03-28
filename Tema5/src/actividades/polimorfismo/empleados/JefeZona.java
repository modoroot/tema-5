package actividades.polimorfismo.empleados;

import java.util.ArrayList;

/**
 * Clase final heredada de Empleado
 * @author amna
 *
 */
public final class JefeZona extends Empleado {
	String cocheEmpresa;
	private ArrayList<Vendedor> vendedores = new ArrayList<>();
	private ArrayList<Secretario> secretarios = new ArrayList<>(); 
	private final static int PORCENTAJE_INC=20;

	public JefeZona(String nombre, String apellidos, String dni, String direccion, int aniosAntiguedad, int tlf,
			int salario, String cocheEmpresa) {
		super(nombre, apellidos, dni, direccion, aniosAntiguedad, tlf, salario);
		this.cocheEmpresa=cocheEmpresa;
	}
	
	public void cambiarSecretario(Secretario nuevoSecretario) {
		this.secretarios.add(nuevoSecretario);
		nuevoSecretario.cambiarSupervisor(this);
	}
	public void cambiarVendedor(Vendedor nuevoVendedor) {
		this.vendedores.add(nuevoVendedor);
		nuevoVendedor.cambiarSupervisor(this);
	}
	public void cambiarCoche(String nuevoCoche) {
		this.cocheEmpresa=nuevoCoche;
	}
	
	public void eliminarVendedor(Vendedor bajaVendedor) {
		this.vendedores.remove(bajaVendedor);
	}
	
	public void mostrarVendedores(){
		for (int i=0; i< this.vendedores.size(); i++)
		{
			this.vendedores.get(i).imprimir();
		}
	}

	public void mostrarSecretario(){
		for (int i=0; i< this.secretarios.size(); i++)
		{
			this.secretarios.get(i).imprimir();
		}    
	} 

	@Override
	public void imprimir() {
		super.imprimir();
		System.out.println("Coche de empresa: "+this.cocheEmpresa
				+"Puesto: Jefe de zona");

	}
	@Override
	public void incSalario() {
		System.out.println("Salario sin el incremento aplicado: "+this.salario);
		this.salario=this.salario+(this.salario*JefeZona.PORCENTAJE_INC) / 100;
		System.out.println("Salario incrementado: "+this.salario);
	}

	public String getCocheEmpresa() {
		return cocheEmpresa;
	}

	public void setCocheEmpresa(String cocheEmpresa) {
		this.cocheEmpresa = cocheEmpresa;
	}

	public ArrayList<Vendedor> getVendedores() {
		return vendedores;
	}

	public void setVendedores(ArrayList<Vendedor> vendedores) {
		this.vendedores = vendedores;
	}

	public ArrayList<Secretario> getSecretarios() {
		return secretarios;
	}

	public void setSecretarios(ArrayList<Secretario> secretarios) {
		this.secretarios = secretarios;
	}

	public static int getPorcentajeInc() {
		return PORCENTAJE_INC;
	}

}
