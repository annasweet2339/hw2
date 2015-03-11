import java.util.*;
class Circle {
	double r;
	Circle(double r) {
		this.r = r;
	}
	double area() {
		return 3.14 * r * r;
	}
	double Arc(double angle){  //弧長
		return 3.14*2*r*(angle/360);
	}
	double Pie(double angle){  //面積
		return area()*(angle/360);
	}
	public static void main(String[] args) {
		Circle[] c = new Circle[3];
		Scanner input=new Scanner(System.in);
		
		for(int i=0;i<3;i++){
			double in=-1;	
			while(in<0){			
				try{
					System.out.print("圓"+(i+1)+"半徑:");
					in=input.nextDouble();
					c[i]=new Circle(in);
				}catch(Exception e){
					System.out.println("輸入錯誤");
				}
			}
		}
		try{
			System.out.print("編號:");
			int n=input.nextInt();
			if(n>=1&&n<=3){
				double a=-1;
				while(a<0 || a>360){
					try{
						System.out.print("角度:");
						a=input.nextDouble();
						if(a<0 || a>360){
							System.out.println("輸入錯誤");
						}
						else{
							System.out.print("弧長:"+c[n-1].Arc(a)+"面積:"+c[n-1].Pie(a));
						}
					}catch(Exception e){
						System.out.println("輸入錯誤");
					}
				}
			}
			else{
				System.out.println("查無編號");
			}
		}catch(Exception e){
			System.out.println("輸入錯誤");
		}
		
	}
}