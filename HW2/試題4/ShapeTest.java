import java.util.*;
abstract class Shape {
	abstract double area();
	abstract void what();
}
class Circle extends Shape {
	double r;
	public Circle(double r) {
		this.r = r;
	}
	public double area() {
		return 3.14 * r * r;
	}
	public void what(){
		System.out.print("圓形");
	}
}
class Rectangle extends Shape {
	double width, height;
	public Rectangle(double w, double h) {
		this.width = (double)w;
		this.height = (double)h;
	}
	public double area() {
		return width*height;
	}
	public void what(){
		System.out.print("矩形");
	}
}
class Triangle extends Shape{
	double width, height;
	public Triangle(double w, double h){
		this.width = w;
		this.height = h;
	}
	public double area() {
		return width*height/2;
	}
	public void what(){
		System.out.print("三角形");
	}
}
class ShapeTest {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Shape shapes[] = new Shape[3];
		for(int i=0;i<3;i++){
			int opt=-1;
			try{
				System.out.print("圖形1:1)圓形. 2)矩形. 3)三角形.");
				opt=input.nextInt();
			}
			catch(Exception e){
				System.out.println("輸入錯誤");
				input.next();
				i--;
			}	
			if(opt==1){//圓
				double r;
				while(true){
					try{
						System.out.print("半徑:");
						r=input.nextDouble();
						if(r>0)
							break;
					}
					catch(Exception e){
						System.out.println("輸入錯誤");
						input.next();
					}
				}
				shapes[i]=new Circle(r);
			}
			else if(opt==2){//矩形
				double w,h;
				while(true){
					try{
						System.out.print("長:");
						w=input.nextFloat();
						if(w>0)
							break;
					}
					catch(Exception e){
						System.out.println("輸入錯誤");
						input.next();
					}
				}
				while(true){
					try{
						System.out.print("寬:");
						h=input.nextFloat();
						if(h>0)
							break;
					}
					catch(Exception e){
						System.out.println("輸入錯誤");
						input.next();
					}
				}
				shapes[i]=new Rectangle(w,h);
			}
			else if(opt==3){//三角形
				double w,h;
				while(true){
					try{
						System.out.print("底:");
						w=input.nextDouble();
						if(w>0)
							break;
					}
					catch(Exception e){
						System.out.println("輸入錯誤");
						input.next();
					}
				}
				while(true){
					try{
						System.out.print("高:");
						h=input.nextDouble();
						if(h>0)
							break;
					}
					catch(Exception e){
						System.out.println("輸入錯誤");
						input.next();
					}
				}
				shapes[i]=new Triangle(w,h);
			}
			else{
				System.out.println("輸入錯誤");
				i--;
			}
		}
		for(int i=0;i<3;i++){
			System.out.print("圖形"+(i+1)+":");
			shapes[i].what();
			System.out.printf("面積:%.2f\n",shapes[i].area());			
		}
	}
 }