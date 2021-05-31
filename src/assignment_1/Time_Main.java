package assignment_1;


class Time
{
	private int hour , min , sec;
	Time(int hour, int min , int sec)
	{
		this.hour = hour;
		this.min = min;
		this.sec = sec;
	}
	
	void add(Time t)
	{
		System.out.println(t.hour + t.min + t.sec);
		return;
	}
}
public class Time_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Time t1 = new Time(14, 34, 54);
		Time t2 = new Time(6, 32, 36);
		
		t1.add(t1);
		t2.add(t2);

	}

}
