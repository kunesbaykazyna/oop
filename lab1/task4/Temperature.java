package lab1.task4;

public class Temperature {
	private double t;
	private char scale;
	
	public Temperature() {
		this.t=0.0;
		this.scale='C';
	}
	public Temperature(double t) {
		this.t=t;
		this.scale='C';
	}
	public Temperature(char scale) {
		this.t=0.0;
		setScale(scale);
	}
	public Temperature(double t,char scale) {
		this.t = t;
		setScale(scale);
	}
	public double convertC() {
		if(scale=='F') {
			return 5*(t-32)/9;
		}
		return t;
	}
	public double convertF() {
		if(scale=='C') {
			return t*9.0/5+32;
		}
		return t;
	}

	public char getScale() {
		return scale;
	}

    public void setValue(double t) {
        this.t = t;
    }

    public void setScale(char scale) {
    	    scale = Character.toUpperCase(scale);
    	    if(scale == 'C' || scale == 'F') {
    	        this.scale = scale;
    	    } else {
    	        System.out.println("Invalid scale");
    	        this.scale = 'C';
    	}
    }

    public void setBoth(double t, char scale) {
        this.t = t;
    	setScale(scale);
    }
    @Override
    public String toString() {
        return "Temperature: " + t + " " + scale;
    }
}
