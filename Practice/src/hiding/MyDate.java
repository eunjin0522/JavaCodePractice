package hiding;

public class MyDate {
	public int day;
	public int month;
	public int year;
	
	public void setDay(int day) {
		if(month == 2) {
			if(day< 1|| day >28) {
				System.out.println("오류입니다.");
			}else {
				this.day = day;
			}
		}
	}
	
}
