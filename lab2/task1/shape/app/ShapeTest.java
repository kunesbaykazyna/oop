package lab2.task1.shape.app;
import java.util.*;
import lab2.task1.shape.model.*;

public class ShapeTest {

	public static void main(String[] args) {
		
		List <Shape3D> shapes=new ArrayList<>();
		
		shapes.add(new Cube(3));
		shapes.add(new Cylinder(4,3));
		shapes.add(new Sphere(3));
		
		for(Shape3D s:shapes) {
			System.out.println(s.surfaceArea());
			System.out.println(s.volume());
		}
	}

}
