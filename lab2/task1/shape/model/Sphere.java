package lab2.task1.shape.model;

public class Sphere extends Shape3D{

	private double r;
	
	public Sphere(double r) {
		this.r=r;
	}
	
	@Override
	public double volume() {
	    return (4.0 / 3.0) * Math.PI * Math.pow(r, 3);
	}
	
	@Override
	public double surfaceArea() {
		return 4*Math.PI*r*r;
}

	public double getR() {
		return r;
	}
}
