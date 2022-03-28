package actividades.polimorfismo.figuras;
/**
 * Clase final donde se definen las propiedades de Cuadrado
 * @author amna
 * @version 1.0
 */
public final class Square extends Rectangle{
	protected double side;
	public Square() {}
	public Square(double side) {
		this.side=side;
	}
	@Override
	protected double getArea() {
		double area = 2*(this.side);
		return area;
	}

	@Override
	protected double getPerimeter() {
		double perimeter = 4*(this.side);
		return perimeter;
	}
	//Getters y setters
	public void setWidth(double side) {
		this.side=side;
	}
	public void setLength(double side) {
		this.side=side;
	}
	public double getSide() {
		return side;
	}
	public void setSide(double side) {
		this.side = side;
	}
	@Override
	public String toString() {
		return super.toString()+"Square [side=" + side + ", width=" + width + ", length=" + length + ", color=" + color + ", filled="
				+ filled + "]";
	}

}
