package practice2;

public class StarTriangle {

	private int width;
	
	public StarTriangle(int w) {
		this.width=w;
	}
	public String constructor() {
		String res="";
		for(int i=1;i<=width;i++) {
			for(int j=1;j<=i;j++) {
				res+="[*]";
			}
			res+="\n";
		}
		return res;
	}
	
	public String toString() {
		return constructor(); 
	}
}
