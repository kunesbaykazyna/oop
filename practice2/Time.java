package practice2;

public class Time {

	private  int hour;
	private int minute;
	private int second;
	
	
	public Time(int h,int m,int s) {
		this.hour=h;
		this.minute=m;
		this.second=s;
	}
	
	public String toUniversal() {
	    return String.format("%02d:%02d:%02d", hour, minute, second);
	}

    private int getHour12() {
        int h = hour % 12;
        return (h == 0) ? 12 : h;
    }
    private String getPeriod() {
        return (hour < 12) ? "AM" : "PM";
    }
    public String toStandard() {
        return String.format("%02d:%02d:%02d %s", getHour12(), minute, second, getPeriod());
    }
	
	/**public String toStandard() {
	    int h = hour % 12;
	    if (h == 0) {
	        h = 12;
	    }

	    String period;
	    if (hour < 12) {
	        period = "AM";
	    } else {
	        period = "PM";
	    }

	    return String.format("%02d:%02d:%02d %s", h, minute, second, period);
	}**/

}