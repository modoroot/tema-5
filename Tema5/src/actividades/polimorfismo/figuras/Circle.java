package actividades.polimorfismo.figuras;
/**
 * Clase que hereda de la abstracta Shape donde
 * se definen sus propiedades y métodos (calcular área y perímetro)
 * @author amna
 * @version 1.0
 */
public final class Circle extends Shape{
	
	protected double radius = 1.0;

	public Circle() {}
	public Circle(double radius) {
		this();
		this.radius=radius;
	}
	public Circle(String color, boolean filled, double radius) {
		super(color, filled);
		this.radius=radius;
	}
	@Override
	protected double getArea() {
		double area = Math.PI*(this.radius*this.radius);
		return area;
	}

	@Override
	protected double getPerimeter() {
		double perimeter = (2*Math.PI)*this.radius;
		return perimeter;
	}
	//Getters y setters
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return super.toString()+"Circle [radius=" + radius + ", color=" + color + ", filled=" + filled + "]";
	}
	
}
