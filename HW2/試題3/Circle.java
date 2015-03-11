import java.util.*;
class Circle {
	double r;
	Circle(double r) {
		this.r = r;
	}
	double area() {
		return 3.14 * r * r;
	}
	double Arc(double angle){  //����
		return 3.14*2*r*(angle/360);
	}
	double Pie(double angle){  //���n
		return area()*(angle/360);
	}
	public static void main(String[] args) {
		Circle[] c = new Circle[3];
		Scanner input=new Scanner(System.in);
		
		for(int i=0;i<3;i++){
			double in=-1;	
			while(in<0){			
				try{
					System.out.print("��"+(i+1)+"�b�|:");
					in=input.nextDouble();
					c[i]=new Circle(in);
				}catch(Exception e){
					System.out.println("��J���~");
				}
			}
		}
		try{
			System.out.print("�s��:");
			int n=input.nextInt();
			if(n>=1&&n<=3){
				double a=-1;
				while(a<0 || a>360){
					try{
						System.out.print("����:");
						a=input.nextDouble();
						if(a<0 || a>360){
							System.out.println("��J���~");
						}
						else{
							System.out.print("����:"+c[n-1].Arc(a)+"���n:"+c[n-1].Pie(a));
						}
					}catch(Exception e){
						System.out.println("��J���~");
					}
				}
			}
			else{
				System.out.println("�d�L�s��");
			}
		}catch(Exception e){
			System.out.println("��J���~");
		}
		
	}
}