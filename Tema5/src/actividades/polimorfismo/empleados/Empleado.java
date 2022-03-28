package actividades.polimorfismo.empleados;
/**
 * Clase abstracta donde se definen las propiedades y métodos generales de todos los empleados
 * @author amna
 * @version 1.0
 */
public abstract class Empleado {
	protected String nombre;
	protected String apellidos;
	protected String dni;
	protected String direccion;
	protected int aniosAntiguedad;
	protected int tlf;
	protected int salario;
	protected Empleado supervisor;

	/**
	 * Método abstracto que incrementa el salario de cada empleado según su puesto de trabajo
	 */
	protected abstract void incSalario();
	public void imprimir() {
		System.out.println("Nombre: "+this.nombre+"\n"
				+"Apellidos: "+this.apellidos+"\n"
				+"Dirección: "+this.direccion+"\n"
				+"Teléfono: "+this.tlf+"\n"
				+"DNI: "+this.dni+"\n"
				+"Años antigüedad: "+this.aniosAntiguedad+"\n"
				+"Salario: "+this.salario+"\n");
		if(this.supervisor==null)
			System.out.println("Supervisor: -------");
		else 
			System.out.println("Supervisor: "+this.supervisor.nombre);
	}
	public void cambiarSupervisor(Empleado nuevoSupervisor) {
		this.supervisor= nuevoSupervisor;
	}
	public Empleado(String nombre, String apellidos, String dni, String direccion, int aniosAntiguedad, int tlf,
			int salario) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.direccion = direccion;
		this.aniosAntiguedad = aniosAntiguedad;
		this.tlf = tlf;
		this.salario = salario;
	}
	public Empleado(String nombre, String apellidos, String dni, String direccion, int aniosAntiguedad, int tlf,
			int salario, Empleado supervisor) {
		this(nombre,apellidos,dni,direccion,aniosAntiguedad,tlf,salario);
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.direccion = direccion;
		this.aniosAntiguedad = aniosAntiguedad;
		this.tlf = tlf;
		this.salario = salario;
		this.supervisor = supervisor;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getTlf() {
		return tlf;
	}
	public void setTlf(int tlf) {
		this.tlf = tlf;
	}
	public int getSalario() {
		return salario;
	}
	public void setSalario(int salario) {
		this.salario = salario;
	}
	public String getDni() {
		return dni;
	}
	public int getAniosAntiguedad() {
		return aniosAntiguedad;
	}
}
