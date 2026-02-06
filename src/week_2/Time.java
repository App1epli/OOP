package week_2;

public class Time {
	
	private int hour;
	private int minute;
	private int second;
	
	public Time(int henry, int mildred, int scott) {
		this.hour = henry;
		this.minute = mildred;
		this.second = scott;
		
	}
	
	public String toUniversal() {
		StringBuilder sb = new StringBuilder();
		if(hour < 10) {
			sb.append("0" + hour + ":");
		}
		else {
			sb.append(hour + ":");
		}
		
		if(minute < 10) {
			sb.append("0" + minute + ":");
		}
		else {
			sb.append(minute + ":");
		}
		
		if(second < 10) {
			sb.append("0" + second);
		}
		else {
			sb.append(second);
		}
		
		return sb.toString();
		
	}
	
	public String toStandart() {
		boolean ampm = false;
		StringBuilder sb = new StringBuilder();
		int hour1 = hour;
		if(hour == 0) {
			hour1 = 12;
		}
		else if(hour == 12) {
			ampm = true;
		}
		else if(hour > 12) {
			ampm = true;
			hour1 = hour - 12;
		}
		
		if(hour1 < 10) {
			sb.append("0" + hour1 + ":");
		}
		else {
			sb.append(hour1 + ":");
		}
		
		if(minute < 10) {
			sb.append("0" + minute + ":");
		}
		else {
			sb.append(minute + ":");
		}
		
		if(second < 10) {
			sb.append("0" + second);
		}
		else {
			sb.append(second);
		}
		
		if(!ampm) {
			sb.append(" AM");
		}
		else {
			sb.append(" PM");
		}
		
		return sb.toString();
	}
	
	public Time add(Time t1, Time t2) {
		int newHour = t1.hour + t2.hour;
		int newMinute = t1.minute + t2.minute;
		int newSecond = t1.second + t2.second;
		
		if (newSecond >= 60) {
	        newSecond -= 60;
	        newMinute++;
	    }

	    if (newMinute >= 60) {
	        newMinute -= 60;
	        newHour++;
	    }

	    if (newHour >= 24) {
	        newHour -= 24;
	    }
	    
	    return new Time(newHour, newMinute, newSecond);
		
	}

	public static void main(String[] args) {
		Time t = new Time(23, 5, 6);
		System.out.println(t.toUniversal());
		System.out.println(t.toStandart());
		Time t2 = new Time(4, 24, 33);
		t = t.add(t, t2);
		System.out.println(t.toUniversal());
	}

}
