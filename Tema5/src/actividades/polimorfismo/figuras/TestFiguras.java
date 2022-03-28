package actividades.polimorfismo.figuras;
/**
 * Clase lanzadora de todas las clases que derivan de la clase abstracta Shape
 * @author amna
 * @version 1.0
 */
public class TestFiguras {

	public static void main(String[] args) {
		Shape[] figuras = new Shape[3];
		figuras[0] = new Circle(5);
		figuras[1] = new Rectangle(5, 2);
		figuras [2] = new Square(5);
		System.out.println("Área círculo: "+figuras[0].getArea()+"\n"
				+"Perímetro círculo: "+figuras[0].getPerimeter()+"\n"
				+"Área rectángulo: "+figuras[1].getArea()+"\n"
				+"Perímetro rectángulo: "+figuras[1].getPerimeter()+"\n"
				+"Área cuadrado: "+figuras[2].getArea()+"\n"
				+"Perímetro cuadrado: "+figuras[2].getPerimeter());
	}

}
