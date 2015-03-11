import java.util.*;
class p1 {
	public static void main(String[] args) {
		int hour1=4,min1=23,sec1=45;
		int hour2=13,min2=54,sec2=23;
		int t1=hour1*60*60+min1*60+sec1;
		int t2=hour2*60*60+min2*60+sec2;
		System.out.println("4點23分45秒到13點54分23秒相差"+(t2-t1)+"秒");
	}
}