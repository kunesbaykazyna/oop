package lab2.task1.shape.model;

public class Cylinder extends Shape3D{
	private double r;
	private double h;
	
	public Cylinder(double r,double h) {
		this.r=r;
		this.h=h;
	}
	//V=πr2h
	//S=2πr2+2πrh
	@Override
	public double volume() {
		return Math.PI*r*r*h;
	}
	
	@Override
	public double surfaceArea() {
		return 2*Math.PI*(r*r)+2*Math.PI*r*h;
	}
	
	
	public double getR() {
		return r;
	}
	public double getH() {
		return h;
	}
	
	
}
