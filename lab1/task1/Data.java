package lab1.task1;
public class Data{
	private double maxNumber;
	private double sum;
	private int cnt;
	
	public Data(){
		maxNumber = Double.NEGATIVE_INFINITY;
	}
	public void add(double d) {
		sum+=d;
		cnt++;
		if(d>maxNumber) {
			maxNumber=d;
		}
	}
	public double summ() {
		return sum;
	}
	
	public double maxxx() {
		return maxNumber;
	}
	
	public double avg() {
		if(sum==0) {
			return 0;
		}
		double res= sum/cnt;
		return res;
	}

	
	
}
