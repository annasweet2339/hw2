import java.util.*;
class p3 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		try{
			System.out.print("輸入西元年:");
			int year=input.nextInt();
			System.out.print("閏年:");
			for(int i=1;i<year;i++){
				if(i%400==0||(i%4==0&&i%100!=0)){
					System.out.print(" "+i);
				}
			}
			System.out.println();
		}catch(Exception e){
			System.out.println("Error!");
		}
	}
}