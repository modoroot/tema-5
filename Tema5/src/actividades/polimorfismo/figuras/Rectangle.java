package actividades.polimorfismo.figuras;
/**
 * Clase que hereda de Shape donde se definen los métodos y propiedades
 * de un rectángulo (calcular perímetro y área)
 * @author amna
 * @version 1.0
 */
public class Rectangle extends Shape{
	protected double width = 1.0;
	protected double length = 1.0;

	public Rectangle() {}

	public Rectangle(double width, double length) {
		this();
		this.width=width;
		this.length=length;
	}

	public Rectangle(double width, double length, String color, boolean filled) {
		super(color, filled);
		this.width=width;
		this.length=length;
	}

	@Override
	protected double getArea() {
		double area = this.width*this.length;
		return area;
	}

	@Override
	protected double getPerimeter() {
		double perimeter = 2*(this.width+this.length);
		return perimeter;
	}
	//Getters y setters
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	@Override
	public String toString() {
		return super.toString()+"Rectangle [width=" + width + ", length=" + length + ", color=" + color + ", filled=" + filled + "]";
	}


}
