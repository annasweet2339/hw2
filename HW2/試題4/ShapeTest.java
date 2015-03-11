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
		System.out.print("���");
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
		System.out.print("�x��");
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
		System.out.print("�T����");
	}
}
class ShapeTest {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Shape shapes[] = new Shape[3];
		for(int i=0;i<3;i++){
			int opt=-1;
			try{
				System.out.print("�ϧ�1:1)���. 2)�x��. 3)�T����.");
				opt=input.nextInt();
			}
			catch(Exception e){
				System.out.println("��J���~");
				input.next();
				i--;
			}	
			if(opt==1){//��
				double r;
				while(true){
					try{
						System.out.print("�b�|:");
						r=input.nextDouble();
						if(r>0)
							break;
					}
					catch(Exception e){
						System.out.println("��J���~");
						input.next();
					}
				}
				shapes[i]=new Circle(r);
			}
			else if(opt==2){//�x��
				double w,h;
				while(true){
					try{
						System.out.print("��:");
						w=input.nextFloat();
						if(w>0)
							break;
					}
					catch(Exception e){
						System.out.println("��J���~");
						input.next();
					}
				}
				while(true){
					try{
						System.out.print("�e:");
						h=input.nextFloat();
						if(h>0)
							break;
					}
					catch(Exception e){
						System.out.println("��J���~");
						input.next();
					}
				}
				shapes[i]=new Rectangle(w,h);
			}
			else if(opt==3){//�T����
				double w,h;
				while(true){
					try{
						System.out.print("��:");
						w=input.nextDouble();
						if(w>0)
							break;
					}
					catch(Exception e){
						System.out.println("��J���~");
						input.next();
					}
				}
				while(true){
					try{
						System.out.print("��:");
						h=input.nextDouble();
						if(h>0)
							break;
					}
					catch(Exception e){
						System.out.println("��J���~");
						input.next();
					}
				}
				shapes[i]=new Triangle(w,h);
			}
			else{
				System.out.println("��J���~");
				i--;
			}
		}
		for(int i=0;i<3;i++){
			System.out.print("�ϧ�"+(i+1)+":");
			shapes[i].what();
			System.out.printf("���n:%.2f\n",shapes[i].area());			
		}
	}
 }