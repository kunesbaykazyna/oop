package lab2.task5.model;

public class Bird extends Animal{
	
	public Bird(String name, int age) { 
    	super(name, age); 
    }
    
    @Override
    public String getSound() {
    	return "Chip Chip"; 
    }
}
