import java.util.*;
class p1 {
	public static void main(String[] args) {
		System.out.print("輸入姓名及西元生日:");
		Scanner op = new Scanner(System.in);
		String name=op.next();
		int year=op.nextInt();
		int month=op.nextInt();
		int day=op.nextInt();
		year-=1911;
		if(year>=1911){
			if(month>0 && month<=12){
				if(((month==1&&month==3&&month==5&&month==7&&month==8&&month==10&&month==12)&&(day>0&&day<=31)) || ((month==4&&month==6&&month==9&&month==11)&&(day>0&&day<=30)) || (month==2&&day<28)){
					System.out.println("姓名:"+name+"生日:民國"+year+"年"+month+"月"+day+"日");
				}
				else
					System.out.println("錯誤!!");
			}
			else
				System.out.println("錯誤!!");
		}
		else{
			System.out.println("錯誤!!");
		}
	}
}