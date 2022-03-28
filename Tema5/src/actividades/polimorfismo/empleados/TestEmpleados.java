package actividades.polimorfismo.empleados;
/**
 * Clase lanzadora de los empleados
 * @author amna
 *
 */
public class TestEmpleados {

	public static void main(String[] args) {
		Secretario secretario1 = new Secretario("Nombre1", "Apellidos1", "21941922A", "Direccion ejemplo",
				3, 694493293, 2500, 3, 1);
		Vendedor vendedor1 = new Vendedor("Nombre2", "Apellidos2", "12838832T", "Direccion2",
				3, 569506394, 2500, "4504 DPG", "Citroen", "C15", "Área este");
		secretario1.imprimir();
		secretario1.incSalario();
		System.out.println("------------------------------");
		vendedor1.imprimir();
		vendedor1.incSalario();
	}

}
