package actividades.polimorfismo.figuras;
/**
 * Clase abstracta donde se definen las propiedades y métodos generales de una figura
 * @author amna
 * @version 1.0
 */
public abstract class Shape {
	protected String color = "red";
	protected boolean filled = true;

	public Shape() {}

	public Shape(String color, boolean filled) {
		this();
		this.color = color;
		this.filled = filled;
	}

	protected abstract double getArea();
	protected abstract double getPerimeter();

	//Getters y setters
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	@Override
	public String toString() {
		return "Shape [color=" + color + ", filled=" + filled + "]";
	}


}
